{
  "filepath": "/tmp/Csv-7b/src/main/java/org/apache/commons/csv/CSVFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVFormat",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 145,
      "end_line": 889,
      "comment": "\n * Specifies the format of a CSV file and parses input.\n *\n * \u003ch2\u003eUsing predefined formats\u003c/h2\u003e\n *\n * \u003cp\u003e\n * You can use one of the predefined formats:\n * \u003c/p\u003e\n *\n * \u003cul\u003e\n *      \u003cli\u003e{@link #DEFAULT}\u003c/li\u003e\n *      \u003cli\u003e{@link #EXCEL}\u003c/li\u003e\n *      \u003cli\u003e{@link #MYSQL}\u003c/li\u003e\n *      \u003cli\u003e{@link #RFC4180}\u003c/li\u003e\n *      \u003cli\u003e{@link #TDF}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003e\n * For example:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVParser parser \u003d CSVFormat.EXCEL.parse(reader);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * The {@link CSVRecord} provides static methods to parse other input types, for example:\n * \u003c/p\u003e\n *\n * \u003cpre\u003eCSVParser parser \u003d CSVFormat.parseFile(file, CSVFormat.EXCEL);\u003c/pre\u003e\n *\n * \u003ch2\u003eDefining formats\u003c/h2\u003e\n *\n * \u003cp\u003e\n * You can extend a format by calling the {@code with} methods. For example:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVFormat.EXCEL\n *   .withNullString(\u0026quot;N/A\u0026quot;)\n *   .withIgnoreSurroundingSpaces(true);\n * \u003c/pre\u003e\n *\n * \u003ch2\u003eDefining column names\u003c/h2\u003e\n *\n * \u003cp\u003e\n * To define the column names you want to use to access records, write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVFormat.EXCEL.withHeader(\u0026quot;Col1\u0026quot;, \u0026quot;Col2\u0026quot;, \u0026quot;Col3\u0026quot;);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * Calling {@link #withHeader(String...)} let\u0027s you use the given names to address values in a {@link CSVRecord}, and\n * assumes that your CSV source does not contain a first record that also defines column names.\n *\n * If it does, then you are overriding this metadata with your names and you should skip the first record by calling\n * {@link #withSkipHeaderRecord(boolean)} with {@code true}.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eParsing\u003c/h2\u003e\n *\n * \u003cp\u003e\n * You can use a format directly to parse a reader. For example, to parse an Excel file with columns header, write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * Reader in \u003d ...;\n * CSVFormat.EXCEL.withHeader(\u0026quot;Col1\u0026quot;, \u0026quot;Col2\u0026quot;, \u0026quot;Col3\u0026quot;).parse(in);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * For other input types, like resources, files, and URLs, use the static methods on {@link CSVParser}.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eReferencing columns safely\u003c/h2\u003e\n *\n * \u003cp\u003e\n * If your source contains a header record, you can simplify your code and safely reference columns,\n * by using {@link #withHeader(String...)} with no arguments:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVFormat.EXCEL.withHeader();\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * This causes the parser to read the first record and use its values as column names.\n *\n * Then, call one of the {@link CSVRecord} get method that takes a String column name argument:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * String value \u003d record.get(\u0026quot;Col1\u0026quot;);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * This makes your code impervious to changes in column order in the CSV file.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eNotes\u003c/h2\u003e\n *\n * \u003cp\u003e\n * This class is immutable.\n * \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delimiter"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "quoteChar"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " null if quoting is disabled"
    },
    {
      "type": "field",
      "varNames": [
        "quotePolicy"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "commentStart"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " null if commenting is disabled"
    },
    {
      "type": "field",
      "varNames": [
        "escape"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " null if escaping is disabled"
    },
    {
      "type": "field",
      "varNames": [
        "ignoreSurroundingSpaces"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " Should leading/trailing spaces be ignored around values?"
    },
    {
      "type": "field",
      "varNames": [
        "ignoreEmptyLines"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordSeparator"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " for outputs"
    },
    {
      "type": "field",
      "varNames": [
        "nullString"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " the string to be used for null values"
    },
    {
      "type": "field",
      "varNames": [
        "header"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "skipHeaderRecord"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT"
      ],
      "begin_line": 174,
      "end_line": 175,
      "comment": "\n     * Standard comma separated format, as for {@link #RFC4180} but allowing empty lines.\n     * \u003ch3\u003eRFC 4180:\u003c/h3\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuoteChar(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(CRLF)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003ch3\u003eAdditional:\u003c/h3\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithIgnoreEmptyLines(true)\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RFC4180"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": "\n     * Comma separated format as defined by \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     * \u003ch3\u003eRFC 4180:\u003c/h3\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuoteChar(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(CRLF)\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXCEL"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": "\n     * Excel file format (using a comma as the value delimiter). Note that the actual value delimiter used by Excel is\n     * locale dependent, it might be necessary to customize this format to accommodate to your regional settings.\n     *\n     * \u003cp\u003e\n     * For example for parsing or generating a CSV file on a French system the following format will be used:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * CSVFormat fmt \u003d CSVFormat.newBuilder(EXCEL).withDelimiter(\u0027;\u0027);\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\n     * Settings are:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuoteChar(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(CRLF)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * Note: this is currently the same as RFC4180\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TDF"
      ],
      "begin_line": 213,
      "end_line": 216,
      "comment": " Tab-delimited format, with quote; leading and trailing spaces ignored. "
    },
    {
      "type": "field",
      "varNames": [
        "MYSQL"
      ],
      "begin_line": 226,
      "end_line": 232,
      "comment": "\n     * Default MySQL format used by the \u003ctt\u003eSELECT INTO OUTFILE\u003c/tt\u003e and \u003ctt\u003eLOAD DATA INFILE\u003c/tt\u003e operations. This is\n     * a tab-delimited format with a LF character as the line separator. Values are not quoted and special characters\n     * are escaped with \u0027\\\u0027.\n     *\n     * @see \u003ca href\u003d\"http://dev.mysql.com/doc/refman/5.1/en/load-data.html\"\u003e\n     *      http://dev.mysql.com/doc/refman/5.1/en/load-data.html\u003c/a\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isLineBreak(char)",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * Returns true if the given character is a line break character.\n     *\n     * @param c\n     *            the character to check\n     *\n     * @return true if \u003ccode\u003ec\u003c/code\u003e is a line break character\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isLineBreak(java.lang.Character)",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n     * Returns true if the given character is a line break character.\n     *\n     * @param c\n     *            the character to check, may be null\n     *\n     * @return true if \u003ccode\u003ec\u003c/code\u003e is a line break character (and not null)\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.newFormat(char)",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * Creates a new CSV format with the specified delimiter.\n     *\n     * @param delimiter\n     *            the char used for value separation, must not be a line break character\n     * @return a new CSV format.\n     * @throws IllegalArgumentException if the delimiter is a line break character\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 103)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormat(char, java.lang.Character, org.apache.commons.csv.Quote, java.lang.Character, java.lang.Character, boolean, boolean, java.lang.String, java.lang.String, java.lang.String[], boolean)",
      "begin_line": 297,
      "end_line": 316,
      "comment": " package protected to give access without needing a synthetic accessor",
      "child_ranges": [
        "(line 302,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 35)",
        "(line 306,col 9)-(line 306,col 35)",
        "(line 307,col 9)-(line 307,col 39)",
        "(line 308,col 9)-(line 308,col 41)",
        "(line 309,col 9)-(line 309,col 29)",
        "(line 310,col 9)-(line 310,col 63)",
        "(line 311,col 9)-(line 311,col 49)",
        "(line 312,col 9)-(line 312,col 47)",
        "(line 313,col 9)-(line 313,col 37)",
        "(line 314,col 9)-(line 314,col 61)",
        "(line 315,col 9)-(line 315,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.equals(java.lang.Object)",
      "begin_line": 318,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 330,col 9)-(line 330,col 48)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.format(java.lang.Object...)",
      "begin_line": 384,
      "end_line": 393,
      "comment": "\n     * Formats the specified values.\n     *\n     * @param values\n     *            the values to format\n     * @return the formatted values\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 52)",
        "(line 386,col 9)-(line 392,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getCommentStart()",
      "begin_line": 400,
      "end_line": 402,
      "comment": "\n     * Returns the character marking the start of a line comment.\n     *\n     * @return the comment start marker, may be {@code null}\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getDelimiter()",
      "begin_line": 409,
      "end_line": 411,
      "comment": "\n     * Returns the character delimiting the values (typically \u0027;\u0027, \u0027,\u0027 or \u0027\\t\u0027).\n     *\n     * @return the delimiter character\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getEscape()",
      "begin_line": 418,
      "end_line": 420,
      "comment": "\n     * Returns the escape character.\n     *\n     * @return the escape character, may be {@code null}\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getHeader()",
      "begin_line": 427,
      "end_line": 429,
      "comment": "\n     * Returns a copy of the header array.\n     *\n     * @return a copy of the header array\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreEmptyLines()",
      "begin_line": 437,
      "end_line": 439,
      "comment": "\n     * Specifies whether empty lines between records are ignored when parsing input.\n     *\n     * @return \u003ctt\u003etrue\u003c/tt\u003e if empty lines between records are ignored, \u003ctt\u003efalse\u003c/tt\u003e if they are turned into empty\n     *         records.\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreSurroundingSpaces()",
      "begin_line": 447,
      "end_line": 449,
      "comment": "\n     * Specifies whether spaces around values are ignored when parsing input.\n     *\n     * @return \u003ctt\u003etrue\u003c/tt\u003e if spaces around values are ignored, \u003ctt\u003efalse\u003c/tt\u003e if they are treated as part of the\n     *         value.\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getNullString()",
      "begin_line": 464,
      "end_line": 466,
      "comment": "\n     * Gets the String to convert to and from {@code null}.\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003cstrong\u003eReading:\u003c/strong\u003e Converts strings equal to the given {@code nullString} to {@code null} when reading\n     * records.\n     * \u003c/li\u003e\n     * \u003cli\u003e\n     * \u003cstrong\u003eWriting:\u003c/strong\u003e Writes {@code null} as the given {@code nullString} when writing records.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @return the String to convert to and from {@code null}. No substitution occurs if {@code null}\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getQuoteChar()",
      "begin_line": 473,
      "end_line": 475,
      "comment": "\n     * Returns the character used to encapsulate values containing special characters.\n     *\n     * @return the quoteChar character, may be {@code null}\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getQuotePolicy()",
      "begin_line": 482,
      "end_line": 484,
      "comment": "\n     * Returns the quote policy output fields.\n     *\n     * @return the quote policy\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getRecordSeparator()",
      "begin_line": 491,
      "end_line": 493,
      "comment": "\n     * Returns the line separator delimiting output records.\n     *\n     * @return the line separator\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getSkipHeaderRecord()",
      "begin_line": 500,
      "end_line": 502,
      "comment": "\n     * Returns whether to skip the header record.\n     *\n     * @return whether to skip the header record.\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.hashCode()",
      "begin_line": 504,
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 29)",
        "(line 508,col 9)-(line 508,col 23)",
        "(line 510,col 9)-(line 510,col 44)",
        "(line 511,col 9)-(line 511,col 87)",
        "(line 512,col 9)-(line 512,col 83)",
        "(line 513,col 9)-(line 513,col 89)",
        "(line 514,col 9)-(line 514,col 77)",
        "(line 515,col 9)-(line 515,col 74)",
        "(line 516,col 9)-(line 516,col 67)",
        "(line 517,col 9)-(line 517,col 95)",
        "(line 518,col 9)-(line 518,col 58)",
        "(line 519,col 9)-(line 519,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isCommentingEnabled()",
      "begin_line": 529,
      "end_line": 531,
      "comment": "\n     * Specifies whether comments are supported by this format.\n     *\n     * Note that the comment introducer character is only recognized at the start of a line.\n     *\n     * @return \u003ctt\u003etrue\u003c/tt\u003e is comments are supported, \u003ctt\u003efalse\u003c/tt\u003e otherwise\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isEscaping()",
      "begin_line": 538,
      "end_line": 540,
      "comment": "\n     * Returns whether escape are being processed.\n     *\n     * @return {@code true} if escapes are processed\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isNullHandling()",
      "begin_line": 547,
      "end_line": 549,
      "comment": "\n     * Returns whether a nullString has been defined.\n     *\n     * @return {@code true} if a nullString is defined\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isQuoting()",
      "begin_line": 556,
      "end_line": 558,
      "comment": "\n     * Returns whether a quoteChar has been defined.\n     *\n     * @return {@code true} if a quoteChar is defined\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.parse(java.io.Reader)",
      "begin_line": 573,
      "end_line": 575,
      "comment": "\n     * Parses the specified content.\n     *\n     * \u003cp\u003e\n     * See also the various static parse methods on {@link CSVParser}.\n     * \u003c/p\u003e\n     *\n     * @param in\n     *            the input stream\n     * @return a parser over a stream of {@link CSVRecord}s.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.toString()",
      "begin_line": 577,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 53)",
        "(line 580,col 9)-(line 580,col 63)",
        "(line 581,col 9)-(line 584,col 9)",
        "(line 585,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 600,col 9)",
        "(line 601,col 9)-(line 603,col 9)",
        "(line 604,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 65)",
        "(line 608,col 9)-(line 611,col 9)",
        "(line 612,col 9)-(line 612,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.validate()",
      "begin_line": 620,
      "end_line": 657,
      "comment": "\n     * Verifies the consistency of the parameters and throws an IllegalStateException if necessary.\n     *\n     * @throws IllegalStateException\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 624,col 9)",
        "(line 626,col 9)-(line 629,col 9)",
        "(line 631,col 9)-(line 634,col 9)",
        "(line 636,col 9)-(line 639,col 9)",
        "(line 641,col 9)-(line 644,col 9)",
        "(line 646,col 9)-(line 648,col 9)",
        "(line 650,col 9)-(line 656,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withCommentStart(char)",
      "begin_line": 670,
      "end_line": 672,
      "comment": "\n     * Sets the comment start marker of the format to the specified character.\n     *\n     * Note that the comment start character is only recognized at the start of a line.\n     *\n     * @param commentStart\n     *            the comment start marker\n     * @return A new CSVFormat that is equal to this one but with the specified character as the comment start marker\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 671,col 9)-(line 671,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withCommentStart(java.lang.Character)",
      "begin_line": 685,
      "end_line": 691,
      "comment": "\n     * Sets the comment start marker of the format to the specified character.\n     *\n     * Note that the comment start character is only recognized at the start of a line.\n     *\n     * @param commentStart\n     *            the comment start marker, use {@code null} to disable\n     * @return A new CSVFormat that is equal to this one but with the specified character as the comment start marker\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 686,col 9)-(line 688,col 9)",
        "(line 689,col 9)-(line 690,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withDelimiter(char)",
      "begin_line": 702,
      "end_line": 708,
      "comment": "\n     * Sets the delimiter of the format to the specified character.\n     *\n     * @param delimiter\n     *            the delimiter character\n     * @return A new CSVFormat that is equal to this with the specified character as delimiter\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 703,col 9)-(line 705,col 9)",
        "(line 706,col 9)-(line 707,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withEscape(char)",
      "begin_line": 719,
      "end_line": 721,
      "comment": "\n     * Sets the escape character of the format to the specified character.\n     *\n     * @param escape\n     *            the escape character\n     * @return A new CSVFormat that is equal to his but with the specified character as the escape character\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withEscape(java.lang.Character)",
      "begin_line": 732,
      "end_line": 738,
      "comment": "\n     * Sets the escape character of the format to the specified character.\n     *\n     * @param escape\n     *            the escape character, use {@code null} to disable\n     * @return A new CSVFormat that is equal to this but with the specified character as the escape character\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 735,col 9)",
        "(line 736,col 9)-(line 737,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeader(java.lang.String...)",
      "begin_line": 757,
      "end_line": 760,
      "comment": "\n     * Sets the header of the format. The header can either be parsed automatically from the input file with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader();\u003c/pre\u003e\n     *\n     * or specified manually with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader(\u0026quot;name\u0026quot;, \u0026quot;email\u0026quot;, \u0026quot;phone\u0026quot;);\u003c/pre\u003e\n     *\n     * @param header\n     *            the header, \u003ctt\u003enull\u003c/tt\u003e if disabled, empty if parsed automatically, user specified otherwise.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @see #withSkipHeaderRecord(boolean)\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 759,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreEmptyLines(boolean)",
      "begin_line": 770,
      "end_line": 773,
      "comment": "\n     * Sets the empty line skipping behavior of the format.\n     *\n     * @param ignoreEmptyLines\n     *            the empty line skipping behavior, \u003ctt\u003etrue\u003c/tt\u003e to ignore the empty lines between the records,\n     *            \u003ctt\u003efalse\u003c/tt\u003e to translate empty lines to empty records.\n     * @return A new CSVFormat that is equal to this but with the specified empty line skipping behavior.\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 772,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreSurroundingSpaces(boolean)",
      "begin_line": 783,
      "end_line": 786,
      "comment": "\n     * Sets the trimming behavior of the format.\n     *\n     * @param ignoreSurroundingSpaces\n     *            the trimming behavior, \u003ctt\u003etrue\u003c/tt\u003e to remove the surrounding spaces, \u003ctt\u003efalse\u003c/tt\u003e to leave the\n     *            spaces as is.\n     * @return A new CSVFormat that is equal to this but with the specified trimming behavior.\n     ",
      "child_ranges": [
        "(line 784,col 9)-(line 785,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withNullString(java.lang.String)",
      "begin_line": 803,
      "end_line": 806,
      "comment": "\n     * Performs conversions to and from null for strings on input and output.\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003cstrong\u003eReading:\u003c/strong\u003e Converts strings equal to the given {@code nullString} to {@code null} when reading\n     * records.\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003cstrong\u003eWriting:\u003c/strong\u003e Writes {@code null} as the given {@code nullString} when writing records.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param nullString\n     *            the String to convert to and from {@code null}. No substitution occurs if {@code null}\n     *\n     * @return A new CSVFormat that is equal to this but with the specified null conversion string.\n     ",
      "child_ranges": [
        "(line 804,col 9)-(line 805,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withQuoteChar(char)",
      "begin_line": 817,
      "end_line": 819,
      "comment": "\n     * Sets the quoteChar of the format to the specified character.\n     *\n     * @param quoteChar\n     *            the quoteChar character\n     * @return A new CSVFormat that is equal to this but with the specified character as quoteChar\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withQuoteChar(java.lang.Character)",
      "begin_line": 830,
      "end_line": 836,
      "comment": "\n     * Sets the quoteChar of the format to the specified character.\n     *\n     * @param quoteChar\n     *            the quoteChar character, use {@code null} to disable\n     * @return A new CSVFormat that is equal to this but with the specified character as quoteChar\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 831,col 9)-(line 833,col 9)",
        "(line 834,col 9)-(line 835,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withQuotePolicy(org.apache.commons.csv.Quote)",
      "begin_line": 846,
      "end_line": 849,
      "comment": "\n     * Sets the output quote policy of the format to the specified value.\n     *\n     * @param quotePolicy\n     *            the quote policy to use for output.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified quote policy\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 848,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withRecordSeparator(char)",
      "begin_line": 859,
      "end_line": 861,
      "comment": "\n     * Sets the record separator of the format to the specified character.\n     *\n     * @param recordSeparator\n     *            the record separator to use for output.\n     *\n     * @return A new CSVFormat that is equal to this but with the the specified output record separator\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withRecordSeparator(java.lang.String)",
      "begin_line": 871,
      "end_line": 874,
      "comment": "\n     * Sets the record separator of the format to the specified String.\n     *\n     * @param recordSeparator\n     *            the record separator to use for output.\n     *\n     * @return A new CSVFormat that is equal to this but with the the specified output record separator\n     ",
      "child_ranges": [
        "(line 872,col 9)-(line 873,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withSkipHeaderRecord(boolean)",
      "begin_line": 885,
      "end_line": 888,
      "comment": "\n     * Sets whether to skip the header record.\n     *\n     * @param skipHeaderRecord\n     *            whether to skip the header record.\n     *\n     * @return A new CSVFormat that is equal to this but with the the specified skipHeaderRecord setting.\n     * @see #withHeader(String...)\n     ",
      "child_ranges": [
        "(line 886,col 9)-(line 887,col 114)"
      ]
    }
  ]
}