{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/text/StrTokenizer.java",
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
      "end_line": 1084,
      "comment": "\n * Tokenizes a string based based on delimiters (separators)\n * and supporting quoting and ignored character concepts.\n * \u003cp\u003e\n * This class can split a String into many smaller strings. It aims\n * to do a similar job to {@link java.util.StringTokenizer StringTokenizer},\n * however it offers much more control and flexibility including implementing\n * the \u003ccode\u003eListIterator\u003c/code\u003e interface. By default, it is setup\n * like \u003ccode\u003eStringTokenizer\u003c/code\u003e.\n * \u003cp\u003e\n * The input String is split into a number of \u003ci\u003etokens\u003c/i\u003e.\n * Each token is separated from the next String by a \u003ci\u003edelimiter\u003c/i\u003e.\n * One or more delimiter characters must be specified.\n * \u003cp\u003e\n * Each token may be surrounded by quotes.\n * The \u003ci\u003equote\u003c/i\u003e matcher specifies the quote character(s).\n * A quote may be escaped within a quoted section by duplicating itself.\n * \u003cp\u003e\n * Between each token and the delimiter are potentially characters that need trimming.\n * The \u003ci\u003etrimmer\u003c/i\u003e matcher specifies these characters.\n * One usage might be to trim whitespace characters.\n * \u003cp\u003e\n * At any point outside the quotes there might potentially be invalid characters.\n * The \u003ci\u003eignored\u003c/i\u003e matcher specifies these characters to be removed.\n * One usage might be to remove new line characters.\n * \u003cp\u003e\n * Empty tokens may be removed or returned as null.\n * \u003cpre\u003e\n * \"a,b,c\"         - Three tokens \"a\",\"b\",\"c\"   (comma delimiter)\n * \" a, b , c \"    - Three tokens \"a\",\"b\",\"c\"   (default CSV processing trims whitespace)\n * \"a, \", b ,\", c\" - Three tokens \"a, \" , \" b \", \", c\" (quoted text untouched)\n * \u003c/pre\u003e\n * \u003cp\u003e\n *\n * This tokenizer has the following properties and options:\n *\n * \u003ctable\u003e\n *  \u003ctr\u003e\n *   \u003cth\u003eProperty\u003c/th\u003e\u003cth\u003eType\u003c/th\u003e\u003cth\u003eDefault\u003c/th\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003edelim\u003c/td\u003e\u003ctd\u003eCharSetMatcher\u003c/td\u003e\u003ctd\u003e{ \\t\\n\\r\\f}\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003equote\u003c/td\u003e\u003ctd\u003eNoneMatcher\u003c/td\u003e\u003ctd\u003e{}\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003eignore\u003c/td\u003e\u003ctd\u003eNoneMatcher\u003c/td\u003e\u003ctd\u003e{}\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003eemptyTokenAsNull\u003c/td\u003e\u003ctd\u003eboolean\u003c/td\u003e\u003ctd\u003efalse\u003c/td\u003e\n *  \u003c/tr\u003e\n *  \u003ctr\u003e\n *   \u003ctd\u003eignoreEmptyTokens\u003c/td\u003e\u003ctd\u003eboolean\u003c/td\u003e\u003ctd\u003etrue\u003c/td\u003e\n *  \u003c/tr\u003e\n * \u003c/table\u003e\n *\n * @author Matthew Inger\n * @author Stephen Colebourne\n * @author Gary D. Gregory\n * @since 2.2\n * @version $Id$\n "
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
      "comment": " The text to work on "
    },
    {
      "type": "field",
      "varNames": [
        "text"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " The input text, null if char[] input "
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
      "signature": "org.apache.commons.lang.text.StrTokenizer.getCSVClone()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Returns a clone of \u003ccode\u003eCSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     * \n     * @return a clone of \u003ccode\u003eCSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getCSVInstance()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Gets a new tokenizer instance which parses Comma Seperated Value strings\n     * initializing it with the given input.  The default for CSV processing\n     * will be trim whitespace from both ends (which can be overriden with\n     * the setTrimmer method).\n     * \u003cp\u003e\n     * You must call a \"reset\" method to set the string which you want to parse.\n     * @return a new tokenizer instance which parses Comma Seperated Value strings\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getCSVInstance(java.lang.String)",
      "begin_line": 166,
      "end_line": 170,
      "comment": "\n     * Gets a new tokenizer instance which parses Comma Seperated Value strings\n     * initializing it with the given input.  The default for CSV processing\n     * will be trim whitespace from both ends (which can be overriden with\n     * the setTrimmer method).\n     *\n     * @param input  the text to parse\n     * @return a new tokenizer instance which parses Comma Seperated Value strings\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 41)",
        "(line 168,col 9)-(line 168,col 25)",
        "(line 169,col 9)-(line 169,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getCSVInstance(char[])",
      "begin_line": 181,
      "end_line": 185,
      "comment": "\n     * Gets a new tokenizer instance which parses Comma Seperated Value strings\n     * initializing it with the given input.  The default for CSV processing\n     * will be trim whitespace from both ends (which can be overriden with\n     * the setTrimmer method).\n     *\n     * @param input  the text to parse\n     * @return a new tokenizer instance which parses Comma Seperated Value strings\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 41)",
        "(line 183,col 9)-(line 183,col 25)",
        "(line 184,col 9)-(line 184,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getTSVClone()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Returns a clone of \u003ccode\u003eTSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     * \n     * @return a clone of \u003ccode\u003eTSV_TOKENIZER_PROTOTYPE\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getTSVInstance()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Gets a new tokenizer instance which parses Tab Seperated Value strings.\n     * The default for CSV processing will be trim whitespace from both ends\n     * (which can be overriden with the setTrimmer method).\n     * \u003cp\u003e\n     * You must call a \"reset\" method to set the string which you want to parse.\n     * @return a new tokenizer instance which parses Tab Seperated Value strings.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getTSVInstance(java.lang.String)",
      "begin_line": 216,
      "end_line": 220,
      "comment": "\n     * Gets a new tokenizer instance which parses Tab Seperated Value strings.\n     * The default for CSV processing will be trim whitespace from both ends\n     * (which can be overriden with the setTrimmer method).\n     * @param input  the string to parse\n     * @return a new tokenizer instance which parses Tab Seperated Value strings.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 41)",
        "(line 218,col 9)-(line 218,col 25)",
        "(line 219,col 9)-(line 219,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getTSVInstance(char[])",
      "begin_line": 229,
      "end_line": 233,
      "comment": "\n     * Gets a new tokenizer instance which parses Tab Seperated Value strings.\n     * The default for CSV processing will be trim whitespace from both ends\n     * (which can be overriden with the setTrimmer method).\n     * @param input  the string to parse\n     * @return a new tokenizer instance which parses Tab Seperated Value strings.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 41)",
        "(line 231,col 9)-(line 231,col 25)",
        "(line 232,col 9)-(line 232,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer()",
      "begin_line": 242,
      "end_line": 246,
      "comment": "\n     * Constructs a tokenizer splitting on space, tab, newline and formfeed\n     * as per StringTokenizer, but with no text to tokenize.\n     * \u003cp\u003e\n     * This constructor is normally used with {@link #reset(String)}.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 16)",
        "(line 244,col 9)-(line 244,col 23)",
        "(line 245,col 9)-(line 245,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(java.lang.String)",
      "begin_line": 254,
      "end_line": 262,
      "comment": "\n     * Constructs a tokenizer splitting on space, tab, newline and formfeed\n     * as per StringTokenizer.\n     *\n     * @param input  the string which is to be parsed\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 16)",
        "(line 256,col 9)-(line 256,col 21)",
        "(line 257,col 9)-(line 261,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(java.lang.String, char)",
      "begin_line": 270,
      "end_line": 273,
      "comment": "\n     * Constructs a tokenizer splitting on the specified delimiter character.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter character\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 20)",
        "(line 272,col 9)-(line 272,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(java.lang.String, java.lang.String)",
      "begin_line": 281,
      "end_line": 284,
      "comment": "\n     * Constructs a tokenizer splitting on the specified delimiter string.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter string\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 20)",
        "(line 283,col 9)-(line 283,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(java.lang.String, org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 292,
      "end_line": 295,
      "comment": "\n     * Constructs a tokenizer splitting using the specified delimiter matcher.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter matcher\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 20)",
        "(line 294,col 9)-(line 294,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(java.lang.String, char, char)",
      "begin_line": 305,
      "end_line": 308,
      "comment": "\n     * Constructs a tokenizer splitting on the specified delimiter character\n     * and handling quotes using the specified quote character.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter character\n     * @param quote  the field quoted string character\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 27)",
        "(line 307,col 9)-(line 307,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(java.lang.String, org.apache.commons.lang.text.StrMatcher, org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 318,
      "end_line": 321,
      "comment": "\n     * Constructs a tokenizer splitting using the specified delimiter matcher\n     * and handling quotes using the specified quote matcher.\n     *\n     * @param input  the string which is to be parsed\n     * @param delim  the field delimiter matcher\n     * @param quote  the field quoted string matcher\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 27)",
        "(line 320,col 9)-(line 320,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(char[])",
      "begin_line": 332,
      "end_line": 336,
      "comment": "\n     * Constructs a tokenizer splitting on space, tab, newline and formfeed\n     * as per StringTokenizer.\n     * \u003cp\u003e\n     * The input character array is not cloned, and must not be altered after\n     * passing in to this method.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 16)",
        "(line 334,col 9)-(line 334,col 25)",
        "(line 335,col 9)-(line 335,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(char[], char)",
      "begin_line": 347,
      "end_line": 350,
      "comment": "\n     * Constructs a tokenizer splitting on the specified character.\n     * \u003cp\u003e\n     * The input character array is not cloned, and must not be altered after\n     * passing in to this method.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim the field delimiter character\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 20)",
        "(line 349,col 9)-(line 349,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(char[], java.lang.String)",
      "begin_line": 361,
      "end_line": 364,
      "comment": "\n     * Constructs a tokenizer splitting on the specified string.\n     * \u003cp\u003e\n     * The input character array is not cloned, and must not be altered after\n     * passing in to this method.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim the field delimiter string\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 20)",
        "(line 363,col 9)-(line 363,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(char[], org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 375,
      "end_line": 378,
      "comment": "\n     * Constructs a tokenizer splitting using the specified delimiter matcher.\n     * \u003cp\u003e\n     * The input character array is not cloned, and must not be altered after\n     * passing in to this method.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim  the field delimiter matcher\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 20)",
        "(line 377,col 9)-(line 377,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(char[], char, char)",
      "begin_line": 391,
      "end_line": 394,
      "comment": "\n     * Constructs a tokenizer splitting on the specified delimiter character\n     * and handling quotes using the specified quote character.\n     * \u003cp\u003e\n     * The input character array is not cloned, and must not be altered after\n     * passing in to this method.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim  the field delimiter character\n     * @param quote  the field quoted string character\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 27)",
        "(line 393,col 9)-(line 393,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrTokenizer.StrTokenizer(char[], org.apache.commons.lang.text.StrMatcher, org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 407,
      "end_line": 410,
      "comment": "\n     * Constructs a tokenizer splitting using the specified delimiter matcher\n     * and handling quotes using the specified quote matcher.\n     * \u003cp\u003e\n     * The input character array is not cloned, and must not be altered after\n     * passing in to this method.\n     *\n     * @param input  the string which is to be parsed, not cloned\n     * @param delim  the field delimiter character\n     * @param quote  the field quoted string character\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 27)",
        "(line 409,col 9)-(line 409,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.size()",
      "begin_line": 419,
      "end_line": 422,
      "comment": "\n     * Gets the number of tokens found in the String.\n     *\n     * @return the number of matched tokens\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 19)",
        "(line 421,col 9)-(line 421,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.nextToken()",
      "begin_line": 429,
      "end_line": 434,
      "comment": "\n     * Gets the next token from the String.\n     *\n     * @return the next sequential token, or null when no more tokens are found\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.previousToken()",
      "begin_line": 441,
      "end_line": 446,
      "comment": "\n     * Gets the previous token from the String.\n     *\n     * @return the previous sequential token, or null when no more tokens are found\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getAllTokens()",
      "begin_line": 453,
      "end_line": 456,
      "comment": "\n     * Gets a copy of the full token list.\n     *\n     * @return the tokens as a String array\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 19)",
        "(line 455,col 9)-(line 455,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.reset()",
      "begin_line": 465,
      "end_line": 469,
      "comment": "\n     * Resets this tokenizer, forgetting all parsing and iteration already completed.\n     * \u003cp\u003e\n     * This method allows the same tokenizer to be reused for the same String.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 21)",
        "(line 467,col 9)-(line 467,col 22)",
        "(line 468,col 9)-(line 468,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.reset(java.lang.String)",
      "begin_line": 479,
      "end_line": 488,
      "comment": "\n     * Reset this tokenizer, giving it a new input string to parse.\n     * In this manner you can re-use a tokenizer with the same settings\n     * on multiple input lines.\n     *\n     * @param input  the new string to tokenize, null sets no text to parse\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 16)",
        "(line 481,col 9)-(line 481,col 21)",
        "(line 482,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 487,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.reset(char[])",
      "begin_line": 501,
      "end_line": 506,
      "comment": "\n     * Reset this tokenizer, giving it a new input string to parse.\n     * In this manner you can re-use a tokenizer with the same settings\n     * on multiple input lines.\n     * \u003cp\u003e\n     * The input character array is not cloned, and must not be altered after\n     * passing in to this method.\n     *\n     * @param input  the new character array to tokenize, not cloned, null sets no text to parse\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 16)",
        "(line 503,col 9)-(line 503,col 20)",
        "(line 504,col 9)-(line 504,col 22)",
        "(line 505,col 9)-(line 505,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.hasNext()",
      "begin_line": 515,
      "end_line": 518,
      "comment": "\n     * Checks whether there are any more tokens.\n     *\n     * @return true if there are more tokens\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 19)",
        "(line 517,col 9)-(line 517,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.next()",
      "begin_line": 525,
      "end_line": 530,
      "comment": "\n     * Gets the next token. This method is equivalent to {@link #nextToken()}.\n     *\n     * @return the next String token\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.nextIndex()",
      "begin_line": 537,
      "end_line": 539,
      "comment": "\n     * Gets the index of the next token to return.\n     *\n     * @return the next token index\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.hasPrevious()",
      "begin_line": 546,
      "end_line": 549,
      "comment": "\n     * Checks whether there are any previous tokens that can be iterated to.\n     *\n     * @return true if there are previous tokens\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 19)",
        "(line 548,col 9)-(line 548,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.previous()",
      "begin_line": 556,
      "end_line": 561,
      "comment": "\n     * Gets the token previous to the last returned token.\n     *\n     * @return the previous token\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 560,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.previousIndex()",
      "begin_line": 568,
      "end_line": 570,
      "comment": "\n     * Gets the index of the previous token.\n     *\n     * @return the previous token index\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.remove()",
      "begin_line": 577,
      "end_line": 579,
      "comment": "\n     * Unsupported ListIterator operation.\n     *\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.set(java.lang.Object)",
      "begin_line": 586,
      "end_line": 588,
      "comment": "\n     * Unsupported ListIterator operation.\n     * @param obj this parameter ignored.\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.add(java.lang.Object)",
      "begin_line": 595,
      "end_line": 597,
      "comment": "\n     * Unsupported ListIterator operation.\n     * @param obj this parameter ignored.\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.tokenize()",
      "begin_line": 604,
      "end_line": 608,
      "comment": "\n     * Performs the tokenization if it hasn\u0027t already been done.\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 607,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.readTokens()",
      "begin_line": 615,
      "end_line": 638,
      "comment": "\n     * Read all the tokens.\n     * \n     * @return array containing the tokens.\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 618,col 9)",
        "(line 619,col 9)-(line 619,col 31)",
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 623,col 42)",
        "(line 624,col 9)-(line 624,col 38)",
        "(line 625,col 9)-(line 625,col 22)",
        "(line 628,col 9)-(line 636,col 9)",
        "(line 637,col 9)-(line 637,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.addToken(java.util.List, java.lang.String)",
      "begin_line": 646,
      "end_line": 656,
      "comment": "\n     * Adds a token to a list, paying attention to the parameters we\u0027ve set.\n     *\n     * @param list  the list to add to\n     * @param tok  the token to add\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 655,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.readNextToken(char[], int, int, org.apache.commons.lang.text.StrBuilder, java.util.List)",
      "begin_line": 669,
      "end_line": 703,
      "comment": "\n     * Reads character by character through the String to get the next token.\n     *\n     * @param chars  the character array being tokenized\n     * @param start  the first character of field\n     * @param len  the length of the character array being tokenized\n     * @param workArea  a temporary work area\n     * @param tokens  the list of parsed tokens\n     * @return the starting position of the next field (the character\n     *  immediately after the delimiter), or -1 if end of string found\n     ",
      "child_ranges": [
        "(line 672,col 9)-(line 682,col 9)",
        "(line 685,col 9)-(line 688,col 9)",
        "(line 691,col 9)-(line 691,col 79)",
        "(line 692,col 9)-(line 695,col 9)",
        "(line 698,col 9)-(line 698,col 75)",
        "(line 699,col 9)-(line 701,col 9)",
        "(line 702,col 9)-(line 702,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.readWithQuotes(char[], int, int, org.apache.commons.lang.text.StrBuilder, java.util.List, int, int)",
      "begin_line": 719,
      "end_line": 805,
      "comment": "\n     * Reads a possibly quoted string token.\n     *\n     * @param chars  the character array being tokenized\n     * @param start  the first character of field\n     * @param len  the length of the character array being tokenized\n     * @param workArea  a temporary work area\n     * @param tokens  the list of parsed tokens\n     * @param quoteStart  the start position of the matched quote, 0 if no quoting\n     * @param quoteLen  the length of the matched quote, 0 if no quoting\n     * @return the starting position of the next field (the character\n     *  immediately after the delimiter, or if end of string found,\n     *  then the length of string\n     ",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 25)",
        "(line 725,col 9)-(line 725,col 24)",
        "(line 726,col 9)-(line 726,col 41)",
        "(line 727,col 9)-(line 727,col 26)",
        "(line 729,col 9)-(line 800,col 9)",
        "(line 803,col 9)-(line 803,col 59)",
        "(line 804,col 9)-(line 804,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.isQuote(char[], int, int, int, int)",
      "begin_line": 818,
      "end_line": 825,
      "comment": "\n     * Checks if the characters at the index specified match the quote\n     * already matched in readNextToken().\n     *\n     * @param chars  the character array being tokenized\n     * @param pos  the position to check for a quote\n     * @param len  the length of the character array being tokenized\n     * @param quoteStart  the start position of the matched quote, 0 if no quoting\n     * @param quoteLen  the length of the matched quote, 0 if no quoting\n     * @return true if a quote is matched\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 823,col 9)",
        "(line 824,col 9)-(line 824,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getDelimiterMatcher()",
      "begin_line": 834,
      "end_line": 836,
      "comment": "\n     * Gets the field delimiter matcher.\n     *\n     * @return the delimiter matcher in use\n     ",
      "child_ranges": [
        "(line 835,col 9)-(line 835,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setDelimiterMatcher(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 846,
      "end_line": 853,
      "comment": "\n     * Sets the field delimiter matcher.\n     * \u003cp\u003e\n     * The delimitier is used to separate one token from another.\n     *\n     * @param delim  the delimiter matcher to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 851,col 9)",
        "(line 852,col 9)-(line 852,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setDelimiterChar(char)",
      "begin_line": 861,
      "end_line": 863,
      "comment": "\n     * Sets the field delimiter character.\n     *\n     * @param delim  the delimiter character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setDelimiterString(java.lang.String)",
      "begin_line": 871,
      "end_line": 873,
      "comment": "\n     * Sets the field delimiter string.\n     *\n     * @param delim  the delimiter string to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getQuoteMatcher()",
      "begin_line": 886,
      "end_line": 888,
      "comment": "\n     * Gets the quote matcher currently in use.\n     * \u003cp\u003e\n     * The quote character is used to wrap data between the tokens.\n     * This enables delimiters to be entered as data.\n     * The default value is \u0027\"\u0027 (double quote).\n     *\n     * @return the quote matcher in use\n     ",
      "child_ranges": [
        "(line 887,col 9)-(line 887,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setQuoteMatcher(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 899,
      "end_line": 904,
      "comment": "\n     * Set the quote matcher to use.\n     * \u003cp\u003e\n     * The quote character is used to wrap data between the tokens.\n     * This enables delimiters to be entered as data.\n     *\n     * @param quote  the quote matcher to use, null ignored\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 900,col 9)-(line 902,col 9)",
        "(line 903,col 9)-(line 903,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setQuoteChar(char)",
      "begin_line": 915,
      "end_line": 917,
      "comment": "\n     * Sets the quote character to use.\n     * \u003cp\u003e\n     * The quote character is used to wrap data between the tokens.\n     * This enables delimiters to be entered as data.\n     *\n     * @param quote  the quote character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 916,col 9)-(line 916,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getIgnoredMatcher()",
      "begin_line": 930,
      "end_line": 932,
      "comment": "\n     * Gets the ignored character matcher.\n     * \u003cp\u003e\n     * These characters are ignored when parsing the String, unless they are\n     * within a quoted region.\n     * The default value is not to ignore anything.\n     *\n     * @return the ignored matcher in use\n     ",
      "child_ranges": [
        "(line 931,col 9)-(line 931,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setIgnoredMatcher(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 943,
      "end_line": 948,
      "comment": "\n     * Set the matcher for characters to ignore.\n     * \u003cp\u003e\n     * These characters are ignored when parsing the String, unless they are\n     * within a quoted region.\n     *\n     * @param ignored  the ignored matcher to use, null ignored\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 946,col 9)",
        "(line 947,col 9)-(line 947,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setIgnoredChar(char)",
      "begin_line": 959,
      "end_line": 961,
      "comment": "\n     * Set the character to ignore.\n     * \u003cp\u003e\n     * This character is ignored when parsing the String, unless it is\n     * within a quoted region.\n     *\n     * @param ignored  the ignored character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 960,col 9)-(line 960,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getTrimmerMatcher()",
      "begin_line": 974,
      "end_line": 976,
      "comment": "\n     * Gets the trimmer character matcher.\n     * \u003cp\u003e\n     * These characters are trimmed off on each side of the delimiter\n     * until the token or quote is found.\n     * The default value is not to trim anything.\n     *\n     * @return the trimmer matcher in use\n     ",
      "child_ranges": [
        "(line 975,col 9)-(line 975,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setTrimmerMatcher(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 987,
      "end_line": 992,
      "comment": "\n     * Sets the matcher for characters to trim.\n     * \u003cp\u003e\n     * These characters are trimmed off on each side of the delimiter\n     * until the token or quote is found.\n     *\n     * @param trimmer  the trimmer matcher to use, null ignored\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 988,col 9)-(line 990,col 9)",
        "(line 991,col 9)-(line 991,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.isEmptyTokenAsNull()",
      "begin_line": 1001,
      "end_line": 1003,
      "comment": "\n     * Gets whether the tokenizer currently returns empty tokens as null.\n     * The default for this property is false.\n     *\n     * @return true if empty tokens are returned as null\n     ",
      "child_ranges": [
        "(line 1002,col 9)-(line 1002,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setEmptyTokenAsNull(boolean)",
      "begin_line": 1012,
      "end_line": 1015,
      "comment": "\n     * Sets whether the tokenizer should return empty tokens as null.\n     * The default for this property is false.\n     *\n     * @param emptyAsNull  whether empty tokens are returned as null\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1013,col 39)",
        "(line 1014,col 9)-(line 1014,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.isIgnoreEmptyTokens()",
      "begin_line": 1024,
      "end_line": 1026,
      "comment": "\n     * Gets whether the tokenizer currently ignores empty tokens.\n     * The default for this property is false.\n     *\n     * @return true if empty tokens are not returned\n     ",
      "child_ranges": [
        "(line 1025,col 9)-(line 1025,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.setIgnoreEmptyTokens(boolean)",
      "begin_line": 1035,
      "end_line": 1038,
      "comment": "\n     * Sets whether the tokenizer should ignore and not return empty tokens.\n     * The default for this property is false.\n     *\n     * @param ignoreEmptyTokens  whether empty tokens are not returned\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1036,col 9)-(line 1036,col 51)",
        "(line 1037,col 9)-(line 1037,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.getContent()",
      "begin_line": 1046,
      "end_line": 1051,
      "comment": "\n     * Gets the String content that the tokenizer is parsing.\n     *\n     * @return the string content being parsed\n     ",
      "child_ranges": [
        "(line 1047,col 9)-(line 1049,col 9)",
        "(line 1050,col 9)-(line 1050,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.clone()",
      "begin_line": 1060,
      "end_line": 1066,
      "comment": "\n     * Creates a new instance of this Tokenizer. The new instance is reset so that it will be at the start of the token\n     * list. If a {@link CloneNotSupportedException} is caught, return \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @return a new instance of this Tokenizer which has been reset.\n     ",
      "child_ranges": [
        "(line 1061,col 9)-(line 1065,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrTokenizer.cloneReset()",
      "begin_line": 1075,
      "end_line": 1082,
      "comment": "\n     * Creates a new instance of this Tokenizer. The new instance is reset so that it will be at the start of the token\n     * list.\n     * \n     * @return a new instance of this Tokenizer which has been reset.\n     * @throws CloneNotSupportedException if there is a problem cloning\n     ",
      "child_ranges": [
        "(line 1076,col 9)-(line 1076,col 59)",
        "(line 1077,col 9)-(line 1079,col 9)",
        "(line 1080,col 9)-(line 1080,col 23)",
        "(line 1081,col 9)-(line 1081,col 22)"
      ]
    }
  ]
}