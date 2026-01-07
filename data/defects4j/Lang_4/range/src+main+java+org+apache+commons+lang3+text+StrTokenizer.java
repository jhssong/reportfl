{
  "filepath": "/tmp/Lang-4b/src/main/java/org/apache/commons/lang3/text/StrTokenizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrTokenizer",
      "is_interface": false,
      "parent_types": [
        "java.util.ListIterator\u003cjava.lang.String\u003e",
        "java.lang.Cloneable"
      ],
      "begin_line": 88,
      "end_line": 1114,
      "comment": "\n * Tokenizes a string based based on delimiters (separators)\n * and supporting quoting and ignored character concepts.\n * \u003cp\u003e\n * This class can split a String into many smaller strings. It aims\n * to do a similar job to {@link java.util.StringTokenizer StringTokenizer},\n * however it offers much more control and flexibility including implementing\n * the \u003ccode\u003eListIterator\u003c/code\u003e interface. By default, it is set up\n * like \u003ccode\u003eStringTokenizer\u003c/code\u003e.\n * \u003cp\u003e\n * The input String is split into a number of \u003ci\u003etokens\u003c/i\u003e.\n * Each token is separated from the next String by a \u003ci\u003edelimiter\u003c/i\u003e.\n * One or more delimiter characters must be specified.\n * \u003cp\u003e\n * Each token may be surrounded by quotes.\n * The \u003ci\u003equote\u003c/i\u003e matcher specifies the quote character(s).\n * A quote may be escaped within a quoted section by duplicating itself.\n * \u003cp\u003e\n * Between each token and the delimiter are potentially characters that need trimming.\n * The \u003ci\u003etrimmer\u003c/i\u003e matcher specifies these characters.\n * One usage might be to trim whitespace characters.\n * \u003cp\u003e\n * At any point outside the quotes there might potentially be invalid characters.\n * The \u003ci\u003eignored\u003c/i\u003e matcher specifies these characters to be removed.\n * One usage might be to remove new line characters.\n * \u003cp\u003e\n * Empty tokens may be removed or returned as null.\n * \u003cpre\u003e\n * \"a,b,c\"         - Three tokens \"a\",\"b\",\"c\"   (comma delimiter)\n * \" a, b , c \"    - Three tokens \"a\",\"b\",\"c\"   (default CSV processing trims whitespace)\n * \"a, \", b ,\", c\" - Three tokens \"a, \" , \" b \", \", c\" (quoted text untouched)\n * \u003c/pre\u003e\n * \u003cp\u003e\n *\n * This tokenizer has the following properties and options:\n *\n * \u003ctable\u003e\n *  \u003ctr\u003e\n *   \u003cth\u003eProperty\u003c/th\u003e\u003cth\u003eType\u003c/th\u003e\u003cth\u003eDefault\u003c/th\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003edelim\u003c/td\u003e\u003ctd\u003eCharSetMatcher\u003c/td\u003e\u003ctd\u003e{ \\t\\n\\r\\f}\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003equote\u003c/td\u003e\u003ctd\u003eNoneMatcher\u003c/td\u003e\u003ctd\u003e{}\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003eignore\u003c/td\u003e\u003ctd\u003eNoneMatcher\u003c/td\u003e\u003ctd\u003e{}\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003eemptyTokenAsNull\u003c/td\u003e\u003ctd\u003eboolean\u003c/td\u003e\u003ctd\u003efalse\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003eignoreEmptyTokens\u003c/td\u003e\u003ctd\u003eboolean\u003c/td\u003e\u003ctd\u003etrue\u003c/td\u003e\n *  \u003c/tr\u003e\n * \u003c/table\u003e\n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CSV_TOKENIZER_PROTOTYPE"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TSV_TOKENIZER_PROTOTYPE"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "chars"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " The text to work on. "
    },
    {
      "type": "field",
      "varNames": [
        "tokens"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " The parsed tokens "
    },
    {
      "type": "field",
      "varNames": [
        "tokenPos"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The current iteration position "
    },
    {
      "type": "field",
      "varNames": [
        "delimMatcher"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The delimiter matcher "
    },
    {
      "type": "field",
      "varNames": [
        "quoteMatcher"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " The quote matcher "
    },
    {
      "type": "field",
      "varNames": [
        "ignoredMatcher"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " The ignored matcher "
    },
    {
      "type": "field",
      "varNames": [
        "trimmerMatcher"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The trimmer matcher "
    },
    {
      "type": "field",
      "varNames": [
        "emptyAsNull"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " Whether to return empty tokens as null "
    },
    {
      "type": "field",
      "varNames": [
        "ignoreEmptyTokens"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " Whether to ignore empty tokens "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getCSVClone()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Returns a clone of \u003ccode\u003eCSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     * \n     * @return a clone of \u003ccode\u003eCSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getCSVInstance()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Gets a new tokenizer instance which parses Comma Separated Value strings\n     * initializing it with the given input.  The default for CSV processing\n     * will be trim whitespace from both ends (which can be overridden with\n     * the setTrimmer method).\n     * \u003cp\u003e\n     * You must call a \"reset\" method to set the string which you want to parse.\n     * @return a new tokenizer instance which parses Comma Separated Value strings\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(java.lang.String)",
      "begin_line": 164,
      "end_line": 168,
      "comment": "\n     * Gets a new tokenizer instance which parses Comma Separated Value strings\n     * initializing it with the given input.  The default for CSV processing\n     * will be trim whitespace from both ends (which can be overridden with\n     * the setTrimmer method).\n     *\n     * @param input  the text to parse\n     * @return a new tokenizer instance which parses Comma Separated Value strings\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 47)",
        "(line 166,col 9)-(line 166,col 25)",
        "(line 167,col 9)-(line 167,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(char[])",
      "begin_line": 179,
      "end_line": 183,
      "comment": "\n     * Gets a new tokenizer instance which parses Comma Separated Value strings\n     * initializing it with the given input.  The default for CSV processing\n     * will be trim whitespace from both ends (which can be overridden with\n     * the setTrimmer method).\n     *\n     * @param input  the text to parse\n     * @return a new tokenizer instance which parses Comma Separated Value strings\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 47)",
        "(line 181,col 9)-(line 181,col 25)",
        "(line 182,col 9)-(line 182,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getTSVClone()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Returns a clone of \u003ccode\u003eTSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     * \n     * @return a clone of \u003ccode\u003eTSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getTSVInstance()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * Gets a new tokenizer instance which parses Tab Separated Value strings.\n     * The default for CSV processing will be trim whitespace from both ends\n     * (which can be overridden with the setTrimmer method).\n     * \u003cp\u003e\n     * You must call a \"reset\" method to set the string which you want to parse.\n     * @return a new tokenizer instance which parses Tab Separated Value strings.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(java.lang.String)",
      "begin_line": 214,
      "end_line": 218,
      "comment": "\n     * Gets a new tokenizer instance which parses Tab Separated Value strings.\n     * The default for CSV processing will be trim whitespace from both ends\n     * (which can be overridden with the setTrimmer method).\n     * @param input  the string to parse\n     * @return a new tokenizer instance which parses Tab Separated Value strings.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 47)",
        "(line 216,col 9)-(line 216,col 25)",
        "(line 217,col 9)-(line 217,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(char[])",
      "begin_line": 227,
      "end_line": 231,
      "comment": "\n     * Gets a new tokenizer instance which parses Tab Separated Value strings.\n     * The default for CSV processing will be trim whitespace from both ends\n     * (which can be overridden with the setTrimmer method).\n     * @param input  the string to parse\n     * @return a new tokenizer instance which parses Tab Separated Value strings.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 47)",
        "(line 229,col 9)-(line 229,col 25)",
        "(line 230,col 9)-(line 230,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer()",
      "begin_line": 240,
      "end_line": 243,
      "comment": "\n     * Constructs a tokenizer splitting on space, tab, newline and formfeed\n     * as per StringTokenizer, but with no text to tokenize.\n     * \u003cp\u003e\n     * This constructor is normally used with {@link #reset(String)}.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 16)",
        "(line 242,col 9)-(line 242,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(java.lang.String)",
      "begin_line": 251,
      "end_line": 258,
      "comment": "\n     * Constructs a tokenizer splitting on space, tab, newline and formfeed\n     * as per StringTokenizer.\n     *\n     * @param input  the string which is to be parsed\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 16)",
        "(line 253,col 9)-(line 257,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(java.lang.String, char)",
      "begin_line": 266,
      "end_line": 269,
      "comment": "\n     * Constructs a tokenizer splitting on the specified delimiter character.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter character\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 20)",
        "(line 268,col 9)-(line 268,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(java.lang.String, java.lang.String)",
      "begin_line": 277,
      "end_line": 280,
      "comment": "\n     * Constructs a tokenizer splitting on the specified delimiter string.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter string\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 20)",
        "(line 279,col 9)-(line 279,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(java.lang.String, org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 288,
      "end_line": 291,
      "comment": "\n     * Constructs a tokenizer splitting using the specified delimiter matcher.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter matcher\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 20)",
        "(line 290,col 9)-(line 290,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(java.lang.String, char, char)",
      "begin_line": 301,
      "end_line": 304,
      "comment": "\n     * Constructs a tokenizer splitting on the specified delimiter character\n     * and handling quotes using the specified quote character.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter character\n     * @param quote  the field quoted string character\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 27)",
        "(line 303,col 9)-(line 303,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(java.lang.String, org.apache.commons.lang3.text.StrMatcher, org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 314,
      "end_line": 317,
      "comment": "\n     * Constructs a tokenizer splitting using the specified delimiter matcher\n     * and handling quotes using the specified quote matcher.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter matcher\n     * @param quote  the field quoted string matcher\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 27)",
        "(line 316,col 9)-(line 316,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(char[])",
      "begin_line": 325,
      "end_line": 328,
      "comment": "\n     * Constructs a tokenizer splitting on space, tab, newline and formfeed\n     * as per StringTokenizer.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 16)",
        "(line 327,col 9)-(line 327,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(char[], char)",
      "begin_line": 336,
      "end_line": 339,
      "comment": "\n     * Constructs a tokenizer splitting on the specified character.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim the field delimiter character\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 20)",
        "(line 338,col 9)-(line 338,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(char[], java.lang.String)",
      "begin_line": 347,
      "end_line": 350,
      "comment": "\n     * Constructs a tokenizer splitting on the specified string.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim the field delimiter string\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 20)",
        "(line 349,col 9)-(line 349,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(char[], org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 358,
      "end_line": 361,
      "comment": "\n     * Constructs a tokenizer splitting using the specified delimiter matcher.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim  the field delimiter matcher\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 20)",
        "(line 360,col 9)-(line 360,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(char[], char, char)",
      "begin_line": 371,
      "end_line": 374,
      "comment": "\n     * Constructs a tokenizer splitting on the specified delimiter character\n     * and handling quotes using the specified quote character.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim  the field delimiter character\n     * @param quote  the field quoted string character\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 27)",
        "(line 373,col 9)-(line 373,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(char[], org.apache.commons.lang3.text.StrMatcher, org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 384,
      "end_line": 387,
      "comment": "\n     * Constructs a tokenizer splitting using the specified delimiter matcher\n     * and handling quotes using the specified quote matcher.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim  the field delimiter character\n     * @param quote  the field quoted string character\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 27)",
        "(line 386,col 9)-(line 386,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.size()",
      "begin_line": 396,
      "end_line": 399,
      "comment": "\n     * Gets the number of tokens found in the String.\n     *\n     * @return the number of matched tokens\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 25)",
        "(line 398,col 9)-(line 398,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.nextToken()",
      "begin_line": 408,
      "end_line": 413,
      "comment": "\n     * Gets the next token from the String.\n     * Equivalent to {@link #next()} except it returns null rather than\n     * throwing {@link NoSuchElementException} when no tokens remain.\n     *\n     * @return the next sequential token, or null when no more tokens are found\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.previousToken()",
      "begin_line": 420,
      "end_line": 425,
      "comment": "\n     * Gets the previous token from the String.\n     *\n     * @return the previous sequential token, or null when no more tokens are found\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getTokenArray()",
      "begin_line": 432,
      "end_line": 435,
      "comment": "\n     * Gets a copy of the full token list as an independent modifiable array.\n     *\n     * @return the tokens as a String array\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 25)",
        "(line 434,col 9)-(line 434,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getTokenList()",
      "begin_line": 442,
      "end_line": 449,
      "comment": "\n     * Gets a copy of the full token list as an independent modifiable list.\n     *\n     * @return the tokens as a String array\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 25)",
        "(line 444,col 9)-(line 444,col 71)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.reset()",
      "begin_line": 458,
      "end_line": 462,
      "comment": "\n     * Resets this tokenizer, forgetting all parsing and iteration already completed.\n     * \u003cp\u003e\n     * This method allows the same tokenizer to be reused for the same String.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 21)",
        "(line 460,col 9)-(line 460,col 22)",
        "(line 461,col 9)-(line 461,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.reset(java.lang.String)",
      "begin_line": 472,
      "end_line": 480,
      "comment": "\n     * Reset this tokenizer, giving it a new input string to parse.\n     * In this manner you can re-use a tokenizer with the same settings\n     * on multiple input lines.\n     *\n     * @param input  the new string to tokenize, null sets no text to parse\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 16)",
        "(line 474,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 479,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.reset(char[])",
      "begin_line": 490,
      "end_line": 494,
      "comment": "\n     * Reset this tokenizer, giving it a new input string to parse.\n     * In this manner you can re-use a tokenizer with the same settings\n     * on multiple input lines.\n     *\n     * @param input  the new character array to tokenize, not cloned, null sets no text to parse\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 16)",
        "(line 492,col 9)-(line 492,col 45)",
        "(line 493,col 9)-(line 493,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.hasNext()",
      "begin_line": 503,
      "end_line": 507,
      "comment": "\n     * Checks whether there are any more tokens.\n     *\n     * @return true if there are more tokens\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 25)",
        "(line 506,col 9)-(line 506,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.next()",
      "begin_line": 515,
      "end_line": 521,
      "comment": "\n     * Gets the next token.\n     *\n     * @return the next String token\n     * @throws NoSuchElementException if there are no more elements\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.nextIndex()",
      "begin_line": 528,
      "end_line": 531,
      "comment": "\n     * Gets the index of the next token to return.\n     *\n     * @return the next token index\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.hasPrevious()",
      "begin_line": 538,
      "end_line": 542,
      "comment": "\n     * Checks whether there are any previous tokens that can be iterated to.\n     *\n     * @return true if there are previous tokens\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 25)",
        "(line 541,col 9)-(line 541,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.previous()",
      "begin_line": 549,
      "end_line": 555,
      "comment": "\n     * Gets the token previous to the last returned token.\n     *\n     * @return the previous token\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.previousIndex()",
      "begin_line": 562,
      "end_line": 565,
      "comment": "\n     * Gets the index of the previous token.\n     *\n     * @return the previous token index\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.remove()",
      "begin_line": 572,
      "end_line": 575,
      "comment": "\n     * Unsupported ListIterator operation.\n     *\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.set(java.lang.String)",
      "begin_line": 582,
      "end_line": 585,
      "comment": "\n     * Unsupported ListIterator operation.\n     * @param obj this parameter ignored.\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.add(java.lang.String)",
      "begin_line": 592,
      "end_line": 595,
      "comment": "\n     * Unsupported ListIterator operation.\n     * @param obj this parameter ignored.\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.checkTokenized()",
      "begin_line": 602,
      "end_line": 613,
      "comment": "\n     * Checks if tokenization has been done, and if not then do it.\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 612,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.tokenize(char[], int, int)",
      "begin_line": 635,
      "end_line": 654,
      "comment": "\n     * Internal method to performs the tokenization.\n     * \u003cp\u003e\n     * Most users of this class do not need to call this method. This method\n     * will be called automatically by other (public) methods when required.\n     * \u003cp\u003e\n     * This method exists to allow subclasses to add code before or after the\n     * tokenization. For example, a subclass could alter the character array,\n     * offset or count to be parsed, or call the tokenizer multiple times on\n     * multiple strings. It is also be possible to filter the results.\n     * \u003cp\u003e\n     * \u003ccode\u003eStrTokenizer\u003c/code\u003e will always pass a zero offset and a count\n     * equal to the length of the array to this method, however a subclass\n     * may pass other values, or even an entirely different array.\n     * \n     * @param chars  the character array being tokenized, may be null\n     * @param offset  the start position within the character array, must be valid\n     * @param count  the number of characters to tokenize, must be valid\n     * @return the modifiable list of String tokens, unmodifiable if null array or zero count\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 639,col 48)",
        "(line 640,col 9)-(line 640,col 60)",
        "(line 641,col 9)-(line 641,col 25)",
        "(line 644,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 653,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.addToken(java.util.List\u003cjava.lang.String\u003e, java.lang.String)",
      "begin_line": 662,
      "end_line": 672,
      "comment": "\n     * Adds a token to a list, paying attention to the parameters we\u0027ve set.\n     *\n     * @param list  the list to add to\n     * @param tok  the token to add\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 671,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.readNextToken(char[], int, int, org.apache.commons.lang3.text.StrBuilder, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 685,
      "end_line": 719,
      "comment": "\n     * Reads character by character through the String to get the next token.\n     *\n     * @param chars  the character array being tokenized\n     * @param start  the first character of field\n     * @param len  the length of the character array being tokenized\n     * @param workArea  a temporary work area\n     * @param tokens  the list of parsed tokens\n     * @return the starting position of the next field (the character\n     *  immediately after the delimiter), or -1 if end of string found\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 698,col 9)",
        "(line 701,col 9)-(line 704,col 9)",
        "(line 707,col 9)-(line 707,col 85)",
        "(line 708,col 9)-(line 711,col 9)",
        "(line 714,col 9)-(line 714,col 81)",
        "(line 715,col 9)-(line 717,col 9)",
        "(line 718,col 9)-(line 718,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.readWithQuotes(char[], int, int, org.apache.commons.lang3.text.StrBuilder, java.util.List\u003cjava.lang.String\u003e, int, int)",
      "begin_line": 735,
      "end_line": 818,
      "comment": "\n     * Reads a possibly quoted string token.\n     *\n     * @param chars  the character array being tokenized\n     * @param start  the first character of field\n     * @param len  the length of the character array being tokenized\n     * @param workArea  a temporary work area\n     * @param tokens  the list of parsed tokens\n     * @param quoteStart  the start position of the matched quote, 0 if no quoting\n     * @param quoteLen  the length of the matched quote, 0 if no quoting\n     * @return the starting position of the next field (the character\n     *  immediately after the delimiter, or if end of string found,\n     *  then the length of string\n     ",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 25)",
        "(line 740,col 9)-(line 740,col 24)",
        "(line 741,col 9)-(line 741,col 39)",
        "(line 742,col 9)-(line 742,col 26)",
        "(line 744,col 9)-(line 813,col 9)",
        "(line 816,col 9)-(line 816,col 59)",
        "(line 817,col 9)-(line 817,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.isQuote(char[], int, int, int, int)",
      "begin_line": 831,
      "end_line": 838,
      "comment": "\n     * Checks if the characters at the index specified match the quote\n     * already matched in readNextToken().\n     *\n     * @param chars  the character array being tokenized\n     * @param pos  the position to check for a quote\n     * @param len  the length of the character array being tokenized\n     * @param quoteStart  the start position of the matched quote, 0 if no quoting\n     * @param quoteLen  the length of the matched quote, 0 if no quoting\n     * @return true if a quote is matched\n     ",
      "child_ranges": [
        "(line 832,col 9)-(line 836,col 9)",
        "(line 837,col 9)-(line 837,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getDelimiterMatcher()",
      "begin_line": 847,
      "end_line": 849,
      "comment": "\n     * Gets the field delimiter matcher.\n     *\n     * @return the delimiter matcher in use\n     ",
      "child_ranges": [
        "(line 848,col 9)-(line 848,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setDelimiterMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 859,
      "end_line": 866,
      "comment": "\n     * Sets the field delimiter matcher.\n     * \u003cp\u003e\n     * The delimitier is used to separate one token from another.\n     *\n     * @param delim  the delimiter matcher to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 864,col 9)",
        "(line 865,col 9)-(line 865,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setDelimiterChar(char)",
      "begin_line": 874,
      "end_line": 876,
      "comment": "\n     * Sets the field delimiter character.\n     *\n     * @param delim  the delimiter character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 875,col 9)-(line 875,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setDelimiterString(java.lang.String)",
      "begin_line": 884,
      "end_line": 886,
      "comment": "\n     * Sets the field delimiter string.\n     *\n     * @param delim  the delimiter string to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 885,col 9)-(line 885,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getQuoteMatcher()",
      "begin_line": 899,
      "end_line": 901,
      "comment": "\n     * Gets the quote matcher currently in use.\n     * \u003cp\u003e\n     * The quote character is used to wrap data between the tokens.\n     * This enables delimiters to be entered as data.\n     * The default value is \u0027\"\u0027 (double quote).\n     *\n     * @return the quote matcher in use\n     ",
      "child_ranges": [
        "(line 900,col 9)-(line 900,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setQuoteMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 912,
      "end_line": 917,
      "comment": "\n     * Set the quote matcher to use.\n     * \u003cp\u003e\n     * The quote character is used to wrap data between the tokens.\n     * This enables delimiters to be entered as data.\n     *\n     * @param quote  the quote matcher to use, null ignored\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 913,col 9)-(line 915,col 9)",
        "(line 916,col 9)-(line 916,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setQuoteChar(char)",
      "begin_line": 928,
      "end_line": 930,
      "comment": "\n     * Sets the quote character to use.\n     * \u003cp\u003e\n     * The quote character is used to wrap data between the tokens.\n     * This enables delimiters to be entered as data.\n     *\n     * @param quote  the quote character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getIgnoredMatcher()",
      "begin_line": 943,
      "end_line": 945,
      "comment": "\n     * Gets the ignored character matcher.\n     * \u003cp\u003e\n     * These characters are ignored when parsing the String, unless they are\n     * within a quoted region.\n     * The default value is not to ignore anything.\n     *\n     * @return the ignored matcher in use\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setIgnoredMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 956,
      "end_line": 961,
      "comment": "\n     * Set the matcher for characters to ignore.\n     * \u003cp\u003e\n     * These characters are ignored when parsing the String, unless they are\n     * within a quoted region.\n     *\n     * @param ignored  the ignored matcher to use, null ignored\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 957,col 9)-(line 959,col 9)",
        "(line 960,col 9)-(line 960,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setIgnoredChar(char)",
      "begin_line": 972,
      "end_line": 974,
      "comment": "\n     * Set the character to ignore.\n     * \u003cp\u003e\n     * This character is ignored when parsing the String, unless it is\n     * within a quoted region.\n     *\n     * @param ignored  the ignored character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 973,col 9)-(line 973,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getTrimmerMatcher()",
      "begin_line": 987,
      "end_line": 989,
      "comment": "\n     * Gets the trimmer character matcher.\n     * \u003cp\u003e\n     * These characters are trimmed off on each side of the delimiter\n     * until the token or quote is found.\n     * The default value is not to trim anything.\n     *\n     * @return the trimmer matcher in use\n     ",
      "child_ranges": [
        "(line 988,col 9)-(line 988,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setTrimmerMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 1000,
      "end_line": 1005,
      "comment": "\n     * Sets the matcher for characters to trim.\n     * \u003cp\u003e\n     * These characters are trimmed off on each side of the delimiter\n     * until the token or quote is found.\n     *\n     * @param trimmer  the trimmer matcher to use, null ignored\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1001,col 9)-(line 1003,col 9)",
        "(line 1004,col 9)-(line 1004,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.isEmptyTokenAsNull()",
      "begin_line": 1014,
      "end_line": 1016,
      "comment": "\n     * Gets whether the tokenizer currently returns empty tokens as null.\n     * The default for this property is false.\n     *\n     * @return true if empty tokens are returned as null\n     ",
      "child_ranges": [
        "(line 1015,col 9)-(line 1015,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setEmptyTokenAsNull(boolean)",
      "begin_line": 1025,
      "end_line": 1028,
      "comment": "\n     * Sets whether the tokenizer should return empty tokens as null.\n     * The default for this property is false.\n     *\n     * @param emptyAsNull  whether empty tokens are returned as null\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1026,col 9)-(line 1026,col 39)",
        "(line 1027,col 9)-(line 1027,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.isIgnoreEmptyTokens()",
      "begin_line": 1037,
      "end_line": 1039,
      "comment": "\n     * Gets whether the tokenizer currently ignores empty tokens.\n     * The default for this property is true.\n     *\n     * @return true if empty tokens are not returned\n     ",
      "child_ranges": [
        "(line 1038,col 9)-(line 1038,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setIgnoreEmptyTokens(boolean)",
      "begin_line": 1048,
      "end_line": 1051,
      "comment": "\n     * Sets whether the tokenizer should ignore and not return empty tokens.\n     * The default for this property is true.\n     *\n     * @param ignoreEmptyTokens  whether empty tokens are not returned\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1049,col 9)-(line 1049,col 51)",
        "(line 1050,col 9)-(line 1050,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getContent()",
      "begin_line": 1059,
      "end_line": 1064,
      "comment": "\n     * Gets the String content that the tokenizer is parsing.\n     *\n     * @return the string content being parsed\n     ",
      "child_ranges": [
        "(line 1060,col 9)-(line 1062,col 9)",
        "(line 1063,col 9)-(line 1063,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.clone()",
      "begin_line": 1074,
      "end_line": 1081,
      "comment": "\n     * Creates a new instance of this Tokenizer. The new instance is reset so\n     * that it will be at the start of the token list.\n     * If a {@link CloneNotSupportedException} is caught, return \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @return a new instance of this Tokenizer which has been reset.\n     ",
      "child_ranges": [
        "(line 1076,col 9)-(line 1080,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.cloneReset()",
      "begin_line": 1090,
      "end_line": 1098,
      "comment": "\n     * Creates a new instance of this Tokenizer. The new instance is reset so that\n     * it will be at the start of the token list.\n     * \n     * @return a new instance of this Tokenizer which has been reset.\n     * @throws CloneNotSupportedException if there is a problem cloning\n     ",
      "child_ranges": [
        "(line 1092,col 9)-(line 1092,col 65)",
        "(line 1093,col 9)-(line 1095,col 9)",
        "(line 1096,col 9)-(line 1096,col 23)",
        "(line 1097,col 9)-(line 1097,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.toString()",
      "begin_line": 1106,
      "end_line": 1112,
      "comment": "\n     * Gets the String content that the tokenizer is parsing.\n     *\n     * @return the string content being parsed\n     ",
      "child_ranges": [
        "(line 1108,col 9)-(line 1110,col 9)",
        "(line 1111,col 9)-(line 1111,col 47)"
      ]
    }
  ]
}