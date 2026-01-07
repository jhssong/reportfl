{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/text/StrTokenizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrTokenizer",
      "is_interface": false,
      "parent_types": [
        "java.util.ListIterator\u003cjava.lang.String\u003e",
        "java.lang.Cloneable"
      ],
      "begin_line": 87,
      "end_line": 1106,
      "comment": "\n * Tokenizes a string based based on delimiters (separators)\n * and supporting quoting and ignored character concepts.\n * \u003cp\u003e\n * This class can split a String into many smaller strings. It aims\n * to do a similar job to {@link java.util.StringTokenizer StringTokenizer},\n * however it offers much more control and flexibility including implementing\n * the \u003ccode\u003eListIterator\u003c/code\u003e interface. By default, it is set up\n * like \u003ccode\u003eStringTokenizer\u003c/code\u003e.\n * \u003cp\u003e\n * The input String is split into a number of \u003ci\u003etokens\u003c/i\u003e.\n * Each token is separated from the next String by a \u003ci\u003edelimiter\u003c/i\u003e.\n * One or more delimiter characters must be specified.\n * \u003cp\u003e\n * Each token may be surrounded by quotes.\n * The \u003ci\u003equote\u003c/i\u003e matcher specifies the quote character(s).\n * A quote may be escaped within a quoted section by duplicating itself.\n * \u003cp\u003e\n * Between each token and the delimiter are potentially characters that need trimming.\n * The \u003ci\u003etrimmer\u003c/i\u003e matcher specifies these characters.\n * One usage might be to trim whitespace characters.\n * \u003cp\u003e\n * At any point outside the quotes there might potentially be invalid characters.\n * The \u003ci\u003eignored\u003c/i\u003e matcher specifies these characters to be removed.\n * One usage might be to remove new line characters.\n * \u003cp\u003e\n * Empty tokens may be removed or returned as null.\n * \u003cpre\u003e\n * \"a,b,c\"         - Three tokens \"a\",\"b\",\"c\"   (comma delimiter)\n * \" a, b , c \"    - Three tokens \"a\",\"b\",\"c\"   (default CSV processing trims whitespace)\n * \"a, \", b ,\", c\" - Three tokens \"a, \" , \" b \", \", c\" (quoted text untouched)\n * \u003c/pre\u003e\n * \u003cp\u003e\n *\n * This tokenizer has the following properties and options:\n *\n * \u003ctable\u003e\n *  \u003ctr\u003e\n *   \u003cth\u003eProperty\u003c/th\u003e\u003cth\u003eType\u003c/th\u003e\u003cth\u003eDefault\u003c/th\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003edelim\u003c/td\u003e\u003ctd\u003eCharSetMatcher\u003c/td\u003e\u003ctd\u003e{ \\t\\n\\r\\f}\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003equote\u003c/td\u003e\u003ctd\u003eNoneMatcher\u003c/td\u003e\u003ctd\u003e{}\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003eignore\u003c/td\u003e\u003ctd\u003eNoneMatcher\u003c/td\u003e\u003ctd\u003e{}\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003eemptyTokenAsNull\u003c/td\u003e\u003ctd\u003eboolean\u003c/td\u003e\u003ctd\u003efalse\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003eignoreEmptyTokens\u003c/td\u003e\u003ctd\u003eboolean\u003c/td\u003e\u003ctd\u003etrue\u003c/td\u003e\n *  \u003c/tr\u003e\n * \u003c/table\u003e\n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CSV_TOKENIZER_PROTOTYPE"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TSV_TOKENIZER_PROTOTYPE"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "chars"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " The text to work on. "
    },
    {
      "type": "field",
      "varNames": [
        "tokens"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The parsed tokens "
    },
    {
      "type": "field",
      "varNames": [
        "tokenPos"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " The current iteration position "
    },
    {
      "type": "field",
      "varNames": [
        "delimMatcher"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " The delimiter matcher "
    },
    {
      "type": "field",
      "varNames": [
        "quoteMatcher"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " The quote matcher "
    },
    {
      "type": "field",
      "varNames": [
        "ignoredMatcher"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " The ignored matcher "
    },
    {
      "type": "field",
      "varNames": [
        "trimmerMatcher"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " The trimmer matcher "
    },
    {
      "type": "field",
      "varNames": [
        "emptyAsNull"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " Whether to return empty tokens as null "
    },
    {
      "type": "field",
      "varNames": [
        "ignoreEmptyTokens"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " Whether to ignore empty tokens "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getCSVClone()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Returns a clone of \u003ccode\u003eCSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     * \n     * @return a clone of \u003ccode\u003eCSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getCSVInstance()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Gets a new tokenizer instance which parses Comma Separated Value strings\n     * initializing it with the given input.  The default for CSV processing\n     * will be trim whitespace from both ends (which can be overridden with\n     * the setTrimmer method).\n     * \u003cp\u003e\n     * You must call a \"reset\" method to set the string which you want to parse.\n     * @return a new tokenizer instance which parses Comma Separated Value strings\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(java.lang.String)",
      "begin_line": 163,
      "end_line": 167,
      "comment": "\n     * Gets a new tokenizer instance which parses Comma Separated Value strings\n     * initializing it with the given input.  The default for CSV processing\n     * will be trim whitespace from both ends (which can be overridden with\n     * the setTrimmer method).\n     *\n     * @param input  the text to parse\n     * @return a new tokenizer instance which parses Comma Separated Value strings\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 41)",
        "(line 165,col 9)-(line 165,col 25)",
        "(line 166,col 9)-(line 166,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(char[])",
      "begin_line": 178,
      "end_line": 182,
      "comment": "\n     * Gets a new tokenizer instance which parses Comma Separated Value strings\n     * initializing it with the given input.  The default for CSV processing\n     * will be trim whitespace from both ends (which can be overridden with\n     * the setTrimmer method).\n     *\n     * @param input  the text to parse\n     * @return a new tokenizer instance which parses Comma Separated Value strings\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 41)",
        "(line 180,col 9)-(line 180,col 25)",
        "(line 181,col 9)-(line 181,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getTSVClone()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * Returns a clone of \u003ccode\u003eTSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     * \n     * @return a clone of \u003ccode\u003eTSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getTSVInstance()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * Gets a new tokenizer instance which parses Tab Separated Value strings.\n     * The default for CSV processing will be trim whitespace from both ends\n     * (which can be overridden with the setTrimmer method).\n     * \u003cp\u003e\n     * You must call a \"reset\" method to set the string which you want to parse.\n     * @return a new tokenizer instance which parses Tab Separated Value strings.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(java.lang.String)",
      "begin_line": 213,
      "end_line": 217,
      "comment": "\n     * Gets a new tokenizer instance which parses Tab Separated Value strings.\n     * The default for CSV processing will be trim whitespace from both ends\n     * (which can be overridden with the setTrimmer method).\n     * @param input  the string to parse\n     * @return a new tokenizer instance which parses Tab Separated Value strings.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 41)",
        "(line 215,col 9)-(line 215,col 25)",
        "(line 216,col 9)-(line 216,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(char[])",
      "begin_line": 226,
      "end_line": 230,
      "comment": "\n     * Gets a new tokenizer instance which parses Tab Separated Value strings.\n     * The default for CSV processing will be trim whitespace from both ends\n     * (which can be overridden with the setTrimmer method).\n     * @param input  the string to parse\n     * @return a new tokenizer instance which parses Tab Separated Value strings.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 41)",
        "(line 228,col 9)-(line 228,col 25)",
        "(line 229,col 9)-(line 229,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer()",
      "begin_line": 239,
      "end_line": 242,
      "comment": "\n     * Constructs a tokenizer splitting on space, tab, newline and formfeed\n     * as per StringTokenizer, but with no text to tokenize.\n     * \u003cp\u003e\n     * This constructor is normally used with {@link #reset(String)}.\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 16)",
        "(line 241,col 9)-(line 241,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(java.lang.String)",
      "begin_line": 250,
      "end_line": 257,
      "comment": "\n     * Constructs a tokenizer splitting on space, tab, newline and formfeed\n     * as per StringTokenizer.\n     *\n     * @param input  the string which is to be parsed\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 16)",
        "(line 252,col 9)-(line 256,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(java.lang.String, char)",
      "begin_line": 265,
      "end_line": 268,
      "comment": "\n     * Constructs a tokenizer splitting on the specified delimiter character.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter character\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 20)",
        "(line 267,col 9)-(line 267,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(java.lang.String, java.lang.String)",
      "begin_line": 276,
      "end_line": 279,
      "comment": "\n     * Constructs a tokenizer splitting on the specified delimiter string.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter string\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 20)",
        "(line 278,col 9)-(line 278,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(java.lang.String, org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 287,
      "end_line": 290,
      "comment": "\n     * Constructs a tokenizer splitting using the specified delimiter matcher.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter matcher\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 20)",
        "(line 289,col 9)-(line 289,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(java.lang.String, char, char)",
      "begin_line": 300,
      "end_line": 303,
      "comment": "\n     * Constructs a tokenizer splitting on the specified delimiter character\n     * and handling quotes using the specified quote character.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter character\n     * @param quote  the field quoted string character\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 27)",
        "(line 302,col 9)-(line 302,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(java.lang.String, org.apache.commons.lang3.text.StrMatcher, org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 313,
      "end_line": 316,
      "comment": "\n     * Constructs a tokenizer splitting using the specified delimiter matcher\n     * and handling quotes using the specified quote matcher.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter matcher\n     * @param quote  the field quoted string matcher\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 27)",
        "(line 315,col 9)-(line 315,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(char[])",
      "begin_line": 324,
      "end_line": 327,
      "comment": "\n     * Constructs a tokenizer splitting on space, tab, newline and formfeed\n     * as per StringTokenizer.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 16)",
        "(line 326,col 9)-(line 326,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(char[], char)",
      "begin_line": 335,
      "end_line": 338,
      "comment": "\n     * Constructs a tokenizer splitting on the specified character.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim the field delimiter character\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 20)",
        "(line 337,col 9)-(line 337,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(char[], java.lang.String)",
      "begin_line": 346,
      "end_line": 349,
      "comment": "\n     * Constructs a tokenizer splitting on the specified string.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim the field delimiter string\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 20)",
        "(line 348,col 9)-(line 348,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(char[], org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 357,
      "end_line": 360,
      "comment": "\n     * Constructs a tokenizer splitting using the specified delimiter matcher.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim  the field delimiter matcher\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 20)",
        "(line 359,col 9)-(line 359,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(char[], char, char)",
      "begin_line": 370,
      "end_line": 373,
      "comment": "\n     * Constructs a tokenizer splitting on the specified delimiter character\n     * and handling quotes using the specified quote character.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim  the field delimiter character\n     * @param quote  the field quoted string character\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 27)",
        "(line 372,col 9)-(line 372,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(char[], org.apache.commons.lang3.text.StrMatcher, org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 383,
      "end_line": 386,
      "comment": "\n     * Constructs a tokenizer splitting using the specified delimiter matcher\n     * and handling quotes using the specified quote matcher.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim  the field delimiter character\n     * @param quote  the field quoted string character\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 27)",
        "(line 385,col 9)-(line 385,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.size()",
      "begin_line": 395,
      "end_line": 398,
      "comment": "\n     * Gets the number of tokens found in the String.\n     *\n     * @return the number of matched tokens\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 25)",
        "(line 397,col 9)-(line 397,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.nextToken()",
      "begin_line": 407,
      "end_line": 412,
      "comment": "\n     * Gets the next token from the String.\n     * Equivalent to {@link #next()} except it returns null rather than\n     * throwing {@link NoSuchElementException} when no tokens remain.\n     *\n     * @return the next sequential token, or null when no more tokens are found\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.previousToken()",
      "begin_line": 419,
      "end_line": 424,
      "comment": "\n     * Gets the previous token from the String.\n     *\n     * @return the previous sequential token, or null when no more tokens are found\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getTokenArray()",
      "begin_line": 431,
      "end_line": 434,
      "comment": "\n     * Gets a copy of the full token list as an independent modifiable array.\n     *\n     * @return the tokens as a String array\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 25)",
        "(line 433,col 9)-(line 433,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getTokenList()",
      "begin_line": 441,
      "end_line": 448,
      "comment": "\n     * Gets a copy of the full token list as an independent modifiable list.\n     *\n     * @return the tokens as a String array\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 25)",
        "(line 443,col 9)-(line 443,col 65)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 447,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.reset()",
      "begin_line": 457,
      "end_line": 461,
      "comment": "\n     * Resets this tokenizer, forgetting all parsing and iteration already completed.\n     * \u003cp\u003e\n     * This method allows the same tokenizer to be reused for the same String.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 21)",
        "(line 459,col 9)-(line 459,col 22)",
        "(line 460,col 9)-(line 460,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.reset(java.lang.String)",
      "begin_line": 471,
      "end_line": 479,
      "comment": "\n     * Reset this tokenizer, giving it a new input string to parse.\n     * In this manner you can re-use a tokenizer with the same settings\n     * on multiple input lines.\n     *\n     * @param input  the new string to tokenize, null sets no text to parse\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 16)",
        "(line 473,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.reset(char[])",
      "begin_line": 489,
      "end_line": 493,
      "comment": "\n     * Reset this tokenizer, giving it a new input string to parse.\n     * In this manner you can re-use a tokenizer with the same settings\n     * on multiple input lines.\n     *\n     * @param input  the new character array to tokenize, not cloned, null sets no text to parse\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 16)",
        "(line 491,col 9)-(line 491,col 45)",
        "(line 492,col 9)-(line 492,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.hasNext()",
      "begin_line": 502,
      "end_line": 505,
      "comment": "\n     * Checks whether there are any more tokens.\n     *\n     * @return true if there are more tokens\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 25)",
        "(line 504,col 9)-(line 504,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.next()",
      "begin_line": 513,
      "end_line": 518,
      "comment": "\n     * Gets the next token.\n     *\n     * @return the next String token\n     * @throws NoSuchElementException if there are no more elements\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.nextIndex()",
      "begin_line": 525,
      "end_line": 527,
      "comment": "\n     * Gets the index of the next token to return.\n     *\n     * @return the next token index\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.hasPrevious()",
      "begin_line": 534,
      "end_line": 537,
      "comment": "\n     * Checks whether there are any previous tokens that can be iterated to.\n     *\n     * @return true if there are previous tokens\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 25)",
        "(line 536,col 9)-(line 536,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.previous()",
      "begin_line": 544,
      "end_line": 549,
      "comment": "\n     * Gets the token previous to the last returned token.\n     *\n     * @return the previous token\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 548,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.previousIndex()",
      "begin_line": 556,
      "end_line": 558,
      "comment": "\n     * Gets the index of the previous token.\n     *\n     * @return the previous token index\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.remove()",
      "begin_line": 565,
      "end_line": 567,
      "comment": "\n     * Unsupported ListIterator operation.\n     *\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.set(java.lang.String)",
      "begin_line": 574,
      "end_line": 576,
      "comment": "\n     * Unsupported ListIterator operation.\n     * @param obj this parameter ignored.\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.add(java.lang.String)",
      "begin_line": 583,
      "end_line": 585,
      "comment": "\n     * Unsupported ListIterator operation.\n     * @param obj this parameter ignored.\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.checkTokenized()",
      "begin_line": 592,
      "end_line": 603,
      "comment": "\n     * Checks if tokenization has been done, and if not then do it.\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 602,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.tokenize(char[], int, int)",
      "begin_line": 625,
      "end_line": 644,
      "comment": "\n     * Internal method to performs the tokenization.\n     * \u003cp\u003e\n     * Most users of this class do not need to call this method. This method\n     * will be called automatically by other (public) methods when required.\n     * \u003cp\u003e\n     * This method exists to allow subclasses to add code before or after the\n     * tokenization. For example, a subclass could alter the character array,\n     * offset or count to be parsed, or call the tokenizer multiple times on\n     * multiple strings. It is also be possible to filter the results.\n     * \u003cp\u003e\n     * \u003ccode\u003eStrTokenizer\u003c/code\u003e will always pass a zero offset and a count\n     * equal to the length of the array to this method, however a subclass\n     * may pass other values, or even an entirely different array.\n     * \n     * @param chars  the character array being tokenized, may be null\n     * @param offset  the start position within the character array, must be valid\n     * @param count  the number of characters to tokenize, must be valid\n     * @return the modifiable list of String tokens, unmodifiable if null array or zero count\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 629,col 42)",
        "(line 630,col 9)-(line 630,col 54)",
        "(line 631,col 9)-(line 631,col 25)",
        "(line 634,col 9)-(line 642,col 9)",
        "(line 643,col 9)-(line 643,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.addToken(java.util.List\u003cjava.lang.String\u003e, java.lang.String)",
      "begin_line": 652,
      "end_line": 662,
      "comment": "\n     * Adds a token to a list, paying attention to the parameters we\u0027ve set.\n     *\n     * @param list  the list to add to\n     * @param tok  the token to add\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 660,col 9)",
        "(line 661,col 9)-(line 661,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.readNextToken(char[], int, int, org.apache.commons.lang3.text.StrBuilder, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 675,
      "end_line": 709,
      "comment": "\n     * Reads character by character through the String to get the next token.\n     *\n     * @param chars  the character array being tokenized\n     * @param start  the first character of field\n     * @param len  the length of the character array being tokenized\n     * @param workArea  a temporary work area\n     * @param tokens  the list of parsed tokens\n     * @return the starting position of the next field (the character\n     *  immediately after the delimiter), or -1 if end of string found\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 688,col 9)",
        "(line 691,col 9)-(line 694,col 9)",
        "(line 697,col 9)-(line 697,col 79)",
        "(line 698,col 9)-(line 701,col 9)",
        "(line 704,col 9)-(line 704,col 75)",
        "(line 705,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 708,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.readWithQuotes(char[], int, int, org.apache.commons.lang3.text.StrBuilder, java.util.List\u003cjava.lang.String\u003e, int, int)",
      "begin_line": 725,
      "end_line": 810,
      "comment": "\n     * Reads a possibly quoted string token.\n     *\n     * @param chars  the character array being tokenized\n     * @param start  the first character of field\n     * @param len  the length of the character array being tokenized\n     * @param workArea  a temporary work area\n     * @param tokens  the list of parsed tokens\n     * @param quoteStart  the start position of the matched quote, 0 if no quoting\n     * @param quoteLen  the length of the matched quote, 0 if no quoting\n     * @return the starting position of the next field (the character\n     *  immediately after the delimiter, or if end of string found,\n     *  then the length of string\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 25)",
        "(line 730,col 9)-(line 730,col 24)",
        "(line 731,col 9)-(line 731,col 41)",
        "(line 732,col 9)-(line 732,col 26)",
        "(line 734,col 9)-(line 805,col 9)",
        "(line 808,col 9)-(line 808,col 59)",
        "(line 809,col 9)-(line 809,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.isQuote(char[], int, int, int, int)",
      "begin_line": 823,
      "end_line": 830,
      "comment": "\n     * Checks if the characters at the index specified match the quote\n     * already matched in readNextToken().\n     *\n     * @param chars  the character array being tokenized\n     * @param pos  the position to check for a quote\n     * @param len  the length of the character array being tokenized\n     * @param quoteStart  the start position of the matched quote, 0 if no quoting\n     * @param quoteLen  the length of the matched quote, 0 if no quoting\n     * @return true if a quote is matched\n     ",
      "child_ranges": [
        "(line 824,col 9)-(line 828,col 9)",
        "(line 829,col 9)-(line 829,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getDelimiterMatcher()",
      "begin_line": 839,
      "end_line": 841,
      "comment": "\n     * Gets the field delimiter matcher.\n     *\n     * @return the delimiter matcher in use\n     ",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setDelimiterMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 851,
      "end_line": 858,
      "comment": "\n     * Sets the field delimiter matcher.\n     * \u003cp\u003e\n     * The delimitier is used to separate one token from another.\n     *\n     * @param delim  the delimiter matcher to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 852,col 9)-(line 856,col 9)",
        "(line 857,col 9)-(line 857,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setDelimiterChar(char)",
      "begin_line": 866,
      "end_line": 868,
      "comment": "\n     * Sets the field delimiter character.\n     *\n     * @param delim  the delimiter character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setDelimiterString(java.lang.String)",
      "begin_line": 876,
      "end_line": 878,
      "comment": "\n     * Sets the field delimiter string.\n     *\n     * @param delim  the delimiter string to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 877,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getQuoteMatcher()",
      "begin_line": 891,
      "end_line": 893,
      "comment": "\n     * Gets the quote matcher currently in use.\n     * \u003cp\u003e\n     * The quote character is used to wrap data between the tokens.\n     * This enables delimiters to be entered as data.\n     * The default value is \u0027\"\u0027 (double quote).\n     *\n     * @return the quote matcher in use\n     ",
      "child_ranges": [
        "(line 892,col 9)-(line 892,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setQuoteMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 904,
      "end_line": 909,
      "comment": "\n     * Set the quote matcher to use.\n     * \u003cp\u003e\n     * The quote character is used to wrap data between the tokens.\n     * This enables delimiters to be entered as data.\n     *\n     * @param quote  the quote matcher to use, null ignored\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 905,col 9)-(line 907,col 9)",
        "(line 908,col 9)-(line 908,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setQuoteChar(char)",
      "begin_line": 920,
      "end_line": 922,
      "comment": "\n     * Sets the quote character to use.\n     * \u003cp\u003e\n     * The quote character is used to wrap data between the tokens.\n     * This enables delimiters to be entered as data.\n     *\n     * @param quote  the quote character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getIgnoredMatcher()",
      "begin_line": 935,
      "end_line": 937,
      "comment": "\n     * Gets the ignored character matcher.\n     * \u003cp\u003e\n     * These characters are ignored when parsing the String, unless they are\n     * within a quoted region.\n     * The default value is not to ignore anything.\n     *\n     * @return the ignored matcher in use\n     ",
      "child_ranges": [
        "(line 936,col 9)-(line 936,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setIgnoredMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 948,
      "end_line": 953,
      "comment": "\n     * Set the matcher for characters to ignore.\n     * \u003cp\u003e\n     * These characters are ignored when parsing the String, unless they are\n     * within a quoted region.\n     *\n     * @param ignored  the ignored matcher to use, null ignored\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 949,col 9)-(line 951,col 9)",
        "(line 952,col 9)-(line 952,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setIgnoredChar(char)",
      "begin_line": 964,
      "end_line": 966,
      "comment": "\n     * Set the character to ignore.\n     * \u003cp\u003e\n     * This character is ignored when parsing the String, unless it is\n     * within a quoted region.\n     *\n     * @param ignored  the ignored character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 965,col 9)-(line 965,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getTrimmerMatcher()",
      "begin_line": 979,
      "end_line": 981,
      "comment": "\n     * Gets the trimmer character matcher.\n     * \u003cp\u003e\n     * These characters are trimmed off on each side of the delimiter\n     * until the token or quote is found.\n     * The default value is not to trim anything.\n     *\n     * @return the trimmer matcher in use\n     ",
      "child_ranges": [
        "(line 980,col 9)-(line 980,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setTrimmerMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 992,
      "end_line": 997,
      "comment": "\n     * Sets the matcher for characters to trim.\n     * \u003cp\u003e\n     * These characters are trimmed off on each side of the delimiter\n     * until the token or quote is found.\n     *\n     * @param trimmer  the trimmer matcher to use, null ignored\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 993,col 9)-(line 995,col 9)",
        "(line 996,col 9)-(line 996,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.isEmptyTokenAsNull()",
      "begin_line": 1006,
      "end_line": 1008,
      "comment": "\n     * Gets whether the tokenizer currently returns empty tokens as null.\n     * The default for this property is false.\n     *\n     * @return true if empty tokens are returned as null\n     ",
      "child_ranges": [
        "(line 1007,col 9)-(line 1007,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setEmptyTokenAsNull(boolean)",
      "begin_line": 1017,
      "end_line": 1020,
      "comment": "\n     * Sets whether the tokenizer should return empty tokens as null.\n     * The default for this property is false.\n     *\n     * @param emptyAsNull  whether empty tokens are returned as null\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1018,col 39)",
        "(line 1019,col 9)-(line 1019,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.isIgnoreEmptyTokens()",
      "begin_line": 1029,
      "end_line": 1031,
      "comment": "\n     * Gets whether the tokenizer currently ignores empty tokens.\n     * The default for this property is true.\n     *\n     * @return true if empty tokens are not returned\n     ",
      "child_ranges": [
        "(line 1030,col 9)-(line 1030,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setIgnoreEmptyTokens(boolean)",
      "begin_line": 1040,
      "end_line": 1043,
      "comment": "\n     * Sets whether the tokenizer should ignore and not return empty tokens.\n     * The default for this property is true.\n     *\n     * @param ignoreEmptyTokens  whether empty tokens are not returned\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1041,col 51)",
        "(line 1042,col 9)-(line 1042,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getContent()",
      "begin_line": 1051,
      "end_line": 1056,
      "comment": "\n     * Gets the String content that the tokenizer is parsing.\n     *\n     * @return the string content being parsed\n     ",
      "child_ranges": [
        "(line 1052,col 9)-(line 1054,col 9)",
        "(line 1055,col 9)-(line 1055,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.clone()",
      "begin_line": 1066,
      "end_line": 1073,
      "comment": "\n     * Creates a new instance of this Tokenizer. The new instance is reset so\n     * that it will be at the start of the token list.\n     * If a {@link CloneNotSupportedException} is caught, return \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @return a new instance of this Tokenizer which has been reset.\n     ",
      "child_ranges": [
        "(line 1068,col 9)-(line 1072,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.cloneReset()",
      "begin_line": 1082,
      "end_line": 1090,
      "comment": "\n     * Creates a new instance of this Tokenizer. The new instance is reset so that\n     * it will be at the start of the token list.\n     * \n     * @return a new instance of this Tokenizer which has been reset.\n     * @throws CloneNotSupportedException if there is a problem cloning\n     ",
      "child_ranges": [
        "(line 1084,col 9)-(line 1084,col 59)",
        "(line 1085,col 9)-(line 1087,col 9)",
        "(line 1088,col 9)-(line 1088,col 23)",
        "(line 1089,col 9)-(line 1089,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.toString()",
      "begin_line": 1098,
      "end_line": 1104,
      "comment": "\n     * Gets the String content that the tokenizer is parsing.\n     *\n     * @return the string content being parsed\n     ",
      "child_ranges": [
        "(line 1100,col 9)-(line 1102,col 9)",
        "(line 1103,col 9)-(line 1103,col 47)"
      ]
    }
  ]
}