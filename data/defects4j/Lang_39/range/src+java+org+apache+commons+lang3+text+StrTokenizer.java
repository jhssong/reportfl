{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/text/StrTokenizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrTokenizer",
      "is_interface": false,
      "parent_types": [
        "java.util.ListIterator\u003cjava.lang.String\u003e",
        "java.lang.Cloneable"
      ],
      "begin_line": 90,
      "end_line": 1107,
      "comment": "\n * Tokenizes a string based based on delimiters (separators)\n * and supporting quoting and ignored character concepts.\n * \u003cp\u003e\n * This class can split a String into many smaller strings. It aims\n * to do a similar job to {@link java.util.StringTokenizer StringTokenizer},\n * however it offers much more control and flexibility including implementing\n * the \u003ccode\u003eListIterator\u003c/code\u003e interface. By default, it is set up\n * like \u003ccode\u003eStringTokenizer\u003c/code\u003e.\n * \u003cp\u003e\n * The input String is split into a number of \u003ci\u003etokens\u003c/i\u003e.\n * Each token is separated from the next String by a \u003ci\u003edelimiter\u003c/i\u003e.\n * One or more delimiter characters must be specified.\n * \u003cp\u003e\n * Each token may be surrounded by quotes.\n * The \u003ci\u003equote\u003c/i\u003e matcher specifies the quote character(s).\n * A quote may be escaped within a quoted section by duplicating itself.\n * \u003cp\u003e\n * Between each token and the delimiter are potentially characters that need trimming.\n * The \u003ci\u003etrimmer\u003c/i\u003e matcher specifies these characters.\n * One usage might be to trim whitespace characters.\n * \u003cp\u003e\n * At any point outside the quotes there might potentially be invalid characters.\n * The \u003ci\u003eignored\u003c/i\u003e matcher specifies these characters to be removed.\n * One usage might be to remove new line characters.\n * \u003cp\u003e\n * Empty tokens may be removed or returned as null.\n * \u003cpre\u003e\n * \"a,b,c\"         - Three tokens \"a\",\"b\",\"c\"   (comma delimiter)\n * \" a, b , c \"    - Three tokens \"a\",\"b\",\"c\"   (default CSV processing trims whitespace)\n * \"a, \", b ,\", c\" - Three tokens \"a, \" , \" b \", \", c\" (quoted text untouched)\n * \u003c/pre\u003e\n * \u003cp\u003e\n *\n * This tokenizer has the following properties and options:\n *\n * \u003ctable\u003e\n *  \u003ctr\u003e\n *   \u003cth\u003eProperty\u003c/th\u003e\u003cth\u003eType\u003c/th\u003e\u003cth\u003eDefault\u003c/th\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003edelim\u003c/td\u003e\u003ctd\u003eCharSetMatcher\u003c/td\u003e\u003ctd\u003e{ \\t\\n\\r\\f}\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003equote\u003c/td\u003e\u003ctd\u003eNoneMatcher\u003c/td\u003e\u003ctd\u003e{}\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003eignore\u003c/td\u003e\u003ctd\u003eNoneMatcher\u003c/td\u003e\u003ctd\u003e{}\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003eemptyTokenAsNull\u003c/td\u003e\u003ctd\u003eboolean\u003c/td\u003e\u003ctd\u003efalse\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003eignoreEmptyTokens\u003c/td\u003e\u003ctd\u003eboolean\u003c/td\u003e\u003ctd\u003etrue\u003c/td\u003e\n *  \u003c/tr\u003e\n * \u003c/table\u003e\n *\n * @author Apache Software Foundation\n * @author Matthew Inger\n * @author Gary D. Gregory\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CSV_TOKENIZER_PROTOTYPE"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TSV_TOKENIZER_PROTOTYPE"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "chars"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " The text to work on. "
    },
    {
      "type": "field",
      "varNames": [
        "tokens"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The parsed tokens "
    },
    {
      "type": "field",
      "varNames": [
        "tokenPos"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " The current iteration position "
    },
    {
      "type": "field",
      "varNames": [
        "delimMatcher"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " The delimiter matcher "
    },
    {
      "type": "field",
      "varNames": [
        "quoteMatcher"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " The quote matcher "
    },
    {
      "type": "field",
      "varNames": [
        "ignoredMatcher"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The ignored matcher "
    },
    {
      "type": "field",
      "varNames": [
        "trimmerMatcher"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " The trimmer matcher "
    },
    {
      "type": "field",
      "varNames": [
        "emptyAsNull"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " Whether to return empty tokens as null "
    },
    {
      "type": "field",
      "varNames": [
        "ignoreEmptyTokens"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " Whether to ignore empty tokens "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getCSVClone()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Returns a clone of \u003ccode\u003eCSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     * \n     * @return a clone of \u003ccode\u003eCSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getCSVInstance()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Gets a new tokenizer instance which parses Comma Separated Value strings\n     * initializing it with the given input.  The default for CSV processing\n     * will be trim whitespace from both ends (which can be overridden with\n     * the setTrimmer method).\n     * \u003cp\u003e\n     * You must call a \"reset\" method to set the string which you want to parse.\n     * @return a new tokenizer instance which parses Comma Separated Value strings\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(java.lang.String)",
      "begin_line": 166,
      "end_line": 170,
      "comment": "\n     * Gets a new tokenizer instance which parses Comma Separated Value strings\n     * initializing it with the given input.  The default for CSV processing\n     * will be trim whitespace from both ends (which can be overridden with\n     * the setTrimmer method).\n     *\n     * @param input  the text to parse\n     * @return a new tokenizer instance which parses Comma Separated Value strings\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 41)",
        "(line 168,col 9)-(line 168,col 25)",
        "(line 169,col 9)-(line 169,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getCSVInstance(char[])",
      "begin_line": 181,
      "end_line": 185,
      "comment": "\n     * Gets a new tokenizer instance which parses Comma Separated Value strings\n     * initializing it with the given input.  The default for CSV processing\n     * will be trim whitespace from both ends (which can be overridden with\n     * the setTrimmer method).\n     *\n     * @param input  the text to parse\n     * @return a new tokenizer instance which parses Comma Separated Value strings\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 41)",
        "(line 183,col 9)-(line 183,col 25)",
        "(line 184,col 9)-(line 184,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getTSVClone()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Returns a clone of \u003ccode\u003eTSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     * \n     * @return a clone of \u003ccode\u003eTSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getTSVInstance()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Gets a new tokenizer instance which parses Tab Separated Value strings.\n     * The default for CSV processing will be trim whitespace from both ends\n     * (which can be overridden with the setTrimmer method).\n     * \u003cp\u003e\n     * You must call a \"reset\" method to set the string which you want to parse.\n     * @return a new tokenizer instance which parses Tab Separated Value strings.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(java.lang.String)",
      "begin_line": 216,
      "end_line": 220,
      "comment": "\n     * Gets a new tokenizer instance which parses Tab Separated Value strings.\n     * The default for CSV processing will be trim whitespace from both ends\n     * (which can be overridden with the setTrimmer method).\n     * @param input  the string to parse\n     * @return a new tokenizer instance which parses Tab Separated Value strings.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 41)",
        "(line 218,col 9)-(line 218,col 25)",
        "(line 219,col 9)-(line 219,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getTSVInstance(char[])",
      "begin_line": 229,
      "end_line": 233,
      "comment": "\n     * Gets a new tokenizer instance which parses Tab Separated Value strings.\n     * The default for CSV processing will be trim whitespace from both ends\n     * (which can be overridden with the setTrimmer method).\n     * @param input  the string to parse\n     * @return a new tokenizer instance which parses Tab Separated Value strings.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 41)",
        "(line 231,col 9)-(line 231,col 25)",
        "(line 232,col 9)-(line 232,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer()",
      "begin_line": 242,
      "end_line": 245,
      "comment": "\n     * Constructs a tokenizer splitting on space, tab, newline and formfeed\n     * as per StringTokenizer, but with no text to tokenize.\n     * \u003cp\u003e\n     * This constructor is normally used with {@link #reset(String)}.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 16)",
        "(line 244,col 9)-(line 244,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(java.lang.String)",
      "begin_line": 253,
      "end_line": 260,
      "comment": "\n     * Constructs a tokenizer splitting on space, tab, newline and formfeed\n     * as per StringTokenizer.\n     *\n     * @param input  the string which is to be parsed\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 16)",
        "(line 255,col 9)-(line 259,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(java.lang.String, char)",
      "begin_line": 268,
      "end_line": 271,
      "comment": "\n     * Constructs a tokenizer splitting on the specified delimiter character.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter character\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 20)",
        "(line 270,col 9)-(line 270,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(java.lang.String, java.lang.String)",
      "begin_line": 279,
      "end_line": 282,
      "comment": "\n     * Constructs a tokenizer splitting on the specified delimiter string.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter string\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 20)",
        "(line 281,col 9)-(line 281,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(java.lang.String, org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 290,
      "end_line": 293,
      "comment": "\n     * Constructs a tokenizer splitting using the specified delimiter matcher.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter matcher\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 20)",
        "(line 292,col 9)-(line 292,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(java.lang.String, char, char)",
      "begin_line": 303,
      "end_line": 306,
      "comment": "\n     * Constructs a tokenizer splitting on the specified delimiter character\n     * and handling quotes using the specified quote character.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter character\n     * @param quote  the field quoted string character\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 27)",
        "(line 305,col 9)-(line 305,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(java.lang.String, org.apache.commons.lang3.text.StrMatcher, org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 316,
      "end_line": 319,
      "comment": "\n     * Constructs a tokenizer splitting using the specified delimiter matcher\n     * and handling quotes using the specified quote matcher.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter matcher\n     * @param quote  the field quoted string matcher\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 27)",
        "(line 318,col 9)-(line 318,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(char[])",
      "begin_line": 327,
      "end_line": 330,
      "comment": "\n     * Constructs a tokenizer splitting on space, tab, newline and formfeed\n     * as per StringTokenizer.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 16)",
        "(line 329,col 9)-(line 329,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(char[], char)",
      "begin_line": 338,
      "end_line": 341,
      "comment": "\n     * Constructs a tokenizer splitting on the specified character.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim the field delimiter character\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 20)",
        "(line 340,col 9)-(line 340,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(char[], java.lang.String)",
      "begin_line": 349,
      "end_line": 352,
      "comment": "\n     * Constructs a tokenizer splitting on the specified string.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim the field delimiter string\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 20)",
        "(line 351,col 9)-(line 351,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(char[], org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 360,
      "end_line": 363,
      "comment": "\n     * Constructs a tokenizer splitting using the specified delimiter matcher.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim  the field delimiter matcher\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 20)",
        "(line 362,col 9)-(line 362,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(char[], char, char)",
      "begin_line": 373,
      "end_line": 376,
      "comment": "\n     * Constructs a tokenizer splitting on the specified delimiter character\n     * and handling quotes using the specified quote character.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim  the field delimiter character\n     * @param quote  the field quoted string character\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 27)",
        "(line 375,col 9)-(line 375,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.StrTokenizer(char[], org.apache.commons.lang3.text.StrMatcher, org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 386,
      "end_line": 389,
      "comment": "\n     * Constructs a tokenizer splitting using the specified delimiter matcher\n     * and handling quotes using the specified quote matcher.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim  the field delimiter character\n     * @param quote  the field quoted string character\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 27)",
        "(line 388,col 9)-(line 388,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.size()",
      "begin_line": 398,
      "end_line": 401,
      "comment": "\n     * Gets the number of tokens found in the String.\n     *\n     * @return the number of matched tokens\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 25)",
        "(line 400,col 9)-(line 400,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.nextToken()",
      "begin_line": 408,
      "end_line": 413,
      "comment": "\n     * Gets the next token from the String.\n     *\n     * @return the next sequential token, or null when no more tokens are found\n     ",
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
        "(line 444,col 9)-(line 444,col 65)",
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
      "end_line": 506,
      "comment": "\n     * Checks whether there are any more tokens.\n     *\n     * @return true if there are more tokens\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 25)",
        "(line 505,col 9)-(line 505,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.next()",
      "begin_line": 513,
      "end_line": 518,
      "comment": "\n     * Gets the next token. This method is equivalent to {@link #nextToken()}.\n     *\n     * @return the next String token\n     ",
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
      "end_line": 811,
      "comment": "\n     * Reads a possibly quoted string token.\n     *\n     * @param chars  the character array being tokenized\n     * @param start  the first character of field\n     * @param len  the length of the character array being tokenized\n     * @param workArea  a temporary work area\n     * @param tokens  the list of parsed tokens\n     * @param quoteStart  the start position of the matched quote, 0 if no quoting\n     * @param quoteLen  the length of the matched quote, 0 if no quoting\n     * @return the starting position of the next field (the character\n     *  immediately after the delimiter, or if end of string found,\n     *  then the length of string\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 25)",
        "(line 731,col 9)-(line 731,col 24)",
        "(line 732,col 9)-(line 732,col 41)",
        "(line 733,col 9)-(line 733,col 26)",
        "(line 735,col 9)-(line 806,col 9)",
        "(line 809,col 9)-(line 809,col 59)",
        "(line 810,col 9)-(line 810,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.isQuote(char[], int, int, int, int)",
      "begin_line": 824,
      "end_line": 831,
      "comment": "\n     * Checks if the characters at the index specified match the quote\n     * already matched in readNextToken().\n     *\n     * @param chars  the character array being tokenized\n     * @param pos  the position to check for a quote\n     * @param len  the length of the character array being tokenized\n     * @param quoteStart  the start position of the matched quote, 0 if no quoting\n     * @param quoteLen  the length of the matched quote, 0 if no quoting\n     * @return true if a quote is matched\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 830,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getDelimiterMatcher()",
      "begin_line": 840,
      "end_line": 842,
      "comment": "\n     * Gets the field delimiter matcher.\n     *\n     * @return the delimiter matcher in use\n     ",
      "child_ranges": [
        "(line 841,col 9)-(line 841,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setDelimiterMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 852,
      "end_line": 859,
      "comment": "\n     * Sets the field delimiter matcher.\n     * \u003cp\u003e\n     * The delimitier is used to separate one token from another.\n     *\n     * @param delim  the delimiter matcher to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 857,col 9)",
        "(line 858,col 9)-(line 858,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setDelimiterChar(char)",
      "begin_line": 867,
      "end_line": 869,
      "comment": "\n     * Sets the field delimiter character.\n     *\n     * @param delim  the delimiter character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 868,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setDelimiterString(java.lang.String)",
      "begin_line": 877,
      "end_line": 879,
      "comment": "\n     * Sets the field delimiter string.\n     *\n     * @param delim  the delimiter string to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getQuoteMatcher()",
      "begin_line": 892,
      "end_line": 894,
      "comment": "\n     * Gets the quote matcher currently in use.\n     * \u003cp\u003e\n     * The quote character is used to wrap data between the tokens.\n     * This enables delimiters to be entered as data.\n     * The default value is \u0027\"\u0027 (double quote).\n     *\n     * @return the quote matcher in use\n     ",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setQuoteMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 905,
      "end_line": 910,
      "comment": "\n     * Set the quote matcher to use.\n     * \u003cp\u003e\n     * The quote character is used to wrap data between the tokens.\n     * This enables delimiters to be entered as data.\n     *\n     * @param quote  the quote matcher to use, null ignored\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 906,col 9)-(line 908,col 9)",
        "(line 909,col 9)-(line 909,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setQuoteChar(char)",
      "begin_line": 921,
      "end_line": 923,
      "comment": "\n     * Sets the quote character to use.\n     * \u003cp\u003e\n     * The quote character is used to wrap data between the tokens.\n     * This enables delimiters to be entered as data.\n     *\n     * @param quote  the quote character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 922,col 9)-(line 922,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getIgnoredMatcher()",
      "begin_line": 936,
      "end_line": 938,
      "comment": "\n     * Gets the ignored character matcher.\n     * \u003cp\u003e\n     * These characters are ignored when parsing the String, unless they are\n     * within a quoted region.\n     * The default value is not to ignore anything.\n     *\n     * @return the ignored matcher in use\n     ",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setIgnoredMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 949,
      "end_line": 954,
      "comment": "\n     * Set the matcher for characters to ignore.\n     * \u003cp\u003e\n     * These characters are ignored when parsing the String, unless they are\n     * within a quoted region.\n     *\n     * @param ignored  the ignored matcher to use, null ignored\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 950,col 9)-(line 952,col 9)",
        "(line 953,col 9)-(line 953,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setIgnoredChar(char)",
      "begin_line": 965,
      "end_line": 967,
      "comment": "\n     * Set the character to ignore.\n     * \u003cp\u003e\n     * This character is ignored when parsing the String, unless it is\n     * within a quoted region.\n     *\n     * @param ignored  the ignored character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 966,col 9)-(line 966,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getTrimmerMatcher()",
      "begin_line": 980,
      "end_line": 982,
      "comment": "\n     * Gets the trimmer character matcher.\n     * \u003cp\u003e\n     * These characters are trimmed off on each side of the delimiter\n     * until the token or quote is found.\n     * The default value is not to trim anything.\n     *\n     * @return the trimmer matcher in use\n     ",
      "child_ranges": [
        "(line 981,col 9)-(line 981,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setTrimmerMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 993,
      "end_line": 998,
      "comment": "\n     * Sets the matcher for characters to trim.\n     * \u003cp\u003e\n     * These characters are trimmed off on each side of the delimiter\n     * until the token or quote is found.\n     *\n     * @param trimmer  the trimmer matcher to use, null ignored\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 994,col 9)-(line 996,col 9)",
        "(line 997,col 9)-(line 997,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.isEmptyTokenAsNull()",
      "begin_line": 1007,
      "end_line": 1009,
      "comment": "\n     * Gets whether the tokenizer currently returns empty tokens as null.\n     * The default for this property is false.\n     *\n     * @return true if empty tokens are returned as null\n     ",
      "child_ranges": [
        "(line 1008,col 9)-(line 1008,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setEmptyTokenAsNull(boolean)",
      "begin_line": 1018,
      "end_line": 1021,
      "comment": "\n     * Sets whether the tokenizer should return empty tokens as null.\n     * The default for this property is false.\n     *\n     * @param emptyAsNull  whether empty tokens are returned as null\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1019,col 9)-(line 1019,col 39)",
        "(line 1020,col 9)-(line 1020,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.isIgnoreEmptyTokens()",
      "begin_line": 1030,
      "end_line": 1032,
      "comment": "\n     * Gets whether the tokenizer currently ignores empty tokens.\n     * The default for this property is true.\n     *\n     * @return true if empty tokens are not returned\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1031,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.setIgnoreEmptyTokens(boolean)",
      "begin_line": 1041,
      "end_line": 1044,
      "comment": "\n     * Sets whether the tokenizer should ignore and not return empty tokens.\n     * The default for this property is true.\n     *\n     * @param ignoreEmptyTokens  whether empty tokens are not returned\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1042,col 9)-(line 1042,col 51)",
        "(line 1043,col 9)-(line 1043,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.getContent()",
      "begin_line": 1052,
      "end_line": 1057,
      "comment": "\n     * Gets the String content that the tokenizer is parsing.\n     *\n     * @return the string content being parsed\n     ",
      "child_ranges": [
        "(line 1053,col 9)-(line 1055,col 9)",
        "(line 1056,col 9)-(line 1056,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.clone()",
      "begin_line": 1067,
      "end_line": 1074,
      "comment": "\n     * Creates a new instance of this Tokenizer. The new instance is reset so\n     * that it will be at the start of the token list.\n     * If a {@link CloneNotSupportedException} is caught, return \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @return a new instance of this Tokenizer which has been reset.\n     ",
      "child_ranges": [
        "(line 1069,col 9)-(line 1073,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.cloneReset()",
      "begin_line": 1083,
      "end_line": 1091,
      "comment": "\n     * Creates a new instance of this Tokenizer. The new instance is reset so that\n     * it will be at the start of the token list.\n     * \n     * @return a new instance of this Tokenizer which has been reset.\n     * @throws CloneNotSupportedException if there is a problem cloning\n     ",
      "child_ranges": [
        "(line 1085,col 9)-(line 1085,col 59)",
        "(line 1086,col 9)-(line 1088,col 9)",
        "(line 1089,col 9)-(line 1089,col 23)",
        "(line 1090,col 9)-(line 1090,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrTokenizer.toString()",
      "begin_line": 1099,
      "end_line": 1105,
      "comment": "\n     * Gets the String content that the tokenizer is parsing.\n     *\n     * @return the string content being parsed\n     ",
      "child_ranges": [
        "(line 1101,col 9)-(line 1103,col 9)",
        "(line 1104,col 9)-(line 1104,col 47)"
      ]
    }
  ]
}