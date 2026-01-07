{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/WordUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WordUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 642,
      "comment": "\n * \u003cp\u003eOperations on Strings that contain words.\u003c/p\u003e\n * \n * \u003cp\u003eThis class tries to handle \u003ccode\u003enull\u003c/code\u003e input gracefully.\n * An exception will not be thrown for a \u003ccode\u003enull\u003c/code\u003e input.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n * \n * @author Apache Jakarta Velocity\n * @author Stephen Colebourne\n * @author \u003ca href\u003d\"mailto:hps@intermeta.de\"\u003eHenning P. Schmiedehausen\u003c/a\u003e\n * @author Gary Gregory\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.WordUtils.WordUtils()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eWordUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming. Instead, the class should be used as\n     * \u003ccode\u003eWordUtils.wrap(\"foo bar\", 20);\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 44,col 7)-(line 44,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.WordUtils.wrap(java.lang.String, int)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * \u003cp\u003eWraps a single line of text, identifying words by \u003ccode\u003e\u0027 \u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eNew lines will be separated by the system property line separator.\n     * Very long words, such as URLs will \u003ci\u003enot\u003c/i\u003e be wrapped.\u003c/p\u003e\n     * \n     * \u003cp\u003eLeading spaces on a new line are stripped.\n     * Trailing spaces are not stripped.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.wrap(null, *) \u003d null\n     * WordUtils.wrap(\"\", *) \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be word wrapped, may be null\n     * @param wrapLength  the column to wrap the words at, less than 1 is treated as 1\n     * @return a line with newlines inserted, \u003ccode\u003enull\u003c/code\u003e if null input\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.WordUtils.wrap(java.lang.String, int, java.lang.String, boolean)",
      "begin_line": 163,
      "end_line": 216,
      "comment": "\n     * \u003cp\u003eWraps a single line of text, identifying words by \u003ccode\u003e\u0027 \u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eLeading spaces on a new line are stripped.\n     * Trailing spaces are not stripped.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * WordUtils.wrap(null, *, *, *) \u003d null\n     * WordUtils.wrap(\"\", *, *, *) \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be word wrapped, may be null\n     * @param wrapLength  the column to wrap the words at, less than 1 is treated as 1\n     * @param newLineStr  the string to insert for a new line, \n     *  \u003ccode\u003enull\u003c/code\u003e uses the system property line separator\n     * @param wrapLongWords  true if long words (such as URLs) should be wrapped\n     * @return a line with newlines inserted, \u003ccode\u003enull\u003c/code\u003e if null input\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 43)",
        "(line 174,col 9)-(line 174,col 23)",
        "(line 175,col 9)-(line 175,col 74)",
        "(line 177,col 9)-(line 210,col 9)",
        "(line 213,col 9)-(line 213,col 50)",
        "(line 215,col 9)-(line 215,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.WordUtils.capitalize(java.lang.String)",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * \u003cp\u003eCapitalizes all the whitespace separated words in a String.\n     * Only the first letter of each word is changed. To convert the \n     * rest of each word to lowercase at the same time, \n     * use {@link #capitalizeFully(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * Capitalization uses the unicode title case, normally equivalent to\n     * upper case.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.capitalize(null)        \u003d null\n     * WordUtils.capitalize(\"\")          \u003d \"\"\n     * WordUtils.capitalize(\"i am FINE\") \u003d \"I Am FINE\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to capitalize, may be null\n     * @return capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see #uncapitalize(String)\n     * @see #capitalizeFully(String)\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.WordUtils.capitalize(java.lang.String, char[])",
      "begin_line": 275,
      "end_line": 297,
      "comment": "\n     * \u003cp\u003eCapitalizes all the delimiter separated words in a String.\n     * Only the first letter of each word is changed. To convert the \n     * rest of each word to lowercase at the same time, \n     * use {@link #capitalizeFully(String, char[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe delimiters represent a set of characters understood to separate words.\n     * The first string character and the first non-delimiter character after a\n     * delimiter will be capitalized. \u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * Capitalization uses the unicode title case, normally equivalent to\n     * upper case.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.capitalize(null, *)            \u003d null\n     * WordUtils.capitalize(\"\", *)              \u003d \"\"\n     * WordUtils.capitalize(*, new char[0])     \u003d *\n     * WordUtils.capitalize(\"i am fine\", null)  \u003d \"I Am Fine\"\n     * WordUtils.capitalize(\"i aM.fine\", {\u0027.\u0027}) \u003d \"I aM.Fine\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to capitalize, may be null\n     * @param delimiters  set of characters to determine capitalization, null means whitespace\n     * @return capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see #uncapitalize(String)\n     * @see #capitalizeFully(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 69)",
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 34)",
        "(line 281,col 9)-(line 281,col 55)",
        "(line 282,col 9)-(line 282,col 38)",
        "(line 283,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.WordUtils.capitalizeFully(java.lang.String)",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * \u003cp\u003eConverts all the whitespace separated words in a String into capitalized words, \n     * that is each word is made up of a titlecase character and then a series of \n     * lowercase characters.  \u003c/p\u003e\n     *\n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * Capitalization uses the unicode title case, normally equivalent to\n     * upper case.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.capitalizeFully(null)        \u003d null\n     * WordUtils.capitalizeFully(\"\")          \u003d \"\"\n     * WordUtils.capitalizeFully(\"i am FINE\") \u003d \"I Am Fine\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to capitalize, may be null\n     * @return capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.WordUtils.capitalizeFully(java.lang.String, char[])",
      "begin_line": 349,
      "end_line": 356,
      "comment": "\n     * \u003cp\u003eConverts all the delimiter separated words in a String into capitalized words, \n     * that is each word is made up of a titlecase character and then a series of \n     * lowercase characters. \u003c/p\u003e\n     *\n     * \u003cp\u003eThe delimiters represent a set of characters understood to separate words.\n     * The first string character and the first non-delimiter character after a\n     * delimiter will be capitalized. \u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * Capitalization uses the unicode title case, normally equivalent to\n     * upper case.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.capitalizeFully(null, *)            \u003d null\n     * WordUtils.capitalizeFully(\"\", *)              \u003d \"\"\n     * WordUtils.capitalizeFully(*, null)            \u003d *\n     * WordUtils.capitalizeFully(*, new char[0])     \u003d *\n     * WordUtils.capitalizeFully(\"i aM.fine\", {\u0027.\u0027}) \u003d \"I am.Fine\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to capitalize, may be null\n     * @param delimiters  set of characters to determine capitalization, null means whitespace\n     * @return capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 69)",
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 32)",
        "(line 355,col 9)-(line 355,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.WordUtils.uncapitalize(java.lang.String)",
      "begin_line": 376,
      "end_line": 378,
      "comment": "\n     * \u003cp\u003eUncapitalizes all the whitespace separated words in a String.\n     * Only the first letter of each word is changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.uncapitalize(null)        \u003d null\n     * WordUtils.uncapitalize(\"\")          \u003d \"\"\n     * WordUtils.uncapitalize(\"I Am FINE\") \u003d \"i am fINE\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to uncapitalize, may be null\n     * @return uncapitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see #capitalize(String)\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.WordUtils.uncapitalize(java.lang.String, char[])",
      "begin_line": 405,
      "end_line": 427,
      "comment": "\n     * \u003cp\u003eUncapitalizes all the whitespace separated words in a String.\n     * Only the first letter of each word is changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe delimiters represent a set of characters understood to separate words.\n     * The first string character and the first non-delimiter character after a\n     * delimiter will be uncapitalized. \u003c/p\u003e\n     *\n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.uncapitalize(null, *)            \u003d null\n     * WordUtils.uncapitalize(\"\", *)              \u003d \"\"\n     * WordUtils.uncapitalize(*, null)            \u003d *\n     * WordUtils.uncapitalize(*, new char[0])     \u003d *\n     * WordUtils.uncapitalize(\"I AM.FINE\", {\u0027.\u0027}) \u003d \"i AM.fINE\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to uncapitalize, may be null\n     * @param delimiters  set of characters to determine uncapitalization, null means whitespace\n     * @return uncapitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see #capitalize(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 69)",
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 34)",
        "(line 411,col 9)-(line 411,col 55)",
        "(line 412,col 9)-(line 412,col 40)",
        "(line 413,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.WordUtils.swapCase(java.lang.String)",
      "begin_line": 452,
      "end_line": 482,
      "comment": "\n     * \u003cp\u003eSwaps the case of a String using a word based algorithm.\u003c/p\u003e\n     * \n     * \u003cul\u003e\n     *  \u003cli\u003eUpper case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eTitle case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eLower case character after Whitespace or at start converts to Title case\u003c/li\u003e\n     *  \u003cli\u003eOther Lower case character converts to Upper case\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.swapCase(null)                 \u003d null\n     * StringUtils.swapCase(\"\")                   \u003d \"\"\n     * StringUtils.swapCase(\"The dog has a BONE\") \u003d \"tHE DOG HAS A bone\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to swap case, may be null\n     * @return the changed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 19)",
        "(line 454,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 55)",
        "(line 459,col 9)-(line 459,col 34)",
        "(line 460,col 9)-(line 460,col 20)",
        "(line 461,col 9)-(line 461,col 21)",
        "(line 463,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.WordUtils.initials(java.lang.String)",
      "begin_line": 507,
      "end_line": 509,
      "comment": "\n     * \u003cp\u003eExtracts the initial letters from each word in the String.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe first letter of the string and all first letters after\n     * whitespace are returned as a new string.\n     * Their case is not changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.initials(null)             \u003d null\n     * WordUtils.initials(\"\")               \u003d \"\"\n     * WordUtils.initials(\"Ben John Lee\")   \u003d \"BJL\"\n     * WordUtils.initials(\"Ben J.Lee\")      \u003d \"BJ\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get initials from, may be null\n     * @return String of initial letters, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see #initials(String,char[])\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.WordUtils.initials(java.lang.String, char[])",
      "begin_line": 538,
      "end_line": 562,
      "comment": "\n     * \u003cp\u003eExtracts the initial letters from each word in the String.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe first letter of the string and all first letters after the\n     * defined delimiters are returned as a new string.\n     * Their case is not changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the delimiters array is null, then Whitespace is used.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty delimiter array returns an empty String.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.initials(null, *)                \u003d null\n     * WordUtils.initials(\"\", *)                  \u003d \"\"\n     * WordUtils.initials(\"Ben John Lee\", null)   \u003d \"BJL\"\n     * WordUtils.initials(\"Ben J.Lee\", null)      \u003d \"BJ\"\n     * WordUtils.initials(\"Ben J.Lee\", [\u0027 \u0027,\u0027.\u0027]) \u003d \"BJL\"\n     * WordUtils.initials(*, new char[0])         \u003d \"\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to get initials from, may be null\n     * @param delimiters  set of characters to determine words, null means whitespace\n     * @return String of initial letters, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see #initials(String)\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 545,col 34)",
        "(line 546,col 9)-(line 546,col 46)",
        "(line 547,col 9)-(line 547,col 22)",
        "(line 548,col 9)-(line 548,col 34)",
        "(line 549,col 9)-(line 560,col 9)",
        "(line 561,col 9)-(line 561,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.WordUtils.isDelimiter(char, char[])",
      "begin_line": 572,
      "end_line": 582,
      "comment": "\n     * Is the character a delimiter.\n     *\n     * @param ch  the character to check\n     * @param delimiters  the delimiters\n     * @return true if it is a delimiter\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 581,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.WordUtils.abbreviate(java.lang.String, int, int, java.lang.String)",
      "begin_line": 605,
      "end_line": 640,
      "comment": "\n     * Abbreviates a string nicely.\n     * \n     * This method searches for the first space after the lower limit and abbreviates\n     * the String there. It will also append any String passed as a parameter\n     * to the end of the String. The upper limit can be specified to forcibly\n     * abbreviate a String.\n     * \n     * @param str         the string to be abbreviated. If null is passed, null is returned.\n     *                    If the empty String is passed, the empty string is returned.\n     * @param lower       the lower limit.\n     * @param upper       the upper limit; specify -1 if no limit is desired.\n     *                    If the upper limit is lower than the lower limit, it will be\n     *                    adjusted to be the same as the lower limit.\n     * @param appendToEnd String to be appended to the end of the abbreviated string.\n     *                    This is appended ONLY if the string was indeed abbreviated.\n     *                    The append does not count towards the lower or upper limits.\n     * @return the abbreviated String.\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 612,col 9)",
        "(line 616,col 9)-(line 618,col 9)",
        "(line 620,col 9)-(line 622,col 9)",
        "(line 624,col 9)-(line 624,col 49)",
        "(line 625,col 9)-(line 625,col 57)",
        "(line 626,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 639,col 33)"
      ]
    }
  ]
}