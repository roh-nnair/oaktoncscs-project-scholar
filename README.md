# oaktoncscs-project-scholar

A web application that helps students in their college search by recommending colleges from across the country based on their grades, academic interest, extracurricular activities, lifestyle, location, etc. Our target audience will be college applicants.

## Tasking

Heres the who's who of this project. If you are experienced in Java read the "Java Devs" section. Otherwise, skip to the "Web Devs" section.

### Java Devs

- For those who are experienced in Java, you should focus on the Controller Servlet and Model class development. Here,
you will be focusing on the logic that goes behind acquiring and adding the data that is needed for this app to work properly. Whether it be
injecting new users into the SQL database, retrieving user data from these databases, or querying colleges from an external
database.

### Web Devs

For those who don't know Java, it'll be hard for you to contribute to the server-side development of the Controller Servlet and model.
It would be best for to focus on the front-end development (HTML, CSS, Javascript) of the project.
HTML, CSS, and Javascript are extremely easy for you to learn on your own and there are an abundance of online sources that can teach you everything you need to know about frontend development with these languages.
This portion of the project is extremely important as we want people to feel comfortable and engaged in interacting with our web app (AKA UX).

- If you are looking to learn start here: https://www.freecodecamp.org/learn.
- If you just need a reference, a great resource is located here https://developer.mozilla.org/en-US/docs/Web.

When you are ready to get coding, check the TODO.md list or start by thinking what pages this site might need, and then create the new web pages and make them look awesome.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Requirements

A laptop and a motivation to learn and contribute. No experience is required to contribute. For beginners and
advanced developers alike, there'll always be ways for you to contribute to this project.

### Prerequisites

Here are some things you will need to get running (see the "Built With" section for links):

```
1. No matter what you will need Atom
2. If you are doing Java development you will need Eclipse
```

### Installing

The first thing you need to do is clone this repository onto your laptop, so you can start coding.

We will be using Atom to develop HTML + CSS as well as share our commits to the repository,

```
1. Open Atom
2. Press Ctrl + Shift + P
3. Type in clone
4. Then click "GitHub clone"
5. Go to https://github.com/CoffeeMeat/oaktoncscs-project-scholar
6. Click on the green "clone or download" button and copy the link
*Before you do step 7, make sure that you're about to clone into a folder you want to use for your eclipse workspace.
7. Go back to atom and paste the link in the URL bar
8. Do whatever authentication Atom asks you to do
9. Viola! The repository is now on your computer!
```

