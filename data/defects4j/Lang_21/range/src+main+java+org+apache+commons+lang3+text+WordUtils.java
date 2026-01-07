{
  "filepath": "/tmp/Lang-21b/src/main/java/org/apache/commons/lang3/text/WordUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WordUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 512,
      "comment": "\n * \u003cp\u003eOperations on Strings that contain words.\u003c/p\u003e\n * \n * \u003cp\u003eThis class tries to handle \u003ccode\u003enull\u003c/code\u003e input gracefully.\n * An exception will not be thrown for a \u003ccode\u003enull\u003c/code\u003e input.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @author Apache Jakarta Velocity\n * @author \u003ca href\u003d\"mailto:hps@intermeta.de\"\u003eHenning P. Schmiedehausen\u003c/a\u003e\n * @author Gary Gregory\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.WordUtils.WordUtils()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eWordUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming. Instead, the class should be used as\n     * \u003ccode\u003eWordUtils.wrap(\"foo bar\", 20);\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 46,col 7)-(line 46,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.wrap(java.lang.String, int)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * \u003cp\u003eWraps a single line of text, identifying words by \u003ccode\u003e\u0027 \u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eNew lines will be separated by the system property line separator.\n     * Very long words, such as URLs will \u003ci\u003enot\u003c/i\u003e be wrapped.\u003c/p\u003e\n     * \n     * \u003cp\u003eLeading spaces on a new line are stripped.\n     * Trailing spaces are not stripped.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.wrap(null, *) \u003d null\n     * WordUtils.wrap(\"\", *) \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be word wrapped, may be null\n     * @param wrapLength  the column to wrap the words at, less than 1 is treated as 1\n     * @return a line with newlines inserted, \u003ccode\u003enull\u003c/code\u003e if null input\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.wrap(java.lang.String, int, java.lang.String, boolean)",
      "begin_line": 91,
      "end_line": 144,
      "comment": "\n     * \u003cp\u003eWraps a single line of text, identifying words by \u003ccode\u003e\u0027 \u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eLeading spaces on a new line are stripped.\n     * Trailing spaces are not stripped.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * WordUtils.wrap(null, *, *, *) \u003d null\n     * WordUtils.wrap(\"\", *, *, *) \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be word wrapped, may be null\n     * @param wrapLength  the column to wrap the words at, less than 1 is treated as 1\n     * @param newLineStr  the string to insert for a new line, \n     *  \u003ccode\u003enull\u003c/code\u003e uses the system property line separator\n     * @param wrapLongWords  true if long words (such as URLs) should be wrapped\n     * @return a line with newlines inserted, \u003ccode\u003enull\u003c/code\u003e if null input\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 43)",
        "(line 102,col 9)-(line 102,col 23)",
        "(line 103,col 9)-(line 103,col 76)",
        "(line 105,col 9)-(line 138,col 9)",
        "(line 141,col 9)-(line 141,col 50)",
        "(line 143,col 9)-(line 143,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.capitalize(java.lang.String)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * \u003cp\u003eCapitalizes all the whitespace separated words in a String.\n     * Only the first letter of each word is changed. To convert the \n     * rest of each word to lowercase at the same time, \n     * use {@link #capitalizeFully(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * Capitalization uses the unicode title case, normally equivalent to\n     * upper case.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.capitalize(null)        \u003d null\n     * WordUtils.capitalize(\"\")          \u003d \"\"\n     * WordUtils.capitalize(\"i am FINE\") \u003d \"I Am FINE\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to capitalize, may be null\n     * @return capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see #uncapitalize(String)\n     * @see #capitalizeFully(String)\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.capitalize(java.lang.String, char...)",
      "begin_line": 203,
      "end_line": 225,
      "comment": "\n     * \u003cp\u003eCapitalizes all the delimiter separated words in a String.\n     * Only the first letter of each word is changed. To convert the \n     * rest of each word to lowercase at the same time, \n     * use {@link #capitalizeFully(String, char[])}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe delimiters represent a set of characters understood to separate words.\n     * The first string character and the first non-delimiter character after a\n     * delimiter will be capitalized. \u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * Capitalization uses the unicode title case, normally equivalent to\n     * upper case.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.capitalize(null, *)            \u003d null\n     * WordUtils.capitalize(\"\", *)              \u003d \"\"\n     * WordUtils.capitalize(*, new char[0])     \u003d *\n     * WordUtils.capitalize(\"i am fine\", null)  \u003d \"I Am Fine\"\n     * WordUtils.capitalize(\"i aM.fine\", {\u0027.\u0027}) \u003d \"I aM.Fine\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to capitalize, may be null\n     * @param delimiters  set of characters to determine capitalization, null means whitespace\n     * @return capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see #uncapitalize(String)\n     * @see #capitalizeFully(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 69)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 34)",
        "(line 209,col 9)-(line 209,col 57)",
        "(line 210,col 9)-(line 210,col 38)",
        "(line 211,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.capitalizeFully(java.lang.String)",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * \u003cp\u003eConverts all the whitespace separated words in a String into capitalized words, \n     * that is each word is made up of a titlecase character and then a series of \n     * lowercase characters.  \u003c/p\u003e\n     *\n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * Capitalization uses the unicode title case, normally equivalent to\n     * upper case.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.capitalizeFully(null)        \u003d null\n     * WordUtils.capitalizeFully(\"\")          \u003d \"\"\n     * WordUtils.capitalizeFully(\"i am FINE\") \u003d \"I Am Fine\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to capitalize, may be null\n     * @return capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.capitalizeFully(java.lang.String, char...)",
      "begin_line": 277,
      "end_line": 284,
      "comment": "\n     * \u003cp\u003eConverts all the delimiter separated words in a String into capitalized words, \n     * that is each word is made up of a titlecase character and then a series of \n     * lowercase characters. \u003c/p\u003e\n     *\n     * \u003cp\u003eThe delimiters represent a set of characters understood to separate words.\n     * The first string character and the first non-delimiter character after a\n     * delimiter will be capitalized. \u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * Capitalization uses the unicode title case, normally equivalent to\n     * upper case.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.capitalizeFully(null, *)            \u003d null\n     * WordUtils.capitalizeFully(\"\", *)              \u003d \"\"\n     * WordUtils.capitalizeFully(*, null)            \u003d *\n     * WordUtils.capitalizeFully(*, new char[0])     \u003d *\n     * WordUtils.capitalizeFully(\"i aM.fine\", {\u0027.\u0027}) \u003d \"I am.Fine\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to capitalize, may be null\n     * @param delimiters  set of characters to determine capitalization, null means whitespace\n     * @return capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 69)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 32)",
        "(line 283,col 9)-(line 283,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.uncapitalize(java.lang.String)",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\n     * \u003cp\u003eUncapitalizes all the whitespace separated words in a String.\n     * Only the first letter of each word is changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.uncapitalize(null)        \u003d null\n     * WordUtils.uncapitalize(\"\")          \u003d \"\"\n     * WordUtils.uncapitalize(\"I Am FINE\") \u003d \"i am fINE\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to uncapitalize, may be null\n     * @return uncapitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see #capitalize(String)\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.uncapitalize(java.lang.String, char...)",
      "begin_line": 333,
      "end_line": 355,
      "comment": "\n     * \u003cp\u003eUncapitalizes all the whitespace separated words in a String.\n     * Only the first letter of each word is changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe delimiters represent a set of characters understood to separate words.\n     * The first string character and the first non-delimiter character after a\n     * delimiter will be uncapitalized. \u003c/p\u003e\n     *\n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.uncapitalize(null, *)            \u003d null\n     * WordUtils.uncapitalize(\"\", *)              \u003d \"\"\n     * WordUtils.uncapitalize(*, null)            \u003d *\n     * WordUtils.uncapitalize(*, new char[0])     \u003d *\n     * WordUtils.uncapitalize(\"I AM.FINE\", {\u0027.\u0027}) \u003d \"i AM.fINE\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to uncapitalize, may be null\n     * @param delimiters  set of characters to determine uncapitalization, null means whitespace\n     * @return uncapitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see #capitalize(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 69)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 34)",
        "(line 339,col 9)-(line 339,col 57)",
        "(line 340,col 9)-(line 340,col 40)",
        "(line 341,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.swapCase(java.lang.String)",
      "begin_line": 380,
      "end_line": 410,
      "comment": "\n     * \u003cp\u003eSwaps the case of a String using a word based algorithm.\u003c/p\u003e\n     * \n     * \u003cul\u003e\n     *  \u003cli\u003eUpper case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eTitle case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eLower case character after Whitespace or at start converts to Title case\u003c/li\u003e\n     *  \u003cli\u003eOther Lower case character converts to Upper case\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.swapCase(null)                 \u003d null\n     * StringUtils.swapCase(\"\")                   \u003d \"\"\n     * StringUtils.swapCase(\"The dog has a BONE\") \u003d \"tHE DOG HAS A bone\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to swap case, may be null\n     * @return the changed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 19)",
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 57)",
        "(line 387,col 9)-(line 387,col 34)",
        "(line 388,col 9)-(line 388,col 20)",
        "(line 389,col 9)-(line 389,col 21)",
        "(line 391,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.initials(java.lang.String)",
      "begin_line": 435,
      "end_line": 437,
      "comment": "\n     * \u003cp\u003eExtracts the initial letters from each word in the String.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe first letter of the string and all first letters after\n     * whitespace are returned as a new string.\n     * Their case is not changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.initials(null)             \u003d null\n     * WordUtils.initials(\"\")               \u003d \"\"\n     * WordUtils.initials(\"Ben John Lee\")   \u003d \"BJL\"\n     * WordUtils.initials(\"Ben J.Lee\")      \u003d \"BJ\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get initials from, may be null\n     * @return String of initial letters, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see #initials(String,char[])\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.initials(java.lang.String, char...)",
      "begin_line": 466,
      "end_line": 490,
      "comment": "\n     * \u003cp\u003eExtracts the initial letters from each word in the String.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe first letter of the string and all first letters after the\n     * defined delimiters are returned as a new string.\n     * Their case is not changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the delimiters array is null, then Whitespace is used.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty delimiter array returns an empty String.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * WordUtils.initials(null, *)                \u003d null\n     * WordUtils.initials(\"\", *)                  \u003d \"\"\n     * WordUtils.initials(\"Ben John Lee\", null)   \u003d \"BJL\"\n     * WordUtils.initials(\"Ben J.Lee\", null)      \u003d \"BJ\"\n     * WordUtils.initials(\"Ben J.Lee\", [\u0027 \u0027,\u0027.\u0027]) \u003d \"BJL\"\n     * WordUtils.initials(*, new char[0])         \u003d \"\"\n     * \u003c/pre\u003e\n     * \n     * @param str  the String to get initials from, may be null\n     * @param delimiters  set of characters to determine words, null means whitespace\n     * @return String of initial letters, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see #initials(String)\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 34)",
        "(line 474,col 9)-(line 474,col 46)",
        "(line 475,col 9)-(line 475,col 22)",
        "(line 476,col 9)-(line 476,col 34)",
        "(line 477,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.WordUtils.isDelimiter(char, char[])",
      "begin_line": 500,
      "end_line": 510,
      "comment": "\n     * Is the character a delimiter.\n     *\n     * @param ch  the character to check\n     * @param delimiters  the delimiters\n     * @return true if it is a delimiter\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 21)"
      ]
    }
  ]
}