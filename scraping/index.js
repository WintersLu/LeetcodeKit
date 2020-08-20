'use strict';

const rp = require('request-promise');
const fs = require('fs');
const allproblems_json = 'https://leetcode.com/api/problems/all/'

rp(allproblems_json)
.then(function(json){

    console.log("Parsing from web...");
    var question_list = JSON.parse(json.toString()).stat_status_pairs;
    var question_names = [];
    question_list.map(function(item){
        question_names.push(item['stat']['question__title'].replace(/[^a-zA-Z]/g, ''));
    })

    fs.mkdirSync('../src/main/java/leetcode', { recursive: true }, (err) => {
        console.log('Create directory...')
        if (err) throw err;
    });

    console.log("Begin to write into files...");
    question_names.map(function(name){

        if (fs.existsSync('../src/main/java/leetcode/'+ name + '.java')) {
            console.log(name + '.java file exists. skip...');
            return;
        }

        fs.readFile( 'template', function (err, data) {
            if (err) throw err;
            var template_content = data.toString().replace('NAME_HERE', name);
            fs.writeFile('../src/main/java/leetcode/'+ name + '.java', template_content, function (err, file) {
                if (err) console.log(err);
            });
        });
    })
    console.log('Done!');

})
.catch(function(err){
    console.log(err);
});