Unless you guys happen to have git bash installed on your computer, you guys will mainly be using atom for its git functionality to push and pull commits to and from the remote repository. (I'll explain this in a bit)

We will be using Eclipse to develop the backend application as it has many useful utilities preinstalled and snippets that will make web app development much more fluid.

Here's the process of using eclipse to start developing code in the repo.

```
1. Open eclipse in the workspace you cloned the repo in
2. If the project doesn't show up in the project explorer, then click on File at the top right, select oaktoncscs-project-scholar, then click finish.
```

Now that the project is in our project explorer, let's explain how we'll be developing code.

## Development

The main rule that WE MUST FOLLOW is ***DO NOT MAKE COMMITS TO THE MASTER BRANCH***. The master branch is the branch where everything is supposed to work. We don't want it to be messed up by unfinished features. So, how do we make new branches and work on them? I'm glad you asked:

```
1. Open up the project folder in Atom
2. In the bottom right corner, you should see a button that says "master." This indicates that you're on the master branch (**WHERE YOU SHOULDN'T BE**).
3. To create a new branch for developing a feature, click on master, then click on new branch.
4. Type in a name for your new branch relative to the feature (EX: contact us page branch might be called "contact-us").
5. Go to the bottom right and click on the Publish button -- this basically uploads your branch to the remote repo on GitHub.
6. Congrats you made a new branch.
7. To move into this new branch you made, click on the branch button in the bottom right and click on the branch you made from the drop down menu. If it says that you're on your branch at the bottom right and NOT the master branch, then you're good to go. You can now open eclipse and start coding away.
```
Make sure to push as often as is reasonable.

### Where to create files

Now you must be confused where to create files in this confusing file system. Let me explain:

- For the Servlet and Model developers who will be coding Java classes, all Java classes will go under Java Resources/src/UserUtils
- For you web developers, all of your web pages will go under WebContent and your css pages will go under WebContent/css.

Next, I'll teach you guys how we're going to collaborate by making commits and pushing and pulling them from GitHub.

- Once you've made some changes to your code and saved everything **IN YOUR BRANCH**, you're going to head over to Atom.

```
1. In Atom, we'll go down to the bottom left corner and left click on the fetch/pull button.
2. From the options we're first going to click on pull.
3. After we've done a bit of coding, we must now click push.
```
- When we pull, we're essentially pulling all of the commits that have been made on the remote repository to the local repo we made on our computer. This ensures that our local repo is up to date with the current version.
- When we push, we're pushing all of the commits we have made on our computer onto the remote repository. This is how everybody will be able to see, acknowledge, and edit the changes you have made.

The remote repository on GitHub is what's bridging our collaboration.

### Important things to remember

**PLEASE NOTE:** When you make a branch on your local repo, it is *YOUR* branch and therefore only *YOU* can push commits to it. After you make a branch and publish it to GitHub, everyone can see it. However, when everybody pulls commits from the remote repo, it will **ONLY** pull commits from the master branch, **NOT** any branches you have made. This means that even though you're pushing commits from your branch to GitHub, and everyone can see these commits under your branch, when other people pull, they will not have your branch in their local repo and vice versa.

Once you're done with all of the changes and features you wanted to make in your branch, you must make a pull request. To do this:

```
1. Go to the oaktoncscs-project-scholar repo on GitHub
2. Switch to your branch, and say make a pull request.
  - When you make a pull request, PLEASE include an explanation as to what features you have added and what files you have edited/added/deleted. Rohan, the dictator of this project, will review your request and determine if it's worthy of being pulled into the master-branch.
```

**ATTENTION ALL SERVER SIDE DEVELOPERS:** I will be posting how to code and develop for the Servlet Controller and Model developers in a text file called Servlet-Tutorial.txt.

### And coding style tests

Please follow these formatting rules when writing your code to maintain readability and overall collaboration:

#### HTML:

- **Don't use tabs**; use spaces only. Different text editors interpret tabs differently, and some Markdown features expect spaces and not tabs. You can however tell your code editor to process the tab key as 2 spaces.
- **Indent by 2 spaces** per indentation level.
- **Use all-lowercase** for elements and attributes.
- **Don't leave trailing spaces** at the end of a line. (Except as needed for Markdown.)
- **Break lines at 80 characters** except in the following cases:

  If a URL in a link has a line break, the link won't work. If a URL is longer than 80 characters (quite common), you're stuck with it. In that case, put the URL on its own line with the href attribute to make it easier to review the text before and after, as the following example shows:
  ```
    You can find more information in <a
    href="https://example.com/long-url/johan-gambolputty-de-von-ausfern-…-von-hautkopf-of-ulm.html"
    class="external-link">his biography.</a>
  ```

Break code snippets (in <pre> blocks) at 80 characters.

#### CSS:

- **Use valid CSS where possible.**; Unless dealing with CSS validator bugs or requiring proprietary syntax, use valid CSS code.
- **Use meaningful or generic ID and class names.**; Use ID and class names that are as short as possible but as long as necessary.
- **Avoid qualifying ID and class names with type selectors.**; Unless necessary (for example with helper classes), do not use element names in conjunction with IDs or classes.

#### JAVA:
```
```

## Built With

* [Eclipse](https://www.eclipse.org/downloads/packages/release/kepler/sr1/eclipse-ide-java-developers) - The Java IDE used
* [Atom](https://atom.io/) - Code editor and version control

## Contributing

For anyone outside of Oakton CSCS Club please read [CONTRIBUTING.md]() for details on our code of conduct, and the process for submitting pull requests to us.

## Authors

* **Rohan Nair** - *Project Leader* - [CoffeeMeat](https://github.com/CoffeeMeat)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used and not mentioned here
* Oakton CSCS club for sponsoring us
