# nanodegree_project3_superduo
Super Duo project.

## Author
[Ferran Negre Pizarro](https://profiles.udacity.com/u/ferrannegre)

## Note
- All extra comments in the code (from me) are marked with a @fnp tag so its easy to search

## Alexandria app
- Fixed navigation drawer / back button / backstack
- Closing keyboard (from EditText) if we navigate away (changing fragment)
- Both loaders from ListOfBooks and BookDetail are tied to the same activity so they need unique id
- Moved hardcoded string "pref_startFragment" to strings.xml as non translatable
- Removed TODOs and added some padding in the About section
- Clear fields when saving/deleting from AddBook
- Fixed clearing fields when adding/removing a letter once a correct book was found
(this is the implicit bug from "Sometimes when I add a book and don’t double-check the ISBN,
it just disappears!")
- Check for Internet connection on BookService (this is the implicit bug from
"It also crashed on me when I tried to add the book my sister was reading on the flight to London.")
- Added scan ISBN functionality without external app
(using [zxing-android-embedded](https://github.com/journeyapps/zxing-android-embedded))

## Scores app
- Using correct season id for the API
- Added Collection Widget for Today's Matches
- Using strings that were declared but not used (specially inside Utility class)
- Added missing contentDescriptions
- Added supportsRtl (right-to-left)

## More (for both apps)
- Deleted app-release.apk file