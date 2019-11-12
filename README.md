# oaktoncscs-project-scholar
A web application that helps students in their college search by recommending colleges from across the country based on their grades, academic interest, extracurricular activities, lifestyle, location, etc.

Target audience: College applicants

Requirements for development: A laptop and a motivation to learn and contribute. No experience is required to contribute. For beignners and
advanced developers alike, there'll always be ways for you to contribute to this project.

Target task for those who are experienced in Java:
  - For those who are experienced in Java, I want you guys to focus on the Controller Servlet and Model class development. Here,
  you guys will be focusing on the business logic that goes behind acquiring and adding the data that is needed. Whether it be
  injecting new users into the SQL database, retrieving user data from these databases, or querying colleges from an external 
  database.

Target task for those who don't know anything about Java:
  - For those who don't know Java, it'll be hard for you to contribute to the server-side development of the Controller Servlet and model.
  That's why I would like you guys to focus on the front-end development (HTML, CSS, Javascript) of webpages. The reason for this
  is that these three languages, in my opinion, are extremely easy for you guys to learn on your own. There is a ubiquity
  of online sources that can teach you everything you need to know about frontend development with these languages. This portion of
  the project is extremely important as we want people to feel comfortable and engaged in interacting with our web app. A great
  resource for learning practically everything you need to know is located here https://developer.mozilla.org/en-US/docs/Web. Your
  main job is to research front end web page development on this site, learn a lot of stuff, and apply that studd into creating
  new web pages and making them look awesome.
  
Now, let's get into how to actually develop on this project:
  - The first thing you need to do is clone this repository onto your laptop, so you can use eclipse to develop what you need to develop and atom to share your commits to the remote repository. Here's how you do that:
    1. Open atom
    2. Press Ctrl + Shift + P.
    3. Type in clone
    4. Then press GitHub clone
    5. Go to github.com and access the oaktoncscs-project-scholar repo that I invited you to collaborate on
    6. Click on clone or download and copy the link.
    *Before you do step 7, make sure that you're about to clone in your eclipse workspace. 
    7. Go back to atom and paste the link in the URL bar
    8. do whatever authentication atom asks you to do
    9. Viola! The repository is now on your computer!
  - Unless you guys happen to have git bash installed on your computer, you guys will mainly be using atom for its git functionality to push and pull commits to and from the remote repository. (I'll explain this in a bit)
  - Anyways, moving on to development itself. We will be using Eclipse to develop the web application as it has many useful utilities preinstalled and snippets that will make web app development much more fluid. 
  - Here's the process of using eclipse to start developing code in the repo.
    1. open eclipse in the workspace you cloned the repo in
    2. if the project doesn't show up in the project explorer, then click on File at the top right, select oaktoncscs-project-scholar, then click finish.
  - Now that the project is in our project explorer, let's explain how we'll be developing code. 
  - The main rule that WE MUST FOLLOW is to *NOT MAKE COMMITS TO THE MASTER BRANCH*. The master branch is the branch where everything is supposed to work. I don't want it to be messed up by unfinished features. So, how do we make new branches and work on them? I'm glad you asked:
    1. Open up the project folder on Atom
    2. In the bottom right, you should see a button that says "master." This indicates that you're on the master branch (*WHERE YOU SHOULDN"T BE*).
    3. To create a new branch for yourself to develop a feature, click on master, then click on new branch.
    4. Type in a name for your new branch.
    5. Congrats, you made a new branch.
    6. To move into this new branch you made, click on the branch button in the bottom right and click on the branch you made from the drop down menu. If it says that you're on your branch at the bottom right and NOT the master branch, then you're good to go. You can now open eclipse and start coding away.
  - Now you must be confused where to create files in this confusing file system. 
    - For the Servlet and Model developers who will be coding Java classes, all Java classes will go under Java Resources/src/UserUtils
    - For you web developers, all of your web pages will go under WebContent and your css pages will go under WebContent/css.
    - Next, I'll teach you guys how we're going to collaborate by making commits and pushing and pulling them from GitHub.

  - So, once you've made some changes to your code and saved everything IN YOUR BRANCH, you're going to head over to Atom. 
  - In Atom, we'll go down to the bottom left, and left click on the fetch/pull button.
  - From the options we're first going to click on pull. When we pull, we're essentially pulling all of the commits that have been made on the remote repository to the local repo we made on our computer. This ensures that our local repo is up to date with the current version. 
  - After we're done pulling, we must now click push. When we push, we're pushing all of the commits we have made on our computer onto the remote repository. This is how everybody will be able to see, acknowledge, and edit the changes you have made. The remote repository on GitHub is what's bridging our collaboration.
  - *PLEASE NOTE: When you make a branch on your local repo, it is YOUR branch and therefore only YOU can push commits to it. After you make a branch and publish it to GitHub, sure, everyone can see it. However, when everybody pulls commits from the remote repo, it will ONLY pull commits from the master branch, NOT any branches you have made. This means that even though you're pushing commits from your branch to GitHub, and everyone can see these commits under your branch, when other people pull, they will not have your branch in their local repo and vice versa. 
  - So how exactly will the commits you make from these branches be incorporated into the master branch? Well, once you're done with all of the changes and features you wanted to make in your branch, you must make a pull request. To do this, go to the oaktoncscs-project-scholar repo on GitHub, switch to your branch, and say make a pull request. When you make a pull request, PLEASE include an explanation as to what features you have added and what files you have edited/added/deleted. I, the dictator of this project, will review your request and determine if it's worthy of being pulled into the master-branch.



  
