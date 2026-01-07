{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/text/StrMatcher.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrMatcher",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 405,
      "comment": "\n * A matcher class that can be queried to determine if a character array\n * portion matches.\n * \u003cp\u003e\n * This class comes complete with various factory methods.\n * If these do not suffice, you can subclass and implement your own matcher.\n *\n * @author Stephen Colebourne\n * @since 2.2\n * @version $Id: StrMatcher.java 232652 2005-08-14 21:45:47Z scolebourne $\n "
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
      "signature": "org.apache.commons.lang.text.StrMatcher.commaMatcher()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Returns a matcher which matches the comma character.\n     *\n     * @return a matcher for a comma\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.tabMatcher()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Returns a matcher which matches the tab character.\n     *\n     * @return a matcher for a tab\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.spaceMatcher()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Returns a matcher which matches the space character.\n     *\n     * @return a matcher for a space\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.splitMatcher()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Matches the same characters as StringTokenizer,\n     * namely space, tab, newline and formfeed.\n     *\n     * @return the split matcher\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.trimMatcher()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Matches the String trim() whitespace characters.\n     *\n     * @return the trim matcher\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.singleQuoteMatcher()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Returns a matcher which matches the single quote character.\n     *\n     * @return a matcher for a single quote\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.doubleQuoteMatcher()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Returns a matcher which matches the double quote character.\n     *\n     * @return a matcher for a double quote\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.quoteMatcher()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Returns a matcher which matches the single or double quote character.\n     *\n     * @return a matcher for a single or double quote\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.noneMatcher()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Matches no characters.\n     *\n     * @return a matcher that matches nothing\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.charMatcher(char)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Constructor that creates a matcher from a character.\n     *\n     * @param ch  the character to match, must not be null\n     * @return a new Matcher for the given char\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.charSetMatcher(char[])",
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
      "signature": "org.apache.commons.lang.text.StrMatcher.charSetMatcher(java.lang.String)",
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
      "signature": "org.apache.commons.lang.text.StrMatcher.stringMatcher(java.lang.String)",
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
      "signature": "org.apache.commons.lang.text.StrMatcher.StrMatcher()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Constructor.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.isMatch(char[], int, int, int)",
      "begin_line": 243,
      "end_line": 243,
      "comment": "\n     * Returns the number of matching characters, zero for no match.\n     * \u003cp\u003e\n     * This method is called to check for a match.\n     * The parameter \u003ccode\u003epos\u003c/code\u003e represents the current position to be\n     * checked in the string \u003ccode\u003ebuffer\u003c/code\u003e (a character array which must\n     * not be changed).\n     * The API guarantees that \u003ccode\u003epos\u003c/code\u003e is a valid index for \u003ccode\u003ebuffer\u003c/code\u003e.\n     * \u003cp\u003e\n     * The character array may be larger than the active area to be matched.\n     * Only values in the buffer between the specifed indices may be accessed.\n     * \u003cp\u003e\n     * The matching code may check one character or many.\n     * It may check characters preceeding \u003ccode\u003epos\u003c/code\u003e as well as those\n     * after, so long as no checks exceed the bounds specified.\n     * \u003cp\u003e\n     * It must return zero for no match, or a positive number if a match was found.\n     * The number indicates the number of characters that matched.\n     *\n     * @param buffer  the text content to match against, do not change\n     * @param pos  the starting position for the match, valid for buffer\n     * @param bufferStart  the first active index in the buffer, valid for buffer\n     * @param bufferEnd  the end index (exclusive) of the active buffer, valid for buffer\n     * @return the number of matching characters, zero for no match\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "CharSetMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.StrMatcher"
      ],
      "begin_line": 249,
      "end_line": 276,
      "comment": "\n     * Class used to define a set of characters for matching purposes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "chars"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": " The set of characters to match. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrMatcher.CharSetMatcher.CharSetMatcher(char[])",
      "begin_line": 258,
      "end_line": 262,
      "comment": "\n         * Constructor that creates a matcher from a character array.\n         *\n         * @param chars  the characters to match, must not be null\n         ",
      "child_ranges": [
        "(line 259,col 13)-(line 259,col 20)",
        "(line 260,col 13)-(line 260,col 48)",
        "(line 261,col 13)-(line 261,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.CharSetMatcher.isMatch(char[], int, int, int)",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n         * Returns whether or not the given charatcer matches.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 274,col 13)-(line 274,col 72)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CharMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.StrMatcher"
      ],
      "begin_line": 282,
      "end_line": 308,
      "comment": "\n     * Class used to define a character for matching purposes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ch"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": " The character to match. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrMatcher.CharMatcher.CharMatcher(char)",
      "begin_line": 291,
      "end_line": 294,
      "comment": "\n         * Constructor that creates a matcher that matches a single character.\n         *\n         * @param ch  the character to match\n         ",
      "child_ranges": [
        "(line 292,col 13)-(line 292,col 20)",
        "(line 293,col 13)-(line 293,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.CharMatcher.isMatch(char[], int, int, int)",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\n         * Returns whether or not the given character matches.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 306,col 13)-(line 306,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.StrMatcher"
      ],
      "begin_line": 314,
      "end_line": 349,
      "comment": "\n     * Class used to define a set of characters for matching purposes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "chars"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": " The string to match, as a character array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrMatcher.StringMatcher.StringMatcher(java.lang.String)",
      "begin_line": 323,
      "end_line": 326,
      "comment": "\n         * Constructor that creates a matcher from a String.\n         *\n         * @param str  the string to match, must not be null\n         ",
      "child_ranges": [
        "(line 324,col 13)-(line 324,col 20)",
        "(line 325,col 13)-(line 325,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.StringMatcher.isMatch(char[], int, int, int)",
      "begin_line": 337,
      "end_line": 348,
      "comment": "\n         * Returns whether or not the given text matches the stored string.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 338,col 13)-(line 338,col 35)",
        "(line 339,col 13)-(line 341,col 13)",
        "(line 342,col 13)-(line 346,col 13)",
        "(line 347,col 13)-(line 347,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NoMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.StrMatcher"
      ],
      "begin_line": 355,
      "end_line": 376,
      "comment": "\n     * Class used to match no characters.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrMatcher.NoMatcher.NoMatcher()",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eNoMatcher\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 361,col 13)-(line 361,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.NoMatcher.isMatch(char[], int, int, int)",
      "begin_line": 373,
      "end_line": 375,
      "comment": "\n         * Always returns \u003ccode\u003efalse\u003c/code\u003e.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 374,col 13)-(line 374,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TrimMatcher",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.StrMatcher"
      ],
      "begin_line": 382,
      "end_line": 403,
      "comment": "\n     * Class used to match whitespace as per trim().\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrMatcher.TrimMatcher.TrimMatcher()",
      "begin_line": 387,
      "end_line": 389,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eTrimMatcher\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 388,col 13)-(line 388,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrMatcher.TrimMatcher.isMatch(char[], int, int, int)",
      "begin_line": 400,
      "end_line": 402,
      "comment": "\n         * Returns whether or not the given charatcer matches.\n         *\n         * @param buffer  the text content to match against, do not change\n         * @param pos  the starting position for the match, valid for buffer\n         * @param bufferStart  the first active index in the buffer, valid for buffer\n         * @param bufferEnd  the end index of the active buffer, valid for buffer\n         * @return the number of matching characters, zero for no match\n         ",
      "child_ranges": [
        "(line 401,col 13)-(line 401,col 45)"
      ]
    }
  ]
}