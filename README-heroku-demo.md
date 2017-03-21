Before you start, don't forget to commit your changes to git:
`git add . && git commit -m "Deploying to heroku"`

Then, deploy to heroku:

1.  `heroku login`
2.  `heroku create`
3.  `git push heroku master`

To view logs: `heroku logs -t`

To scale: `heroku ps:scale web=2`
