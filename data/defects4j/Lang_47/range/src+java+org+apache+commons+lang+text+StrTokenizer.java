{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/text/StrTokenizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrTokenizer",
      "is_interface": false,
      "parent_types": [
        "java.util.ListIterator",
        "java.lang.Cloneable"
      ],
      "begin_line": 88,
      "end_line": 1124,
      "comment": "\n * Tokenizes a string based based on delimiters (separators)\n * and supporting quoting and ignored character concepts.\n * \u003cp\u003e\n * This class can split a String into many smaller strings. It aims\n * to do a similar job to {@link java.util.StringTokenizer StringTokenizer},\n * however it offers much more control and flexibility including implementing\n * the \u003ccode\u003eListIterator\u003c/code\u003e interface. By default, it is set up\n * like \u003ccode\u003eStringTokenizer\u003c/code\u003e.\n * \u003cp\u003e\n * The input String is split into a number of \u003ci\u003etokens\u003c/i\u003e.\n * Each token is separated from the next String by a \u003ci\u003edelimiter\u003c/i\u003e.\n * One or more delimiter characters must be specified.\n * \u003cp\u003e\n * Each token may be surrounded by quotes.\n * The \u003ci\u003equote\u003c/i\u003e matcher specifies the quote character(s).\n * A quote may be escaped within a quoted section by duplicating itself.\n * \u003cp\u003e\n * Between each token and the delimiter are potentially characters that need trimming.\n * The \u003ci\u003etrimmer\u003c/i\u003e matcher specifies these characters.\n * One usage might be to trim whitespace characters.\n * \u003cp\u003e\n * At any point outside the quotes there might potentially be invalid characters.\n * The \u003ci\u003eignored\u003c/i\u003e matcher specifies these characters to be removed.\n * One usage might be to remove new line characters.\n * \u003cp\u003e\n * Empty tokens may be removed or returned as null.\n * \u003cpre\u003e\n * \"a,b,c\"         - Three tokens \"a\",\"b\",\"c\"   (comma delimiter)\n * \" a, b , c \"    - Three tokens \"a\",\"b\",\"c\"   (default CSV processing trims whitespace)\n * \"a, \", b ,\", c\" - Three tokens \"a, \" , \" b \", \", c\" (quoted text untouched)\n * \u003c/pre\u003e\n * \u003cp\u003e\n *\n * This tokenizer has the following properties and options:\n *\n * \u003ctable\u003e\n *  \u003ctr\u003e\n *   \u003cth\u003eProperty\u003c/th\u003e\u003cth\u003eType\u003c/th\u003e\u003cth\u003eDefault\u003c/th\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003edelim\u003c/td\u003e\u003ctd\u003eCharSetMatcher\u003c/td\u003e\u003ctd\u003e{ \\t\\n\\r\\f}\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003equote\u003c/td\u003e\u003ctd\u003eNoneMatcher\u003c/td\u003e\u003ctd\u003e{}\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003eignore\u003c/td\u003e\u003ctd\u003eNoneMatcher\u003c/td\u003e\u003ctd\u003e{}\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003eemptyTokenAsNull\u003c/td\u003e\u003ctd\u003eboolean\u003c/td\u003e\u003ctd\u003efalse\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003eignoreEmptyTokens\u003c/td\u003e\u003ctd\u003eboolean\u003c/td\u003e\u003ctd\u003etrue\u003c/td\u003e\n *  \u003c/tr\u003e\n * \u003c/table\u003e\n *\n * @author Matthew Inger\n * @author Stephen Colebourne\n * @author Gary D. Gregory\n * @since 2.2\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang.text.StrTokenizer.getCSVClone()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Returns a clone of \u003ccode\u003eCSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     * \n     * @return a clone of \u003ccode\u003eCSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getCSVInstance()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Gets a new tokenizer instance which parses Comma Separated Value strings\n     * initializing it with the given input.  The default for CSV processing\n     * will be trim whitespace from both ends (which can be overridden with\n     * the setTrimmer method).\n     * \u003cp\u003e\n     * You must call a \"reset\" method to set the string which you want to parse.\n     * @return a new tokenizer instance which parses Comma Separated Value strings\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getCSVInstance(java.lang.String)",
      "begin_line": 164,
      "end_line": 168,
      "comment": "\n     * Gets a new tokenizer instance which parses Comma Separated Value strings\n     * initializing it with the given input.  The default for CSV processing\n     * will be trim whitespace from both ends (which can be overridden with\n     * the setTrimmer method).\n     *\n     * @param input  the text to parse\n     * @return a new tokenizer instance which parses Comma Separated Value strings\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 41)",
        "(line 166,col 9)-(line 166,col 25)",
        "(line 167,col 9)-(line 167,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getCSVInstance(char[])",
      "begin_line": 179,
      "end_line": 183,
      "comment": "\n     * Gets a new tokenizer instance which parses Comma Separated Value strings\n     * initializing it with the given input.  The default for CSV processing\n     * will be trim whitespace from both ends (which can be overridden with\n     * the setTrimmer method).\n     *\n     * @param input  the text to parse\n     * @return a new tokenizer instance which parses Comma Separated Value strings\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 41)",
        "(line 181,col 9)-(line 181,col 25)",
        "(line 182,col 9)-(line 182,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getTSVClone()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Returns a clone of \u003ccode\u003eTSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     * \n     * @return a clone of \u003ccode\u003eTSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getTSVInstance()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * Gets a new tokenizer instance which parses Tab Separated Value strings.\n     * The default for CSV processing will be trim whitespace from both ends\n     * (which can be overridden with the setTrimmer method).\n     * \u003cp\u003e\n     * You must call a \"reset\" method to set the string which you want to parse.\n     * @return a new tokenizer instance which parses Tab Separated Value strings.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getTSVInstance(java.lang.String)",
      "begin_line": 214,
      "end_line": 218,
      "comment": "\n     * Gets a new tokenizer instance which parses Tab Separated Value strings.\n     * The default for CSV processing will be trim whitespace from both ends\n     * (which can be overridden with the setTrimmer method).\n     * @param input  the string to parse\n     * @return a new tokenizer instance which parses Tab Separated Value strings.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 41)",
        "(line 216,col 9)-(line 216,col 25)",
        "(line 217,col 9)-(line 217,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getTSVInstance(char[])",
      "begin_line": 227,
      "end_line": 231,
      "comment": "\n     * Gets a new tokenizer instance which parses Tab Separated Value strings.\n     * The default for CSV processing will be trim whitespace from both ends\n     * (which can be overridden with the setTrimmer method).\n     * @param input  the string to parse\n     * @return a new tokenizer instance which parses Tab Separated Value strings.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 41)",
        "(line 229,col 9)-(line 229,col 25)",
        "(line 230,col 9)-(line 230,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer()",
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
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(java.lang.String)",
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
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(java.lang.String, char)",
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
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(java.lang.String, java.lang.String)",
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
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(java.lang.String, org.apache.commons.lang.text.StrMatcher)",
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
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(java.lang.String, char, char)",
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
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(java.lang.String, org.apache.commons.lang.text.StrMatcher, org.apache.commons.lang.text.StrMatcher)",
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
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(char[])",
      "begin_line": 328,
      "end_line": 331,
      "comment": "\n     * Constructs a tokenizer splitting on space, tab, newline and formfeed\n     * as per StringTokenizer.\n     * \u003cp\u003e\n     * The input character array is not cloned, and must not be altered after\n     * passing in to this method.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 16)",
        "(line 330,col 9)-(line 330,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(char[], char)",
      "begin_line": 342,
      "end_line": 345,
      "comment": "\n     * Constructs a tokenizer splitting on the specified character.\n     * \u003cp\u003e\n     * The input character array is not cloned, and must not be altered after\n     * passing in to this method.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim the field delimiter character\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 20)",
        "(line 344,col 9)-(line 344,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(char[], java.lang.String)",
      "begin_line": 356,
      "end_line": 359,
      "comment": "\n     * Constructs a tokenizer splitting on the specified string.\n     * \u003cp\u003e\n     * The input character array is not cloned, and must not be altered after\n     * passing in to this method.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim the field delimiter string\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 20)",
        "(line 358,col 9)-(line 358,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(char[], org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 370,
      "end_line": 373,
      "comment": "\n     * Constructs a tokenizer splitting using the specified delimiter matcher.\n     * \u003cp\u003e\n     * The input character array is not cloned, and must not be altered after\n     * passing in to this method.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim  the field delimiter matcher\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 20)",
        "(line 372,col 9)-(line 372,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(char[], char, char)",
      "begin_line": 386,
      "end_line": 389,
      "comment": "\n     * Constructs a tokenizer splitting on the specified delimiter character\n     * and handling quotes using the specified quote character.\n     * \u003cp\u003e\n     * The input character array is not cloned, and must not be altered after\n     * passing in to this method.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim  the field delimiter character\n     * @param quote  the field quoted string character\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 27)",
        "(line 388,col 9)-(line 388,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(char[], org.apache.commons.lang.text.StrMatcher, org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 402,
      "end_line": 405,
      "comment": "\n     * Constructs a tokenizer splitting using the specified delimiter matcher\n     * and handling quotes using the specified quote matcher.\n     * \u003cp\u003e\n     * The input character array is not cloned, and must not be altered after\n     * passing in to this method.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim  the field delimiter character\n     * @param quote  the field quoted string character\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 27)",
        "(line 404,col 9)-(line 404,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.size()",
      "begin_line": 414,
      "end_line": 417,
      "comment": "\n     * Gets the number of tokens found in the String.\n     *\n     * @return the number of matched tokens\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 25)",
        "(line 416,col 9)-(line 416,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.nextToken()",
      "begin_line": 424,
      "end_line": 429,
      "comment": "\n     * Gets the next token from the String.\n     *\n     * @return the next sequential token, or null when no more tokens are found\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.previousToken()",
      "begin_line": 436,
      "end_line": 441,
      "comment": "\n     * Gets the previous token from the String.\n     *\n     * @return the previous sequential token, or null when no more tokens are found\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getTokenArray()",
      "begin_line": 448,
      "end_line": 451,
      "comment": "\n     * Gets a copy of the full token list as an independent modifiable array.\n     *\n     * @return the tokens as a String array\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 25)",
        "(line 450,col 9)-(line 450,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getTokenList()",
      "begin_line": 458,
      "end_line": 465,
      "comment": "\n     * Gets a copy of the full token list as an independent modifiable list.\n     *\n     * @return the tokens as a String array\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 25)",
        "(line 460,col 9)-(line 460,col 49)",
        "(line 461,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 464,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.reset()",
      "begin_line": 474,
      "end_line": 478,
      "comment": "\n     * Resets this tokenizer, forgetting all parsing and iteration already completed.\n     * \u003cp\u003e\n     * This method allows the same tokenizer to be reused for the same String.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 21)",
        "(line 476,col 9)-(line 476,col 22)",
        "(line 477,col 9)-(line 477,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.reset(java.lang.String)",
      "begin_line": 488,
      "end_line": 496,
      "comment": "\n     * Reset this tokenizer, giving it a new input string to parse.\n     * In this manner you can re-use a tokenizer with the same settings\n     * on multiple input lines.\n     *\n     * @param input  the new string to tokenize, null sets no text to parse\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 16)",
        "(line 490,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 495,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.reset(char[])",
      "begin_line": 509,
      "end_line": 513,
      "comment": "\n     * Reset this tokenizer, giving it a new input string to parse.\n     * In this manner you can re-use a tokenizer with the same settings\n     * on multiple input lines.\n     * \u003cp\u003e\n     * The input character array is not cloned, and must not be altered after\n     * passing in to this method.\n     *\n     * @param input  the new character array to tokenize, not cloned, null sets no text to parse\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 16)",
        "(line 511,col 9)-(line 511,col 27)",
        "(line 512,col 9)-(line 512,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.hasNext()",
      "begin_line": 522,
      "end_line": 525,
      "comment": "\n     * Checks whether there are any more tokens.\n     *\n     * @return true if there are more tokens\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 25)",
        "(line 524,col 9)-(line 524,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.next()",
      "begin_line": 532,
      "end_line": 537,
      "comment": "\n     * Gets the next token. This method is equivalent to {@link #nextToken()}.\n     *\n     * @return the next String token\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 536,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.nextIndex()",
      "begin_line": 544,
      "end_line": 546,
      "comment": "\n     * Gets the index of the next token to return.\n     *\n     * @return the next token index\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.hasPrevious()",
      "begin_line": 553,
      "end_line": 556,
      "comment": "\n     * Checks whether there are any previous tokens that can be iterated to.\n     *\n     * @return true if there are previous tokens\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 25)",
        "(line 555,col 9)-(line 555,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.previous()",
      "begin_line": 563,
      "end_line": 568,
      "comment": "\n     * Gets the token previous to the last returned token.\n     *\n     * @return the previous token\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 567,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.previousIndex()",
      "begin_line": 575,
      "end_line": 577,
      "comment": "\n     * Gets the index of the previous token.\n     *\n     * @return the previous token index\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.remove()",
      "begin_line": 584,
      "end_line": 586,
      "comment": "\n     * Unsupported ListIterator operation.\n     *\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.set(java.lang.Object)",
      "begin_line": 593,
      "end_line": 595,
      "comment": "\n     * Unsupported ListIterator operation.\n     * @param obj this parameter ignored.\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.add(java.lang.Object)",
      "begin_line": 602,
      "end_line": 604,
      "comment": "\n     * Unsupported ListIterator operation.\n     * @param obj this parameter ignored.\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.checkTokenized()",
      "begin_line": 611,
      "end_line": 622,
      "comment": "\n     * Checks if tokenization has been done, and if not then do it.\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 621,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.tokenize(char[], int, int)",
      "begin_line": 644,
      "end_line": 663,
      "comment": "\n     * Internal method to performs the tokenization.\n     * \u003cp\u003e\n     * Most users of this class do not need to call this method. This method\n     * will be called automatically by other (public) methods when required.\n     * \u003cp\u003e\n     * This method exists to allow subclasses to add code before or after the\n     * tokenization. For example, a subclass could alter the character array,\n     * offset or count to be parsed, or call the tokenizer multiple times on\n     * multiple strings. It is also be possible to filter the results.\n     * \u003cp\u003e\n     * \u003ccode\u003eStrTokenizer\u003c/code\u003e will always pass a zero offset and a count\n     * equal to the length of the array to this method, however a subclass\n     * may pass other values, or even an entirely different array.\n     * \n     * @param chars  the character array being tokenized, may be null\n     * @param offset  the start position within the character array, must be valid\n     * @param count  the number of characters to tokenize, must be valid\n     * @return the modifiable list of String tokens, unmodifiable if null array or zero count\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 648,col 42)",
        "(line 649,col 9)-(line 649,col 38)",
        "(line 650,col 9)-(line 650,col 25)",
        "(line 653,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 662,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.addToken(java.util.List, java.lang.String)",
      "begin_line": 671,
      "end_line": 681,
      "comment": "\n     * Adds a token to a list, paying attention to the parameters we\u0027ve set.\n     *\n     * @param list  the list to add to\n     * @param tok  the token to add\n     ",
      "child_ranges": [
        "(line 672,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 680,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.readNextToken(char[], int, int, org.apache.commons.lang.text.StrBuilder, java.util.List)",
      "begin_line": 694,
      "end_line": 728,
      "comment": "\n     * Reads character by character through the String to get the next token.\n     *\n     * @param chars  the character array being tokenized\n     * @param start  the first character of field\n     * @param len  the length of the character array being tokenized\n     * @param workArea  a temporary work area\n     * @param tokens  the list of parsed tokens\n     * @return the starting position of the next field (the character\n     *  immediately after the delimiter), or -1 if end of string found\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 707,col 9)",
        "(line 710,col 9)-(line 713,col 9)",
        "(line 716,col 9)-(line 716,col 79)",
        "(line 717,col 9)-(line 720,col 9)",
        "(line 723,col 9)-(line 723,col 75)",
        "(line 724,col 9)-(line 726,col 9)",
        "(line 727,col 9)-(line 727,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.readWithQuotes(char[], int, int, org.apache.commons.lang.text.StrBuilder, java.util.List, int, int)",
      "begin_line": 744,
      "end_line": 830,
      "comment": "\n     * Reads a possibly quoted string token.\n     *\n     * @param chars  the character array being tokenized\n     * @param start  the first character of field\n     * @param len  the length of the character array being tokenized\n     * @param workArea  a temporary work area\n     * @param tokens  the list of parsed tokens\n     * @param quoteStart  the start position of the matched quote, 0 if no quoting\n     * @param quoteLen  the length of the matched quote, 0 if no quoting\n     * @return the starting position of the next field (the character\n     *  immediately after the delimiter, or if end of string found,\n     *  then the length of string\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 25)",
        "(line 750,col 9)-(line 750,col 24)",
        "(line 751,col 9)-(line 751,col 41)",
        "(line 752,col 9)-(line 752,col 26)",
        "(line 754,col 9)-(line 825,col 9)",
        "(line 828,col 9)-(line 828,col 59)",
        "(line 829,col 9)-(line 829,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.isQuote(char[], int, int, int, int)",
      "begin_line": 843,
      "end_line": 850,
      "comment": "\n     * Checks if the characters at the index specified match the quote\n     * already matched in readNextToken().\n     *\n     * @param chars  the character array being tokenized\n     * @param pos  the position to check for a quote\n     * @param len  the length of the character array being tokenized\n     * @param quoteStart  the start position of the matched quote, 0 if no quoting\n     * @param quoteLen  the length of the matched quote, 0 if no quoting\n     * @return true if a quote is matched\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 848,col 9)",
        "(line 849,col 9)-(line 849,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getDelimiterMatcher()",
      "begin_line": 859,
      "end_line": 861,
      "comment": "\n     * Gets the field delimiter matcher.\n     *\n     * @return the delimiter matcher in use\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setDelimiterMatcher(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 871,
      "end_line": 878,
      "comment": "\n     * Sets the field delimiter matcher.\n     * \u003cp\u003e\n     * The delimitier is used to separate one token from another.\n     *\n     * @param delim  the delimiter matcher to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 872,col 9)-(line 876,col 9)",
        "(line 877,col 9)-(line 877,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setDelimiterChar(char)",
      "begin_line": 886,
      "end_line": 888,
      "comment": "\n     * Sets the field delimiter character.\n     *\n     * @param delim  the delimiter character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 887,col 9)-(line 887,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setDelimiterString(java.lang.String)",
      "begin_line": 896,
      "end_line": 898,
      "comment": "\n     * Sets the field delimiter string.\n     *\n     * @param delim  the delimiter string to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 897,col 9)-(line 897,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getQuoteMatcher()",
      "begin_line": 911,
      "end_line": 913,
      "comment": "\n     * Gets the quote matcher currently in use.\n     * \u003cp\u003e\n     * The quote character is used to wrap data between the tokens.\n     * This enables delimiters to be entered as data.\n     * The default value is \u0027\"\u0027 (double quote).\n     *\n     * @return the quote matcher in use\n     ",
      "child_ranges": [
        "(line 912,col 9)-(line 912,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setQuoteMatcher(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 924,
      "end_line": 929,
      "comment": "\n     * Set the quote matcher to use.\n     * \u003cp\u003e\n     * The quote character is used to wrap data between the tokens.\n     * This enables delimiters to be entered as data.\n     *\n     * @param quote  the quote matcher to use, null ignored\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 925,col 9)-(line 927,col 9)",
        "(line 928,col 9)-(line 928,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setQuoteChar(char)",
      "begin_line": 940,
      "end_line": 942,
      "comment": "\n     * Sets the quote character to use.\n     * \u003cp\u003e\n     * The quote character is used to wrap data between the tokens.\n     * This enables delimiters to be entered as data.\n     *\n     * @param quote  the quote character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 941,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getIgnoredMatcher()",
      "begin_line": 955,
      "end_line": 957,
      "comment": "\n     * Gets the ignored character matcher.\n     * \u003cp\u003e\n     * These characters are ignored when parsing the String, unless they are\n     * within a quoted region.\n     * The default value is not to ignore anything.\n     *\n     * @return the ignored matcher in use\n     ",
      "child_ranges": [
        "(line 956,col 9)-(line 956,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setIgnoredMatcher(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 968,
      "end_line": 973,
      "comment": "\n     * Set the matcher for characters to ignore.\n     * \u003cp\u003e\n     * These characters are ignored when parsing the String, unless they are\n     * within a quoted region.\n     *\n     * @param ignored  the ignored matcher to use, null ignored\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 971,col 9)",
        "(line 972,col 9)-(line 972,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setIgnoredChar(char)",
      "begin_line": 984,
      "end_line": 986,
      "comment": "\n     * Set the character to ignore.\n     * \u003cp\u003e\n     * This character is ignored when parsing the String, unless it is\n     * within a quoted region.\n     *\n     * @param ignored  the ignored character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 985,col 9)-(line 985,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getTrimmerMatcher()",
      "begin_line": 999,
      "end_line": 1001,
      "comment": "\n     * Gets the trimmer character matcher.\n     * \u003cp\u003e\n     * These characters are trimmed off on each side of the delimiter\n     * until the token or quote is found.\n     * The default value is not to trim anything.\n     *\n     * @return the trimmer matcher in use\n     ",
      "child_ranges": [
        "(line 1000,col 9)-(line 1000,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setTrimmerMatcher(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1012,
      "end_line": 1017,
      "comment": "\n     * Sets the matcher for characters to trim.\n     * \u003cp\u003e\n     * These characters are trimmed off on each side of the delimiter\n     * until the token or quote is found.\n     *\n     * @param trimmer  the trimmer matcher to use, null ignored\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1015,col 9)",
        "(line 1016,col 9)-(line 1016,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.isEmptyTokenAsNull()",
      "begin_line": 1026,
      "end_line": 1028,
      "comment": "\n     * Gets whether the tokenizer currently returns empty tokens as null.\n     * The default for this property is false.\n     *\n     * @return true if empty tokens are returned as null\n     ",
      "child_ranges": [
        "(line 1027,col 9)-(line 1027,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setEmptyTokenAsNull(boolean)",
      "begin_line": 1037,
      "end_line": 1040,
      "comment": "\n     * Sets whether the tokenizer should return empty tokens as null.\n     * The default for this property is false.\n     *\n     * @param emptyAsNull  whether empty tokens are returned as null\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1038,col 9)-(line 1038,col 39)",
        "(line 1039,col 9)-(line 1039,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.isIgnoreEmptyTokens()",
      "begin_line": 1049,
      "end_line": 1051,
      "comment": "\n     * Gets whether the tokenizer currently ignores empty tokens.\n     * The default for this property is true.\n     *\n     * @return true if empty tokens are not returned\n     ",
      "child_ranges": [
        "(line 1050,col 9)-(line 1050,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setIgnoreEmptyTokens(boolean)",
      "begin_line": 1060,
      "end_line": 1063,
      "comment": "\n     * Sets whether the tokenizer should ignore and not return empty tokens.\n     * The default for this property is true.\n     *\n     * @param ignoreEmptyTokens  whether empty tokens are not returned\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1061,col 9)-(line 1061,col 51)",
        "(line 1062,col 9)-(line 1062,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getContent()",
      "begin_line": 1071,
      "end_line": 1076,
      "comment": "\n     * Gets the String content that the tokenizer is parsing.\n     *\n     * @return the string content being parsed\n     ",
      "child_ranges": [
        "(line 1072,col 9)-(line 1074,col 9)",
        "(line 1075,col 9)-(line 1075,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.clone()",
      "begin_line": 1086,
      "end_line": 1092,
      "comment": "\n     * Creates a new instance of this Tokenizer. The new instance is reset so\n     * that it will be at the start of the token list.\n     * If a {@link CloneNotSupportedException} is caught, return \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @return a new instance of this Tokenizer which has been reset.\n     ",
      "child_ranges": [
        "(line 1087,col 9)-(line 1091,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.cloneReset()",
      "begin_line": 1101,
      "end_line": 1109,
      "comment": "\n     * Creates a new instance of this Tokenizer. The new instance is reset so that\n     * it will be at the start of the token list.\n     * \n     * @return a new instance of this Tokenizer which has been reset.\n     * @throws CloneNotSupportedException if there is a problem cloning\n     ",
      "child_ranges": [
        "(line 1103,col 9)-(line 1103,col 59)",
        "(line 1104,col 9)-(line 1106,col 9)",
        "(line 1107,col 9)-(line 1107,col 23)",
        "(line 1108,col 9)-(line 1108,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.toString()",
      "begin_line": 1117,
      "end_line": 1122,
      "comment": "\n     * Gets the String content that the tokenizer is parsing.\n     *\n     * @return the string content being parsed\n     ",
      "child_ranges": [
        "(line 1118,col 9)-(line 1120,col 9)",
        "(line 1121,col 9)-(line 1121,col 47)"
      ]
    }
  ]
}