{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/text/StrMatcher.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrMatcher",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 430,
      "comment": "\n * A matcher class that can be queried to determine if a character array\n * portion matches.\n * \u003cp\u003e\n * This class comes complete with various factory methods.\n * If these do not suffice, you can subclass and implement your own matcher.\n *\n * @author Stephen Colebourne\n * @since 2.2\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang.text.StrMatcher.commaMatcher()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Returns a matcher which matches the comma character.\n     *\n     * @return a matcher for a comma\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.tabMatcher()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Returns a matcher which matches the tab character.\n     *\n     * @return a matcher for a tab\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.spaceMatcher()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Returns a matcher which matches the space character.\n     *\n     * @return a matcher for a space\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.splitMatcher()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Matches the same characters as StringTokenizer,\n     * namely space, tab, newline and formfeed.\n     *\n     * @return the split matcher\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.trimMatcher()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Matches the String trim() whitespace characters.\n     *\n     * @return the trim matcher\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.singleQuoteMatcher()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Returns a matcher which matches the single quote character.\n     *\n     * @return a matcher for a single quote\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.doubleQuoteMatcher()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Returns a matcher which matches the double quote character.\n     *\n     * @return a matcher for a double quote\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.quoteMatcher()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Returns a matcher which matches the single or double quote character.\n     *\n     * @return a matcher for a single or double quote\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.noneMatcher()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Matches no characters.\n     *\n     * @return a matcher that matches nothing\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.charMatcher(char)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Constructor that creates a matcher from a character.\n     *\n     * @param ch  the character to match, must not be null\n     * @return a new Matcher for the given char\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.charSetMatcher(char[])",
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
      "signature": "org.apache.commons.lang.text.StrMatcher.charSetMatcher(java.lang.String)",
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
      "signature": "org.apache.commons.lang.text.StrMatcher.stringMatcher(java.lang.String)",
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
      "signature": "org.apache.commons.lang.text.StrMatcher.StrMatcher()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * Constructor.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.isMatch(char[], int, int, int)",
      "begin_line": 244,
      "end_line": 244,
      "comment": "\n     * Returns the number of matching characters, zero for no match.\n     * \u003cp\u003e\n     * This method is called to check for a match.\n     * The parameter \u003ccode\u003epos\u003c/code\u003e represents the current position to be\n     * checked in the string \u003ccode\u003ebuffer\u003c/code\u003e (a character array which must\n     * not be changed).\n     * The API guarantees that \u003ccode\u003epos\u003c/code\u003e is a valid index for \u003ccode\u003ebuffer\u003c/code\u003e.\n     * \u003cp\u003e\n     * The character array may be larger than the active area to be matched.\n     * Only values in the buffer between the specifed indices may be accessed.\n     * \u003cp\u003e\n     * The matching code may check one character or many.\n     * It may check characters preceeding \u003ccode\u003epos\u003c/code\u003e as well as those\n     * after, so long as no checks exceed the bounds specified.\n     * \u003cp\u003e\n     * It must return zero for no match, or a positive number if a match was found.\n     * The number indicates the number of characters that matched.\n     *\n     * @param buffer  the text content to match against, do not change\n     * @param pos  the starting position for the match, valid for buffer\n     * @param bufferStart  the first active index in the buffer, valid for buffer\n     * @param bufferEnd  the end index (exclusive) of the active buffer, valid for buffer\n     * @return the number of matching characters, zero for no match\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.isMatch(char[], int)",
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
        "org.apache.commons.lang.text.StrMatcher"
      ],
      "begin_line": 274,
      "end_line": 301,
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
      "signature": "org.apache.commons.lang.text.StrMatcher.CharSetMatcher.CharSetMatcher(char[])",
      "begin_line": 283,
      "end_line": 287,
      "comment": "\n         * Constructor that creates a matcher from a character array.\n         *\n         * @param chars  the characters to match, must not be null\n         ",
      "child_ranges": [
        "(line 284,col 13)-(line 284,col 20)",
        "(line 285,col 13)-(line 285,col 48)",
        "(line 286,col 13)-(line 286,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.CharSetMatcher.isMatch(char[], int, int, int)",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n         * Returns whether or not the given charatcer matches.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 299,col 13)-(line 299,col 72)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CharMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.StrMatcher"
      ],
      "begin_line": 307,
      "end_line": 333,
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
      "signature": "org.apache.commons.lang.text.StrMatcher.CharMatcher.CharMatcher(char)",
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
      "signature": "org.apache.commons.lang.text.StrMatcher.CharMatcher.isMatch(char[], int, int, int)",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\n         * Returns whether or not the given character matches.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 331,col 13)-(line 331,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.StrMatcher"
      ],
      "begin_line": 339,
      "end_line": 374,
      "comment": "\n     * Class used to define a set of characters for matching purposes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "chars"
      ],
      "begin_line": 341,
      "end_line": 341,
      "comment": " The string to match, as a character array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrMatcher.StringMatcher.StringMatcher(java.lang.String)",
      "begin_line": 348,
      "end_line": 351,
      "comment": "\n         * Constructor that creates a matcher from a String.\n         *\n         * @param str  the string to match, must not be null\n         ",
      "child_ranges": [
        "(line 349,col 13)-(line 349,col 20)",
        "(line 350,col 13)-(line 350,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.StringMatcher.isMatch(char[], int, int, int)",
      "begin_line": 362,
      "end_line": 373,
      "comment": "\n         * Returns whether or not the given text matches the stored string.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 363,col 13)-(line 363,col 35)",
        "(line 364,col 13)-(line 366,col 13)",
        "(line 367,col 13)-(line 371,col 13)",
        "(line 372,col 13)-(line 372,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NoMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.StrMatcher"
      ],
      "begin_line": 380,
      "end_line": 401,
      "comment": "\n     * Class used to match no characters.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrMatcher.NoMatcher.NoMatcher()",
      "begin_line": 385,
      "end_line": 387,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eNoMatcher\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 386,col 13)-(line 386,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.NoMatcher.isMatch(char[], int, int, int)",
      "begin_line": 398,
      "end_line": 400,
      "comment": "\n         * Always returns \u003ccode\u003efalse\u003c/code\u003e.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 399,col 13)-(line 399,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TrimMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.StrMatcher"
      ],
      "begin_line": 407,
      "end_line": 428,
      "comment": "\n     * Class used to match whitespace as per trim().\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrMatcher.TrimMatcher.TrimMatcher()",
      "begin_line": 412,
      "end_line": 414,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eTrimMatcher\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 413,col 13)-(line 413,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.TrimMatcher.isMatch(char[], int, int, int)",
      "begin_line": 425,
      "end_line": 427,
      "comment": "\n         * Returns whether or not the given charatcer matches.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 426,col 13)-(line 426,col 45)"
      ]
    }
  ]
}