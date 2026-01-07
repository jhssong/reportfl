{
  "filepath": "/tmp/Csv-11b/src/main/java/org/apache/commons/csv/CSVFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVFormat",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 145,
      "end_line": 975,
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
        "ignoreEmptyHeaders"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreEmptyLines"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordSeparator"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " for outputs"
    },
    {
      "type": "field",
      "varNames": [
        "nullString"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " the string to be used for null values"
    },
    {
      "type": "field",
      "varNames": [
        "header"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " array of header column names"
    },
    {
      "type": "field",
      "varNames": [
        "skipHeaderRecord"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT"
      ],
      "begin_line": 175,
      "end_line": 176,
      "comment": "\n     * Standard comma separated format, as for {@link #RFC4180} but allowing empty lines.\n     * \u003ch3\u003eRFC 4180:\u003c/h3\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuoteChar(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(CRLF)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003ch3\u003eAdditional:\u003c/h3\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithIgnoreEmptyLines(true)\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RFC4180"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": "\n     * Comma separated format as defined by \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     * \u003ch3\u003eRFC 4180:\u003c/h3\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuoteChar(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(CRLF)\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXCEL"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": "\n     * Excel file format (using a comma as the value delimiter). Note that the actual value delimiter used by Excel is\n     * locale dependent, it might be necessary to customize this format to accommodate to your regional settings.\n     *\n     * \u003cp\u003e\n     * For example for parsing or generating a CSV file on a French system the following format will be used:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * CSVFormat fmt \u003d CSVFormat.newBuilder(EXCEL).withDelimiter(\u0027;\u0027);\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\n     * Settings are:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuoteChar(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(CRLF)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * Note: this is currently the same as RFC4180\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TDF"
      ],
      "begin_line": 214,
      "end_line": 217,
      "comment": " Tab-delimited format, with quote; leading and trailing spaces ignored. "
    },
    {
      "type": "field",
      "varNames": [
        "MYSQL"
      ],
      "begin_line": 227,
      "end_line": 233,
      "comment": "\n     * Default MySQL format used by the \u003ctt\u003eSELECT INTO OUTFILE\u003c/tt\u003e and \u003ctt\u003eLOAD DATA INFILE\u003c/tt\u003e operations. This is\n     * a tab-delimited format with a LF character as the line separator. Values are not quoted and special characters\n     * are escaped with \u0027\\\u0027.\n     *\n     * @see \u003ca href\u003d\"http://dev.mysql.com/doc/refman/5.1/en/load-data.html\"\u003e\n     *      http://dev.mysql.com/doc/refman/5.1/en/load-data.html\u003c/a\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isLineBreak(char)",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\n     * Returns true if the given character is a line break character.\n     *\n     * @param c\n     *            the character to check\n     *\n     * @return true if \u003ccode\u003ec\u003c/code\u003e is a line break character\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isLineBreak(java.lang.Character)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Returns true if the given character is a line break character.\n     *\n     * @param c\n     *            the character to check, may be null\n     *\n     * @return true if \u003ccode\u003ec\u003c/code\u003e is a line break character (and not null)\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.newFormat(char)",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * Creates a new CSV format with the specified delimiter.\n     *\n     * @param delimiter\n     *            the char used for value separation, must not be a line break character\n     * @return a new CSV format.\n     * @throws IllegalArgumentException if the delimiter is a line break character\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 110)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormat(char, java.lang.Character, org.apache.commons.csv.Quote, java.lang.Character, java.lang.Character, boolean, boolean, java.lang.String, java.lang.String, java.lang.String[], boolean, boolean)",
      "begin_line": 298,
      "end_line": 331,
      "comment": "\n     * Creates a customized CSV format.\n     *\n     * @param delimiter\n     *            the char used for value separation, must not be a line break character\n     * @param quoteChar\n     *            the Character used as value encapsulation marker, may be {@code null} to disable\n     * @param quotePolicy\n     *            the quote policy\n     * @param commentStart\n     *            the Character used for comment identification, may be {@code null} to disable\n     * @param escape\n     *            the Character used to escape special characters in values, may be {@code null} to disable\n     * @param ignoreSurroundingSpaces\n     *            \u003ctt\u003etrue\u003c/tt\u003e when whitespaces enclosing values should be ignored\n     * @param ignoreEmptyLines\n     *            \u003ctt\u003etrue\u003c/tt\u003e when the parser should skip empty lines\n     * @param recordSeparator\n     *            the line separator to use for output\n     * @param nullString\n     *            the line separator to use for output\n     * @param header\n     *            the header\n     * @param skipHeaderRecord TODO\n     * @param ignoreEmptyHeaders TODO\n     * @throws IllegalArgumentException if the delimiter is a line break character\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 35)",
        "(line 308,col 9)-(line 308,col 35)",
        "(line 309,col 9)-(line 309,col 39)",
        "(line 310,col 9)-(line 310,col 41)",
        "(line 311,col 9)-(line 311,col 29)",
        "(line 312,col 9)-(line 312,col 63)",
        "(line 313,col 9)-(line 313,col 53)",
        "(line 314,col 9)-(line 314,col 49)",
        "(line 315,col 9)-(line 315,col 47)",
        "(line 316,col 9)-(line 316,col 37)",
        "(line 317,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 49)",
        "(line 330,col 9)-(line 330,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.equals(java.lang.Object)",
      "begin_line": 333,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 343,col 9)",
        "(line 345,col 9)-(line 345,col 48)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 399,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.format(java.lang.Object...)",
      "begin_line": 409,
      "end_line": 418,
      "comment": "\n     * Formats the specified values.\n     *\n     * @param values\n     *            the values to format\n     * @return the formatted values\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 52)",
        "(line 411,col 9)-(line 417,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getCommentStart()",
      "begin_line": 425,
      "end_line": 427,
      "comment": "\n     * Returns the character marking the start of a line comment.\n     *\n     * @return the comment start marker, may be {@code null}\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getDelimiter()",
      "begin_line": 434,
      "end_line": 436,
      "comment": "\n     * Returns the character delimiting the values (typically \u0027;\u0027, \u0027,\u0027 or \u0027\\t\u0027).\n     *\n     * @return the delimiter character\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getEscape()",
      "begin_line": 443,
      "end_line": 445,
      "comment": "\n     * Returns the escape character.\n     *\n     * @return the escape character, may be {@code null}\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getHeader()",
      "begin_line": 452,
      "end_line": 454,
      "comment": "\n     * Returns a copy of the header array.\n     *\n     * @return a copy of the header array; {@code null} if disabled, the empty array if to be read from the file\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreEmptyHeaders()",
      "begin_line": 462,
      "end_line": 464,
      "comment": "\n     * Specifies whether empty headers are ignored when parsing the header line.\n     *\n     * @return \u003ctt\u003etrue\u003c/tt\u003e if headers are ignored when parsing the header line, \u003ctt\u003efalse\u003c/tt\u003e to throw an\n     *         {@link IllegalArgumentException}..\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreEmptyLines()",
      "begin_line": 472,
      "end_line": 474,
      "comment": "\n     * Specifies whether empty lines between records are ignored when parsing input.\n     *\n     * @return \u003ctt\u003etrue\u003c/tt\u003e if empty lines between records are ignored, \u003ctt\u003efalse\u003c/tt\u003e if they are turned into empty\n     *         records.\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreSurroundingSpaces()",
      "begin_line": 482,
      "end_line": 484,
      "comment": "\n     * Specifies whether spaces around values are ignored when parsing input.\n     *\n     * @return \u003ctt\u003etrue\u003c/tt\u003e if spaces around values are ignored, \u003ctt\u003efalse\u003c/tt\u003e if they are treated as part of the\n     *         value.\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getNullString()",
      "begin_line": 499,
      "end_line": 501,
      "comment": "\n     * Gets the String to convert to and from {@code null}.\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003cstrong\u003eReading:\u003c/strong\u003e Converts strings equal to the given {@code nullString} to {@code null} when reading\n     * records.\n     * \u003c/li\u003e\n     * \u003cli\u003e\n     * \u003cstrong\u003eWriting:\u003c/strong\u003e Writes {@code null} as the given {@code nullString} when writing records.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @return the String to convert to and from {@code null}. No substitution occurs if {@code null}\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getQuoteChar()",
      "begin_line": 508,
      "end_line": 510,
      "comment": "\n     * Returns the character used to encapsulate values containing special characters.\n     *\n     * @return the quoteChar character, may be {@code null}\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getQuotePolicy()",
      "begin_line": 517,
      "end_line": 519,
      "comment": "\n     * Returns the quote policy output fields.\n     *\n     * @return the quote policy\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getRecordSeparator()",
      "begin_line": 526,
      "end_line": 528,
      "comment": "\n     * Returns the line separator delimiting output records.\n     *\n     * @return the line separator\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getSkipHeaderRecord()",
      "begin_line": 535,
      "end_line": 537,
      "comment": "\n     * Returns whether to skip the header record.\n     *\n     * @return whether to skip the header record.\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.hashCode()",
      "begin_line": 539,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 29)",
        "(line 543,col 9)-(line 543,col 23)",
        "(line 545,col 9)-(line 545,col 44)",
        "(line 546,col 9)-(line 546,col 87)",
        "(line 547,col 9)-(line 547,col 83)",
        "(line 548,col 9)-(line 548,col 89)",
        "(line 549,col 9)-(line 549,col 77)",
        "(line 550,col 9)-(line 550,col 85)",
        "(line 551,col 9)-(line 551,col 74)",
        "(line 552,col 9)-(line 552,col 67)",
        "(line 553,col 9)-(line 553,col 67)",
        "(line 554,col 9)-(line 554,col 95)",
        "(line 555,col 9)-(line 555,col 58)",
        "(line 556,col 9)-(line 556,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isCommentingEnabled()",
      "begin_line": 566,
      "end_line": 568,
      "comment": "\n     * Specifies whether comments are supported by this format.\n     *\n     * Note that the comment introducer character is only recognized at the start of a line.\n     *\n     * @return \u003ctt\u003etrue\u003c/tt\u003e is comments are supported, \u003ctt\u003efalse\u003c/tt\u003e otherwise\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isEscaping()",
      "begin_line": 575,
      "end_line": 577,
      "comment": "\n     * Returns whether escape are being processed.\n     *\n     * @return {@code true} if escapes are processed\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isNullHandling()",
      "begin_line": 584,
      "end_line": 586,
      "comment": "\n     * Returns whether a nullString has been defined.\n     *\n     * @return {@code true} if a nullString is defined\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isQuoting()",
      "begin_line": 593,
      "end_line": 595,
      "comment": "\n     * Returns whether a quoteChar has been defined.\n     *\n     * @return {@code true} if a quoteChar is defined\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.parse(java.io.Reader)",
      "begin_line": 610,
      "end_line": 612,
      "comment": "\n     * Parses the specified content.\n     *\n     * \u003cp\u003e\n     * See also the various static parse methods on {@link CSVParser}.\n     * \u003c/p\u003e\n     *\n     * @param in\n     *            the input stream\n     * @return a parser over a stream of {@link CSVRecord}s.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.print(java.lang.Appendable)",
      "begin_line": 627,
      "end_line": 629,
      "comment": "\n     * Prints to the specified output.\n     *\n     * \u003cp\u003e\n     * See also {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param out\n     *        the output\n     * @return a printer to an output\n     * @throws IOException\n     *         thrown if the optional header cannot be printed.\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.toString()",
      "begin_line": 631,
      "end_line": 667,
      "comment": "",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 53)",
        "(line 634,col 9)-(line 634,col 63)",
        "(line 635,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 642,col 9)",
        "(line 643,col 9)-(line 646,col 9)",
        "(line 647,col 9)-(line 650,col 9)",
        "(line 651,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 660,col 9)",
        "(line 661,col 9)-(line 661,col 65)",
        "(line 662,col 9)-(line 665,col 9)",
        "(line 666,col 9)-(line 666,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.validate()",
      "begin_line": 674,
      "end_line": 710,
      "comment": "\n     * Verifies the consistency of the parameters and throws an IllegalArgumentException if necessary.\n     *\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 678,col 9)",
        "(line 680,col 9)-(line 683,col 9)",
        "(line 685,col 9)-(line 688,col 9)",
        "(line 690,col 9)-(line 693,col 9)",
        "(line 695,col 9)-(line 698,col 9)",
        "(line 700,col 9)-(line 702,col 9)",
        "(line 704,col 9)-(line 709,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withCommentStart(char)",
      "begin_line": 723,
      "end_line": 725,
      "comment": "\n     * Sets the comment start marker of the format to the specified character.\n     *\n     * Note that the comment start character is only recognized at the start of a line.\n     *\n     * @param commentStart\n     *            the comment start marker\n     * @return A new CSVFormat that is equal to this one but with the specified character as the comment start marker\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withCommentStart(java.lang.Character)",
      "begin_line": 738,
      "end_line": 745,
      "comment": "\n     * Sets the comment start marker of the format to the specified character.\n     *\n     * Note that the comment start character is only recognized at the start of a line.\n     *\n     * @param commentStart\n     *            the comment start marker, use {@code null} to disable\n     * @return A new CSVFormat that is equal to this one but with the specified character as the comment start marker\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 739,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 744,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withDelimiter(char)",
      "begin_line": 756,
      "end_line": 763,
      "comment": "\n     * Sets the delimiter of the format to the specified character.\n     *\n     * @param delimiter\n     *            the delimiter character\n     * @return A new CSVFormat that is equal to this with the specified character as delimiter\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 759,col 9)",
        "(line 760,col 9)-(line 762,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withEscape(char)",
      "begin_line": 774,
      "end_line": 776,
      "comment": "\n     * Sets the escape character of the format to the specified character.\n     *\n     * @param escape\n     *            the escape character\n     * @return A new CSVFormat that is equal to his but with the specified character as the escape character\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withEscape(java.lang.Character)",
      "begin_line": 787,
      "end_line": 794,
      "comment": "\n     * Sets the escape character of the format to the specified character.\n     *\n     * @param escape\n     *            the escape character, use {@code null} to disable\n     * @return A new CSVFormat that is equal to this but with the specified character as the escape character\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 788,col 9)-(line 790,col 9)",
        "(line 791,col 9)-(line 793,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeader(java.lang.String...)",
      "begin_line": 813,
      "end_line": 817,
      "comment": "\n     * Sets the header of the format. The header can either be parsed automatically from the input file with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader();\u003c/pre\u003e\n     *\n     * or specified manually with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader(\u0026quot;name\u0026quot;, \u0026quot;email\u0026quot;, \u0026quot;phone\u0026quot;);\u003c/pre\u003e\n     *\n     * @param header\n     *            the header, \u003ctt\u003enull\u003c/tt\u003e if disabled, empty if parsed automatically, user specified otherwise.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @see #withSkipHeaderRecord(boolean)\n     ",
      "child_ranges": [
        "(line 814,col 9)-(line 816,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreEmptyHeaders(boolean)",
      "begin_line": 827,
      "end_line": 831,
      "comment": "\n     * Sets the empty header behavior of the format.\n     *\n     * @param ignoreEmptyHeaders\n     *            the empty header behavior, \u003ctt\u003etrue\u003c/tt\u003e to ignore empty headers in the header line,\n     *            \u003ctt\u003efalse\u003c/tt\u003e to cause an {@link IllegalArgumentException} to be thrown.\n     * @return A new CSVFormat that is equal to this but with the specified empty header behavior.\n     ",
      "child_ranges": [
        "(line 828,col 9)-(line 830,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreEmptyLines(boolean)",
      "begin_line": 841,
      "end_line": 845,
      "comment": "\n     * Sets the empty line skipping behavior of the format.\n     *\n     * @param ignoreEmptyLines\n     *            the empty line skipping behavior, \u003ctt\u003etrue\u003c/tt\u003e to ignore the empty lines between the records,\n     *            \u003ctt\u003efalse\u003c/tt\u003e to translate empty lines to empty records.\n     * @return A new CSVFormat that is equal to this but with the specified empty line skipping behavior.\n     ",
      "child_ranges": [
        "(line 842,col 9)-(line 844,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreSurroundingSpaces(boolean)",
      "begin_line": 855,
      "end_line": 859,
      "comment": "\n     * Sets the trimming behavior of the format.\n     *\n     * @param ignoreSurroundingSpaces\n     *            the trimming behavior, \u003ctt\u003etrue\u003c/tt\u003e to remove the surrounding spaces, \u003ctt\u003efalse\u003c/tt\u003e to leave the\n     *            spaces as is.\n     * @return A new CSVFormat that is equal to this but with the specified trimming behavior.\n     ",
      "child_ranges": [
        "(line 856,col 9)-(line 858,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withNullString(java.lang.String)",
      "begin_line": 876,
      "end_line": 880,
      "comment": "\n     * Performs conversions to and from null for strings on input and output.\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003cstrong\u003eReading:\u003c/strong\u003e Converts strings equal to the given {@code nullString} to {@code null} when reading\n     * records.\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003cstrong\u003eWriting:\u003c/strong\u003e Writes {@code null} as the given {@code nullString} when writing records.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param nullString\n     *            the String to convert to and from {@code null}. No substitution occurs if {@code null}\n     *\n     * @return A new CSVFormat that is equal to this but with the specified null conversion string.\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 879,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withQuoteChar(char)",
      "begin_line": 891,
      "end_line": 893,
      "comment": "\n     * Sets the quoteChar of the format to the specified character.\n     *\n     * @param quoteChar\n     *            the quoteChar character\n     * @return A new CSVFormat that is equal to this but with the specified character as quoteChar\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 892,col 9)-(line 892,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withQuoteChar(java.lang.Character)",
      "begin_line": 904,
      "end_line": 911,
      "comment": "\n     * Sets the quoteChar of the format to the specified character.\n     *\n     * @param quoteChar\n     *            the quoteChar character, use {@code null} to disable\n     * @return A new CSVFormat that is equal to this but with the specified character as quoteChar\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 905,col 9)-(line 907,col 9)",
        "(line 908,col 9)-(line 910,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withQuotePolicy(org.apache.commons.csv.Quote)",
      "begin_line": 921,
      "end_line": 925,
      "comment": "\n     * Sets the output quote policy of the format to the specified value.\n     *\n     * @param quotePolicy\n     *            the quote policy to use for output.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified quote policy\n     ",
      "child_ranges": [
        "(line 922,col 9)-(line 924,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withRecordSeparator(char)",
      "begin_line": 939,
      "end_line": 941,
      "comment": "\n     * Sets the record separator of the format to the specified character.\n     *\n     * \u003cp\u003e\u003cstrong\u003eNote:\u003c/strong\u003e Currently only CR and LF are supported.\u003c/p\u003e\n     *\n     * @param recordSeparator\n     *            the record separator to use for output.\n     *\n     * @return A new CSVFormat that is equal to this but with the the specified output record separator\n     * @throws IllegalArgumentException\n     *              if recordSeparator is neither CR nor LF\n     ",
      "child_ranges": [
        "(line 940,col 9)-(line 940,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withRecordSeparator(java.lang.String)",
      "begin_line": 955,
      "end_line": 959,
      "comment": "\n     * Sets the record separator of the format to the specified String.\n     *\n     * \u003cp\u003e\u003cstrong\u003eNote:\u003c/strong\u003e Currently only CR, LF and CRLF are supported.\u003c/p\u003e\n     *\n     * @param recordSeparator\n     *            the record separator to use for output.\n     *\n     * @return A new CSVFormat that is equal to this but with the the specified output record separator\n     * @throws IllegalArgumentException\n     *              if recordSeparator is none of CR, LF or CRLF\n     ",
      "child_ranges": [
        "(line 956,col 9)-(line 958,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withSkipHeaderRecord(boolean)",
      "begin_line": 970,
      "end_line": 974,
      "comment": "\n     * Sets whether to skip the header record.\n     *\n     * @param skipHeaderRecord\n     *            whether to skip the header record.\n     *\n     * @return A new CSVFormat that is equal to this but with the the specified skipHeaderRecord setting.\n     * @see #withHeader(String...)\n     ",
      "child_ranges": [
        "(line 971,col 9)-(line 973,col 36)"
      ]
    }
  ]
}