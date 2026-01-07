{
  "filepath": "/tmp/Lang-1b/src/main/java/org/apache/commons/lang3/text/StrMatcher.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrMatcher",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 436,
      "comment": "\n * A matcher class that can be queried to determine if a character array\n * portion matches.\n * \u003cp\u003e\n * This class comes complete with various factory methods.\n * If these do not suffice, you can subclass and implement your own matcher.\n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "COMMA_MATCHER"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Matches the comma character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TAB_MATCHER"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Matches the tab character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SPACE_MATCHER"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Matches the space character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SPLIT_MATCHER"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Matches the same characters as StringTokenizer,\n     * namely space, tab, newline, formfeed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TRIM_MATCHER"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Matches the String trim() whitespace characters.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SINGLE_QUOTE_MATCHER"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Matches the double quote character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_QUOTE_MATCHER"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Matches the double quote character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "QUOTE_MATCHER"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Matches the single or double quote character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NONE_MATCHER"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Matches no characters.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.commaMatcher()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Returns a matcher which matches the comma character.\n     *\n     * @return a matcher for a comma\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.tabMatcher()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Returns a matcher which matches the tab character.\n     *\n     * @return a matcher for a tab\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.spaceMatcher()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Returns a matcher which matches the space character.\n     *\n     * @return a matcher for a space\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.splitMatcher()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Matches the same characters as StringTokenizer,\n     * namely space, tab, newline and formfeed.\n     *\n     * @return the split matcher\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.trimMatcher()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Matches the String trim() whitespace characters.\n     *\n     * @return the trim matcher\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.singleQuoteMatcher()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Returns a matcher which matches the single quote character.\n     *\n     * @return a matcher for a single quote\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.doubleQuoteMatcher()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Returns a matcher which matches the double quote character.\n     *\n     * @return a matcher for a double quote\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.quoteMatcher()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Returns a matcher which matches the single or double quote character.\n     *\n     * @return a matcher for a single or double quote\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.noneMatcher()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Matches no characters.\n     *\n     * @return a matcher that matches nothing\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.charMatcher(char)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Constructor that creates a matcher from a character.\n     *\n     * @param ch  the character to match, must not be null\n     * @return a new Matcher for the given char\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.charSetMatcher(char...)",
      "begin_line": 173,
      "end_line": 181,
      "comment": "\n     * Constructor that creates a matcher from a set of characters.\n     *\n     * @param chars  the characters to match, null or empty matches nothing\n     * @return a new matcher for the given char[]\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.charSetMatcher(java.lang.String)",
      "begin_line": 189,
      "end_line": 197,
      "comment": "\n     * Constructor that creates a matcher from a string representing a set of characters.\n     *\n     * @param chars  the characters to match, null or empty matches nothing\n     * @return a new Matcher for the given characters\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.stringMatcher(java.lang.String)",
      "begin_line": 205,
      "end_line": 210,
      "comment": "\n     * Constructor that creates a matcher from a string.\n     *\n     * @param str  the string to match, null or empty matches nothing\n     * @return a new Matcher for the given String\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrMatcher.StrMatcher()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * Constructor.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.isMatch(char[], int, int, int)",
      "begin_line": 245,
      "end_line": 245,
      "comment": "\n     * Returns the number of matching characters, zero for no match.\n     * \u003cp\u003e\n     * This method is called to check for a match.\n     * The parameter \u003ccode\u003epos\u003c/code\u003e represents the current position to be\n     * checked in the string \u003ccode\u003ebuffer\u003c/code\u003e (a character array which must\n     * not be changed).\n     * The API guarantees that \u003ccode\u003epos\u003c/code\u003e is a valid index for \u003ccode\u003ebuffer\u003c/code\u003e.\n     * \u003cp\u003e\n     * The character array may be larger than the active area to be matched.\n     * Only values in the buffer between the specifed indices may be accessed.\n     * \u003cp\u003e\n     * The matching code may check one character or many.\n     * It may check characters preceding \u003ccode\u003epos\u003c/code\u003e as well as those\n     * after, so long as no checks exceed the bounds specified.\n     * \u003cp\u003e\n     * It must return zero for no match, or a positive number if a match was found.\n     * The number indicates the number of characters that matched.\n     *\n     * @param buffer  the text content to match against, do not change\n     * @param pos  the starting position for the match, valid for buffer\n     * @param bufferStart  the first active index in the buffer, valid for buffer\n     * @param bufferEnd  the end index (exclusive) of the active buffer, valid for buffer\n     * @return the number of matching characters, zero for no match\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.isMatch(char[], int)",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * Returns the number of matching characters, zero for no match.\n     * \u003cp\u003e\n     * This method is called to check for a match.\n     * The parameter \u003ccode\u003epos\u003c/code\u003e represents the current position to be\n     * checked in the string \u003ccode\u003ebuffer\u003c/code\u003e (a character array which must\n     * not be changed).\n     * The API guarantees that \u003ccode\u003epos\u003c/code\u003e is a valid index for \u003ccode\u003ebuffer\u003c/code\u003e.\n     * \u003cp\u003e\n     * The matching code may check one character or many.\n     * It may check characters preceding \u003ccode\u003epos\u003c/code\u003e as well as those after.\n     * \u003cp\u003e\n     * It must return zero for no match, or a positive number if a match was found.\n     * The number indicates the number of characters that matched.\n     *\n     * @param buffer  the text content to match against, do not change\n     * @param pos  the starting position for the match, valid for buffer\n     * @return the number of matching characters, zero for no match\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CharSetMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrMatcher"
      ],
      "begin_line": 275,
      "end_line": 303,
      "comment": "\n     * Class used to define a set of characters for matching purposes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "chars"
      ],
      "begin_line": 277,
      "end_line": 277,
      "comment": " The set of characters to match. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrMatcher.CharSetMatcher.CharSetMatcher(char[])",
      "begin_line": 284,
      "end_line": 288,
      "comment": "\n         * Constructor that creates a matcher from a character array.\n         *\n         * @param chars  the characters to match, must not be null\n         ",
      "child_ranges": [
        "(line 285,col 13)-(line 285,col 20)",
        "(line 286,col 13)-(line 286,col 39)",
        "(line 287,col 13)-(line 287,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.CharSetMatcher.isMatch(char[], int, int, int)",
      "begin_line": 299,
      "end_line": 302,
      "comment": "\n         * Returns whether or not the given character matches.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 301,col 13)-(line 301,col 72)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CharMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrMatcher"
      ],
      "begin_line": 309,
      "end_line": 336,
      "comment": "\n     * Class used to define a character for matching purposes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ch"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " The character to match. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrMatcher.CharMatcher.CharMatcher(char)",
      "begin_line": 318,
      "end_line": 321,
      "comment": "\n         * Constructor that creates a matcher that matches a single character.\n         *\n         * @param ch  the character to match\n         ",
      "child_ranges": [
        "(line 319,col 13)-(line 319,col 20)",
        "(line 320,col 13)-(line 320,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.CharMatcher.isMatch(char[], int, int, int)",
      "begin_line": 332,
      "end_line": 335,
      "comment": "\n         * Returns whether or not the given character matches.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 334,col 13)-(line 334,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrMatcher"
      ],
      "begin_line": 342,
      "end_line": 378,
      "comment": "\n     * Class used to define a set of characters for matching purposes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "chars"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": " The string to match, as a character array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrMatcher.StringMatcher.StringMatcher(java.lang.String)",
      "begin_line": 351,
      "end_line": 354,
      "comment": "\n         * Constructor that creates a matcher from a String.\n         *\n         * @param str  the string to match, must not be null\n         ",
      "child_ranges": [
        "(line 352,col 13)-(line 352,col 20)",
        "(line 353,col 13)-(line 353,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.StringMatcher.isMatch(char[], int, int, int)",
      "begin_line": 365,
      "end_line": 377,
      "comment": "\n         * Returns whether or not the given text matches the stored string.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 367,col 13)-(line 367,col 41)",
        "(line 368,col 13)-(line 370,col 13)",
        "(line 371,col 13)-(line 375,col 13)",
        "(line 376,col 13)-(line 376,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NoMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrMatcher"
      ],
      "begin_line": 384,
      "end_line": 406,
      "comment": "\n     * Class used to match no characters.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrMatcher.NoMatcher.NoMatcher()",
      "begin_line": 389,
      "end_line": 391,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eNoMatcher\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 390,col 13)-(line 390,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.NoMatcher.isMatch(char[], int, int, int)",
      "begin_line": 402,
      "end_line": 405,
      "comment": "\n         * Always returns \u003ccode\u003efalse\u003c/code\u003e.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 404,col 13)-(line 404,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TrimMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrMatcher"
      ],
      "begin_line": 412,
      "end_line": 434,
      "comment": "\n     * Class used to match whitespace as per trim().\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrMatcher.TrimMatcher.TrimMatcher()",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eTrimMatcher\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 418,col 13)-(line 418,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrMatcher.TrimMatcher.isMatch(char[], int, int, int)",
      "begin_line": 430,
      "end_line": 433,
      "comment": "\n         * Returns whether or not the given character matches.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 432,col 13)-(line 432,col 45)"
      ]
    }
  ]
}