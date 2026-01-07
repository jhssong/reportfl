{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/text/StrMatcher.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrMatcher",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 435,
      "comment": "\n * A matcher class that can be queried to determine if a character array\n * portion matches.\n * \u003cp\u003e\n * This class comes complete with various factory methods.\n * If these do not suffice, you can subclass and implement your own matcher.\n *\n * @author Apache Software Foundation\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "COMMA_MATCHER"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Matches the comma character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TAB_MATCHER"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Matches the tab character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SPACE_MATCHER"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Matches the space character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SPLIT_MATCHER"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Matches the same characters as StringTokenizer,\n     * namely space, tab, newline, formfeed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TRIM_MATCHER"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Matches the String trim() whitespace characters.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SINGLE_QUOTE_MATCHER"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Matches the double quote character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_QUOTE_MATCHER"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Matches the double quote character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "QUOTE_MATCHER"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Matches the single or double quote character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NONE_MATCHER"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Matches no characters.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.commaMatcher()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Returns a matcher which matches the comma character.\n     *\n     * @return a matcher for a comma\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.tabMatcher()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Returns a matcher which matches the tab character.\n     *\n     * @return a matcher for a tab\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.spaceMatcher()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Returns a matcher which matches the space character.\n     *\n     * @return a matcher for a space\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.splitMatcher()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Matches the same characters as StringTokenizer,\n     * namely space, tab, newline and formfeed.\n     *\n     * @return the split matcher\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.trimMatcher()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Matches the String trim() whitespace characters.\n     *\n     * @return the trim matcher\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.singleQuoteMatcher()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Returns a matcher which matches the single quote character.\n     *\n     * @return a matcher for a single quote\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.doubleQuoteMatcher()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Returns a matcher which matches the double quote character.\n     *\n     * @return a matcher for a double quote\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.quoteMatcher()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Returns a matcher which matches the single or double quote character.\n     *\n     * @return a matcher for a single or double quote\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.noneMatcher()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Matches no characters.\n     *\n     * @return a matcher that matches nothing\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.charMatcher(char)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Constructor that creates a matcher from a character.\n     *\n     * @param ch  the character to match, must not be null\n     * @return a new Matcher for the given char\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.charSetMatcher(char[])",
      "begin_line": 172,
      "end_line": 180,
      "comment": "\n     * Constructor that creates a matcher from a set of characters.\n     *\n     * @param chars  the characters to match, null or empty matches nothing\n     * @return a new matcher for the given char[]\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.charSetMatcher(java.lang.String)",
      "begin_line": 188,
      "end_line": 196,
      "comment": "\n     * Constructor that creates a matcher from a string representing a set of characters.\n     *\n     * @param chars  the characters to match, null or empty matches nothing\n     * @return a new Matcher for the given characters\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.stringMatcher(java.lang.String)",
      "begin_line": 204,
      "end_line": 209,
      "comment": "\n     * Constructor that creates a matcher from a string.\n     *\n     * @param str  the string to match, null or empty matches nothing\n     * @return a new Matcher for the given String\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrMatcher.StrMatcher()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * Constructor.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.isMatch(char[], int, int, int)",
      "begin_line": 244,
      "end_line": 244,
      "comment": "\n     * Returns the number of matching characters, zero for no match.\n     * \u003cp\u003e\n     * This method is called to check for a match.\n     * The parameter \u003ccode\u003epos\u003c/code\u003e represents the current position to be\n     * checked in the string \u003ccode\u003ebuffer\u003c/code\u003e (a character array which must\n     * not be changed).\n     * The API guarantees that \u003ccode\u003epos\u003c/code\u003e is a valid index for \u003ccode\u003ebuffer\u003c/code\u003e.\n     * \u003cp\u003e\n     * The character array may be larger than the active area to be matched.\n     * Only values in the buffer between the specifed indices may be accessed.\n     * \u003cp\u003e\n     * The matching code may check one character or many.\n     * It may check characters preceeding \u003ccode\u003epos\u003c/code\u003e as well as those\n     * after, so long as no checks exceed the bounds specified.\n     * \u003cp\u003e\n     * It must return zero for no match, or a positive number if a match was found.\n     * The number indicates the number of characters that matched.\n     *\n     * @param buffer  the text content to match against, do not change\n     * @param pos  the starting position for the match, valid for buffer\n     * @param bufferStart  the first active index in the buffer, valid for buffer\n     * @param bufferEnd  the end index (exclusive) of the active buffer, valid for buffer\n     * @return the number of matching characters, zero for no match\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.isMatch(char[], int)",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * Returns the number of matching characters, zero for no match.\n     * \u003cp\u003e\n     * This method is called to check for a match.\n     * The parameter \u003ccode\u003epos\u003c/code\u003e represents the current position to be\n     * checked in the string \u003ccode\u003ebuffer\u003c/code\u003e (a character array which must\n     * not be changed).\n     * The API guarantees that \u003ccode\u003epos\u003c/code\u003e is a valid index for \u003ccode\u003ebuffer\u003c/code\u003e.\n     * \u003cp\u003e\n     * The matching code may check one character or many.\n     * It may check characters preceeding \u003ccode\u003epos\u003c/code\u003e as well as those after.\n     * \u003cp\u003e\n     * It must return zero for no match, or a positive number if a match was found.\n     * The number indicates the number of characters that matched.\n     *\n     * @param buffer  the text content to match against, do not change\n     * @param pos  the starting position for the match, valid for buffer\n     * @return the number of matching characters, zero for no match\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CharSetMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrMatcher"
      ],
      "begin_line": 274,
      "end_line": 302,
      "comment": "\n     * Class used to define a set of characters for matching purposes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "chars"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": " The set of characters to match. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrMatcher.CharSetMatcher.CharSetMatcher(char[])",
      "begin_line": 283,
      "end_line": 287,
      "comment": "\n         * Constructor that creates a matcher from a character array.\n         *\n         * @param chars  the characters to match, must not be null\n         ",
      "child_ranges": [
        "(line 284,col 13)-(line 284,col 20)",
        "(line 285,col 13)-(line 285,col 39)",
        "(line 286,col 13)-(line 286,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.CharSetMatcher.isMatch(char[], int, int, int)",
      "begin_line": 298,
      "end_line": 301,
      "comment": "\n         * Returns whether or not the given character matches.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 300,col 13)-(line 300,col 72)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CharMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrMatcher"
      ],
      "begin_line": 308,
      "end_line": 335,
      "comment": "\n     * Class used to define a character for matching purposes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ch"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": " The character to match. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrMatcher.CharMatcher.CharMatcher(char)",
      "begin_line": 317,
      "end_line": 320,
      "comment": "\n         * Constructor that creates a matcher that matches a single character.\n         *\n         * @param ch  the character to match\n         ",
      "child_ranges": [
        "(line 318,col 13)-(line 318,col 20)",
        "(line 319,col 13)-(line 319,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.CharMatcher.isMatch(char[], int, int, int)",
      "begin_line": 331,
      "end_line": 334,
      "comment": "\n         * Returns whether or not the given character matches.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 333,col 13)-(line 333,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrMatcher"
      ],
      "begin_line": 341,
      "end_line": 377,
      "comment": "\n     * Class used to define a set of characters for matching purposes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "chars"
      ],
      "begin_line": 343,
      "end_line": 343,
      "comment": " The string to match, as a character array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrMatcher.StringMatcher.StringMatcher(java.lang.String)",
      "begin_line": 350,
      "end_line": 353,
      "comment": "\n         * Constructor that creates a matcher from a String.\n         *\n         * @param str  the string to match, must not be null\n         ",
      "child_ranges": [
        "(line 351,col 13)-(line 351,col 20)",
        "(line 352,col 13)-(line 352,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.StringMatcher.isMatch(char[], int, int, int)",
      "begin_line": 364,
      "end_line": 376,
      "comment": "\n         * Returns whether or not the given text matches the stored string.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 366,col 13)-(line 366,col 35)",
        "(line 367,col 13)-(line 369,col 13)",
        "(line 370,col 13)-(line 374,col 13)",
        "(line 375,col 13)-(line 375,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NoMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrMatcher"
      ],
      "begin_line": 383,
      "end_line": 405,
      "comment": "\n     * Class used to match no characters.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrMatcher.NoMatcher.NoMatcher()",
      "begin_line": 388,
      "end_line": 390,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eNoMatcher\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 389,col 13)-(line 389,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.NoMatcher.isMatch(char[], int, int, int)",
      "begin_line": 401,
      "end_line": 404,
      "comment": "\n         * Always returns \u003ccode\u003efalse\u003c/code\u003e.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 403,col 13)-(line 403,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TrimMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrMatcher"
      ],
      "begin_line": 411,
      "end_line": 433,
      "comment": "\n     * Class used to match whitespace as per trim().\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrMatcher.TrimMatcher.TrimMatcher()",
      "begin_line": 416,
      "end_line": 418,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eTrimMatcher\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 417,col 13)-(line 417,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.TrimMatcher.isMatch(char[], int, int, int)",
      "begin_line": 429,
      "end_line": 432,
      "comment": "\n         * Returns whether or not the given character matches.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 431,col 13)-(line 431,col 45)"
      ]
    }
  ]
}