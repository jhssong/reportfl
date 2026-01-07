{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/text/WordUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WordUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 576,
      "comment": "\n * \u003cp\u003eOperations on Strings that contain words.\u003c/p\u003e\n * \n * \u003cp\u003eThis class tries to handle \u003ccode\u003enull\u003c/code\u003e input gracefully.\n * An exception will not be thrown for a \u003ccode\u003enull\u003c/code\u003e input.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @author Apache Jakarta Velocity\n * @author \u003ca href\u003d\"mailto:hps@intermeta.de\"\u003eHenning P. Schmiedehausen\u003c/a\u003e\n * @author Gary Gregory\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.WordUtils.WordUtils()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eWordUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming. Instead, the class should be used as\n     * \u003ccode\u003eWordUtils.wrap(\"foo bar\", 20);\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 47,col 7)-(line 47,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.wrap(java.lang.String, int)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * \u003cp\u003eWraps a single line of text, identifying words by \u003ccode\u003e\u0027 \u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eNew lines will be separated by the system property line separator.\n     * Very long words, such as URLs will \u003ci\u003enot\u003c/i\u003e be wrapped.\u003c/p\u003e\n     * \n     * \u003cp\u003eLeading spaces on a new line are stripped.\n     * Trailing spaces are not stripped.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.wrap(null, *) \u003d null\n     * WordUtils.wrap(\"\", *) \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be word wrapped, may be null\n     * @param wrapLength  the column to wrap the words at, less than 1 is treated as 1\n     * @return a line with newlines inserted, \u003ccode\u003enull\u003c/code\u003e if null input\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.wrap(java.lang.String, int, java.lang.String, boolean)",
      "begin_line": 92,
      "end_line": 145,
      "comment": "\n     * \u003cp\u003eWraps a single line of text, identifying words by \u003ccode\u003e\u0027 \u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eLeading spaces on a new line are stripped.\n     * Trailing spaces are not stripped.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * WordUtils.wrap(null, *, *, *) \u003d null\n     * WordUtils.wrap(\"\", *, *, *) \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be word wrapped, may be null\n     * @param wrapLength  the column to wrap the words at, less than 1 is treated as 1\n     * @param newLineStr  the string to insert for a new line, \n     *  \u003ccode\u003enull\u003c/code\u003e uses the system property line separator\n     * @param wrapLongWords  true if long words (such as URLs) should be wrapped\n     * @return a line with newlines inserted, \u003ccode\u003enull\u003c/code\u003e if null input\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 43)",
        "(line 103,col 9)-(line 103,col 23)",
        "(line 104,col 9)-(line 104,col 76)",
        "(line 106,col 9)-(line 139,col 9)",
        "(line 142,col 9)-(line 142,col 50)",
        "(line 144,col 9)-(line 144,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.capitalize(java.lang.String)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * \u003cp\u003eCapitalizes all the whitespace separated words in a String.\n     * Only the first letter of each word is changed. To convert the \n     * rest of each word to lowercase at the same time, \n     * use {@link #capitalizeFully(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * Capitalization uses the unicode title case, normally equivalent to\n     * upper case.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.capitalize(null)        \u003d null\n     * WordUtils.capitalize(\"\")          \u003d \"\"\n     * WordUtils.capitalize(\"i am FINE\") \u003d \"I Am FINE\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to capitalize, may be null\n     * @return capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see #uncapitalize(String)\n     * @see #capitalizeFully(String)\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.capitalize(java.lang.String, char[])",
      "begin_line": 204,
      "end_line": 226,
      "comment": "\n     * \u003cp\u003eCapitalizes all the delimiter separated words in a String.\n     * Only the first letter of each word is changed. To convert the \n     * rest of each word to lowercase at the same time, \n     * use {@link #capitalizeFully(String, char[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe delimiters represent a set of characters understood to separate words.\n     * The first string character and the first non-delimiter character after a\n     * delimiter will be capitalized. \u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * Capitalization uses the unicode title case, normally equivalent to\n     * upper case.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.capitalize(null, *)            \u003d null\n     * WordUtils.capitalize(\"\", *)              \u003d \"\"\n     * WordUtils.capitalize(*, new char[0])     \u003d *\n     * WordUtils.capitalize(\"i am fine\", null)  \u003d \"I Am Fine\"\n     * WordUtils.capitalize(\"i aM.fine\", {\u0027.\u0027}) \u003d \"I aM.Fine\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to capitalize, may be null\n     * @param delimiters  set of characters to determine capitalization, null means whitespace\n     * @return capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see #uncapitalize(String)\n     * @see #capitalizeFully(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 69)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 34)",
        "(line 210,col 9)-(line 210,col 57)",
        "(line 211,col 9)-(line 211,col 38)",
        "(line 212,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.capitalizeFully(java.lang.String)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * \u003cp\u003eConverts all the whitespace separated words in a String into capitalized words, \n     * that is each word is made up of a titlecase character and then a series of \n     * lowercase characters.  \u003c/p\u003e\n     *\n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * Capitalization uses the unicode title case, normally equivalent to\n     * upper case.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.capitalizeFully(null)        \u003d null\n     * WordUtils.capitalizeFully(\"\")          \u003d \"\"\n     * WordUtils.capitalizeFully(\"i am FINE\") \u003d \"I Am Fine\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to capitalize, may be null\n     * @return capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.capitalizeFully(java.lang.String, char[])",
      "begin_line": 278,
      "end_line": 285,
      "comment": "\n     * \u003cp\u003eConverts all the delimiter separated words in a String into capitalized words, \n     * that is each word is made up of a titlecase character and then a series of \n     * lowercase characters. \u003c/p\u003e\n     *\n     * \u003cp\u003eThe delimiters represent a set of characters understood to separate words.\n     * The first string character and the first non-delimiter character after a\n     * delimiter will be capitalized. \u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * Capitalization uses the unicode title case, normally equivalent to\n     * upper case.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.capitalizeFully(null, *)            \u003d null\n     * WordUtils.capitalizeFully(\"\", *)              \u003d \"\"\n     * WordUtils.capitalizeFully(*, null)            \u003d *\n     * WordUtils.capitalizeFully(*, new char[0])     \u003d *\n     * WordUtils.capitalizeFully(\"i aM.fine\", {\u0027.\u0027}) \u003d \"I am.Fine\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to capitalize, may be null\n     * @param delimiters  set of characters to determine capitalization, null means whitespace\n     * @return capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 69)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 32)",
        "(line 284,col 9)-(line 284,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.uncapitalize(java.lang.String)",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\n     * \u003cp\u003eUncapitalizes all the whitespace separated words in a String.\n     * Only the first letter of each word is changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.uncapitalize(null)        \u003d null\n     * WordUtils.uncapitalize(\"\")          \u003d \"\"\n     * WordUtils.uncapitalize(\"I Am FINE\") \u003d \"i am fINE\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to uncapitalize, may be null\n     * @return uncapitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see #capitalize(String)\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.uncapitalize(java.lang.String, char[])",
      "begin_line": 334,
      "end_line": 356,
      "comment": "\n     * \u003cp\u003eUncapitalizes all the whitespace separated words in a String.\n     * Only the first letter of each word is changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe delimiters represent a set of characters understood to separate words.\n     * The first string character and the first non-delimiter character after a\n     * delimiter will be uncapitalized. \u003c/p\u003e\n     *\n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.uncapitalize(null, *)            \u003d null\n     * WordUtils.uncapitalize(\"\", *)              \u003d \"\"\n     * WordUtils.uncapitalize(*, null)            \u003d *\n     * WordUtils.uncapitalize(*, new char[0])     \u003d *\n     * WordUtils.uncapitalize(\"I AM.FINE\", {\u0027.\u0027}) \u003d \"i AM.fINE\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to uncapitalize, may be null\n     * @param delimiters  set of characters to determine uncapitalization, null means whitespace\n     * @return uncapitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see #capitalize(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 69)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 34)",
        "(line 340,col 9)-(line 340,col 57)",
        "(line 341,col 9)-(line 341,col 40)",
        "(line 342,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.swapCase(java.lang.String)",
      "begin_line": 381,
      "end_line": 411,
      "comment": "\n     * \u003cp\u003eSwaps the case of a String using a word based algorithm.\u003c/p\u003e\n     * \n     * \u003cul\u003e\n     *  \u003cli\u003eUpper case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eTitle case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eLower case character after Whitespace or at start converts to Title case\u003c/li\u003e\n     *  \u003cli\u003eOther Lower case character converts to Upper case\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.swapCase(null)                 \u003d null\n     * StringUtils.swapCase(\"\")                   \u003d \"\"\n     * StringUtils.swapCase(\"The dog has a BONE\") \u003d \"tHE DOG HAS A bone\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to swap case, may be null\n     * @return the changed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 19)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 57)",
        "(line 388,col 9)-(line 388,col 34)",
        "(line 389,col 9)-(line 389,col 20)",
        "(line 390,col 9)-(line 390,col 21)",
        "(line 392,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.initials(java.lang.String)",
      "begin_line": 436,
      "end_line": 438,
      "comment": "\n     * \u003cp\u003eExtracts the initial letters from each word in the String.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe first letter of the string and all first letters after\n     * whitespace are returned as a new string.\n     * Their case is not changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.initials(null)             \u003d null\n     * WordUtils.initials(\"\")               \u003d \"\"\n     * WordUtils.initials(\"Ben John Lee\")   \u003d \"BJL\"\n     * WordUtils.initials(\"Ben J.Lee\")      \u003d \"BJ\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get initials from, may be null\n     * @return String of initial letters, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see #initials(String,char[])\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.initials(java.lang.String, char[])",
      "begin_line": 467,
      "end_line": 491,
      "comment": "\n     * \u003cp\u003eExtracts the initial letters from each word in the String.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe first letter of the string and all first letters after the\n     * defined delimiters are returned as a new string.\n     * Their case is not changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the delimiters array is null, then Whitespace is used.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty delimiter array returns an empty String.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.initials(null, *)                \u003d null\n     * WordUtils.initials(\"\", *)                  \u003d \"\"\n     * WordUtils.initials(\"Ben John Lee\", null)   \u003d \"BJL\"\n     * WordUtils.initials(\"Ben J.Lee\", null)      \u003d \"BJ\"\n     * WordUtils.initials(\"Ben J.Lee\", [\u0027 \u0027,\u0027.\u0027]) \u003d \"BJL\"\n     * WordUtils.initials(*, new char[0])         \u003d \"\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to get initials from, may be null\n     * @param delimiters  set of characters to determine words, null means whitespace\n     * @return String of initial letters, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see #initials(String)\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 470,col 9)",
        "(line 471,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 34)",
        "(line 475,col 9)-(line 475,col 46)",
        "(line 476,col 9)-(line 476,col 22)",
        "(line 477,col 9)-(line 477,col 34)",
        "(line 478,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.isDelimiter(char, char[])",
      "begin_line": 501,
      "end_line": 511,
      "comment": "\n     * Is the character a delimiter.\n     *\n     * @param ch  the character to check\n     * @param delimiters  the delimiters\n     * @return true if it is a delimiter\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 510,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.abbreviate(java.lang.String, int, int, java.lang.String)",
      "begin_line": 534,
      "end_line": 574,
      "comment": "\n     * Abbreviates a string nicely.\n     * \n     * This method searches for the first space after the lower limit and abbreviates\n     * the String there. It will also append any String passed as a parameter\n     * to the end of the String. The upper limit can be specified to forcibly\n     * abbreviate a String.\n     * \n     * @param str         the string to be abbreviated. If null is passed, null is returned.\n     *                    If the empty String is passed, the empty string is returned.\n     * @param lower       the lower limit.\n     * @param upper       the upper limit; specify -1 if no limit is desired.\n     *                    If the upper limit is lower than the lower limit, it will be\n     *                    adjusted to be the same as the lower limit.\n     * @param appendToEnd String to be appended to the end of the abbreviated string.\n     *                    This is appended ONLY if the string was indeed abbreviated.\n     *                    The append does not count towards the lower or upper limits.\n     * @return the abbreviated String.\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 541,col 9)",
        "(line 545,col 9)-(line 547,col 9)",
        "(line 550,col 9)-(line 552,col 9)",
        "(line 554,col 9)-(line 556,col 9)",
        "(line 558,col 9)-(line 558,col 51)",
        "(line 559,col 9)-(line 559,col 57)",
        "(line 560,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 573,col 33)"
      ]
    }
  ]
}