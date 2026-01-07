{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/text/StrMatcher.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrMatcher",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 434,
      "comment": "\n * A matcher class that can be queried to determine if a character array\n * portion matches.\n * \u003cp\u003e\n * This class comes complete with various factory methods.\n * If these do not suffice, you can subclass and implement your own matcher.\n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "COMMA_MATCHER"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Matches the comma character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TAB_MATCHER"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Matches the tab character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SPACE_MATCHER"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Matches the space character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SPLIT_MATCHER"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Matches the same characters as StringTokenizer,\n     * namely space, tab, newline, formfeed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TRIM_MATCHER"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Matches the String trim() whitespace characters.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SINGLE_QUOTE_MATCHER"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Matches the double quote character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_QUOTE_MATCHER"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Matches the double quote character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "QUOTE_MATCHER"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Matches the single or double quote character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NONE_MATCHER"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Matches no characters.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.commaMatcher()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Returns a matcher which matches the comma character.\n     *\n     * @return a matcher for a comma\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.tabMatcher()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Returns a matcher which matches the tab character.\n     *\n     * @return a matcher for a tab\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.spaceMatcher()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Returns a matcher which matches the space character.\n     *\n     * @return a matcher for a space\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.splitMatcher()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Matches the same characters as StringTokenizer,\n     * namely space, tab, newline and formfeed.\n     *\n     * @return the split matcher\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.trimMatcher()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Matches the String trim() whitespace characters.\n     *\n     * @return the trim matcher\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.singleQuoteMatcher()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Returns a matcher which matches the single quote character.\n     *\n     * @return a matcher for a single quote\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.doubleQuoteMatcher()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Returns a matcher which matches the double quote character.\n     *\n     * @return a matcher for a double quote\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.quoteMatcher()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Returns a matcher which matches the single or double quote character.\n     *\n     * @return a matcher for a single or double quote\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.noneMatcher()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Matches no characters.\n     *\n     * @return a matcher that matches nothing\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.charMatcher(char)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Constructor that creates a matcher from a character.\n     *\n     * @param ch  the character to match, must not be null\n     * @return a new Matcher for the given char\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.charSetMatcher(char...)",
      "begin_line": 171,
      "end_line": 179,
      "comment": "\n     * Constructor that creates a matcher from a set of characters.\n     *\n     * @param chars  the characters to match, null or empty matches nothing\n     * @return a new matcher for the given char[]\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.charSetMatcher(java.lang.String)",
      "begin_line": 187,
      "end_line": 195,
      "comment": "\n     * Constructor that creates a matcher from a string representing a set of characters.\n     *\n     * @param chars  the characters to match, null or empty matches nothing\n     * @return a new Matcher for the given characters\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.stringMatcher(java.lang.String)",
      "begin_line": 203,
      "end_line": 208,
      "comment": "\n     * Constructor that creates a matcher from a string.\n     *\n     * @param str  the string to match, null or empty matches nothing\n     * @return a new Matcher for the given String\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrMatcher.StrMatcher()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Constructor.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.isMatch(char[], int, int, int)",
      "begin_line": 243,
      "end_line": 243,
      "comment": "\n     * Returns the number of matching characters, zero for no match.\n     * \u003cp\u003e\n     * This method is called to check for a match.\n     * The parameter \u003ccode\u003epos\u003c/code\u003e represents the current position to be\n     * checked in the string \u003ccode\u003ebuffer\u003c/code\u003e (a character array which must\n     * not be changed).\n     * The API guarantees that \u003ccode\u003epos\u003c/code\u003e is a valid index for \u003ccode\u003ebuffer\u003c/code\u003e.\n     * \u003cp\u003e\n     * The character array may be larger than the active area to be matched.\n     * Only values in the buffer between the specifed indices may be accessed.\n     * \u003cp\u003e\n     * The matching code may check one character or many.\n     * It may check characters preceeding \u003ccode\u003epos\u003c/code\u003e as well as those\n     * after, so long as no checks exceed the bounds specified.\n     * \u003cp\u003e\n     * It must return zero for no match, or a positive number if a match was found.\n     * The number indicates the number of characters that matched.\n     *\n     * @param buffer  the text content to match against, do not change\n     * @param pos  the starting position for the match, valid for buffer\n     * @param bufferStart  the first active index in the buffer, valid for buffer\n     * @param bufferEnd  the end index (exclusive) of the active buffer, valid for buffer\n     * @return the number of matching characters, zero for no match\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.isMatch(char[], int)",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * Returns the number of matching characters, zero for no match.\n     * \u003cp\u003e\n     * This method is called to check for a match.\n     * The parameter \u003ccode\u003epos\u003c/code\u003e represents the current position to be\n     * checked in the string \u003ccode\u003ebuffer\u003c/code\u003e (a character array which must\n     * not be changed).\n     * The API guarantees that \u003ccode\u003epos\u003c/code\u003e is a valid index for \u003ccode\u003ebuffer\u003c/code\u003e.\n     * \u003cp\u003e\n     * The matching code may check one character or many.\n     * It may check characters preceeding \u003ccode\u003epos\u003c/code\u003e as well as those after.\n     * \u003cp\u003e\n     * It must return zero for no match, or a positive number if a match was found.\n     * The number indicates the number of characters that matched.\n     *\n     * @param buffer  the text content to match against, do not change\n     * @param pos  the starting position for the match, valid for buffer\n     * @return the number of matching characters, zero for no match\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CharSetMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrMatcher"
      ],
      "begin_line": 273,
      "end_line": 301,
      "comment": "\n     * Class used to define a set of characters for matching purposes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "chars"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": " The set of characters to match. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrMatcher.CharSetMatcher.CharSetMatcher(char[])",
      "begin_line": 282,
      "end_line": 286,
      "comment": "\n         * Constructor that creates a matcher from a character array.\n         *\n         * @param chars  the characters to match, must not be null\n         ",
      "child_ranges": [
        "(line 283,col 13)-(line 283,col 20)",
        "(line 284,col 13)-(line 284,col 39)",
        "(line 285,col 13)-(line 285,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.CharSetMatcher.isMatch(char[], int, int, int)",
      "begin_line": 297,
      "end_line": 300,
      "comment": "\n         * Returns whether or not the given character matches.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 299,col 13)-(line 299,col 72)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CharMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrMatcher"
      ],
      "begin_line": 307,
      "end_line": 334,
      "comment": "\n     * Class used to define a character for matching purposes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ch"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": " The character to match. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrMatcher.CharMatcher.CharMatcher(char)",
      "begin_line": 316,
      "end_line": 319,
      "comment": "\n         * Constructor that creates a matcher that matches a single character.\n         *\n         * @param ch  the character to match\n         ",
      "child_ranges": [
        "(line 317,col 13)-(line 317,col 20)",
        "(line 318,col 13)-(line 318,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.CharMatcher.isMatch(char[], int, int, int)",
      "begin_line": 330,
      "end_line": 333,
      "comment": "\n         * Returns whether or not the given character matches.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 332,col 13)-(line 332,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrMatcher"
      ],
      "begin_line": 340,
      "end_line": 376,
      "comment": "\n     * Class used to define a set of characters for matching purposes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "chars"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": " The string to match, as a character array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrMatcher.StringMatcher.StringMatcher(java.lang.String)",
      "begin_line": 349,
      "end_line": 352,
      "comment": "\n         * Constructor that creates a matcher from a String.\n         *\n         * @param str  the string to match, must not be null\n         ",
      "child_ranges": [
        "(line 350,col 13)-(line 350,col 20)",
        "(line 351,col 13)-(line 351,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.StringMatcher.isMatch(char[], int, int, int)",
      "begin_line": 363,
      "end_line": 375,
      "comment": "\n         * Returns whether or not the given text matches the stored string.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 365,col 13)-(line 365,col 35)",
        "(line 366,col 13)-(line 368,col 13)",
        "(line 369,col 13)-(line 373,col 13)",
        "(line 374,col 13)-(line 374,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NoMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrMatcher"
      ],
      "begin_line": 382,
      "end_line": 404,
      "comment": "\n     * Class used to match no characters.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrMatcher.NoMatcher.NoMatcher()",
      "begin_line": 387,
      "end_line": 389,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eNoMatcher\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 388,col 13)-(line 388,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.NoMatcher.isMatch(char[], int, int, int)",
      "begin_line": 400,
      "end_line": 403,
      "comment": "\n         * Always returns \u003ccode\u003efalse\u003c/code\u003e.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 402,col 13)-(line 402,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TrimMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrMatcher"
      ],
      "begin_line": 410,
      "end_line": 432,
      "comment": "\n     * Class used to match whitespace as per trim().\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrMatcher.TrimMatcher.TrimMatcher()",
      "begin_line": 415,
      "end_line": 417,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eTrimMatcher\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 416,col 13)-(line 416,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.TrimMatcher.isMatch(char[], int, int, int)",
      "begin_line": 428,
      "end_line": 431,
      "comment": "\n         * Returns whether or not the given character matches.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 430,col 13)-(line 430,col 45)"
      ]
    }
  ]
}