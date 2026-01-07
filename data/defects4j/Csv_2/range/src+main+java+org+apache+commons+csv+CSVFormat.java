{
  "filepath": "/tmp/Csv-2b/src/main/java/org/apache/commons/csv/CSVFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVFormat",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 845,
      "comment": "\n * Specifies the format of a CSV file and parses input.\n * \u003cp\u003e\n * This class is immutable.\n * \u003c/p\u003e\n * You can extend a format through a builder. For example, to extend the Excel format with columns header, you write:\n * \u003c/p\u003e\n * \u003cpre\u003eCSVFormat.EXCEL.toBuilder().withHeader(\u0026quot;Col1\u0026quot;, \u0026quot;Col2\u0026quot;, \u0026quot;Col3\u0026quot;).build();\u003c/pre\u003e\n * \u003cp\u003e\n * You can parse through a format. For example, to parse an Excel file with columns header, you write:\n * \u003c/p\u003e\n * \u003cpre\u003eReader in \u003d ...;\n *CSVFormat.EXCEL.toBuilder().withHeader(\u0026quot;Col1\u0026quot;, \u0026quot;Col2\u0026quot;, \u0026quot;Col3\u0026quot;).parse(in);\u003c/pre\u003e\n * \u003cp\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delimiter"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "quoteChar"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "quotePolicy"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "commentStart"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "escape"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreSurroundingSpaces"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Should leading/trailing spaces be ignored around values?"
    },
    {
      "type": "field",
      "varNames": [
        "ignoreEmptyLines"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordSeparator"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " for outputs"
    },
    {
      "type": "field",
      "varNames": [
        "header"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RFC4180"
      ],
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Comma separated format as defined by \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     * \u003ch3\u003eRFC 4180:\u003c/h3\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuoteChar(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithLineSeparator(CRLF)\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT"
      ],
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Standard comma separated format, as for {@link #RFC4180} but allowing empty lines.\n     * \u003ch3\u003eRFC 4180:\u003c/h3\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuoteChar(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithLineSeparator(CRLF)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003ch3\u003eAdditional:\u003c/h3\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithIgnoreEmptyLines(true)\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXCEL"
      ],
      "begin_line": 113,
      "end_line": 116,
      "comment": "\n     * Excel file format (using a comma as the value delimiter). Note that the actual value delimiter used by Excel is\n     * locale dependent, it might be necessary to customize this format to accommodate to your regional settings.\n     * \u003cp/\u003e\n     * For example for parsing or generating a CSV file on a French system the following format will be used:\n     *\n     * \u003cpre\u003e\n     * CSVFormat fmt \u003d CSVFormat.newBuilder(EXCEL).withDelimiter(\u0027;\u0027).build();\n     * \u003c/pre\u003e\n     * Settings are:\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuoteChar(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithLineSeparator(CRLF)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * Note: this is currently the same as RFC4180\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TDF"
      ],
      "begin_line": 119,
      "end_line": 123,
      "comment": " Tab-delimited format, with quote; leading and trailing spaces ignored. "
    },
    {
      "type": "field",
      "varNames": [
        "MYSQL"
      ],
      "begin_line": 133,
      "end_line": 140,
      "comment": "\n     * Default MySQL format used by the \u003ctt\u003eSELECT INTO OUTFILE\u003c/tt\u003e and \u003ctt\u003eLOAD DATA INFILE\u003c/tt\u003e operations. This is\n     * a tab-delimited format with a LF character as the line separator. Values are not quoted and special characters\n     * are escaped with \u0027\\\u0027.\n     *\n     * @see \u003ca href\u003d\"http://dev.mysql.com/doc/refman/5.1/en/load-data.html\"\u003e\n     *      http://dev.mysql.com/doc/refman/5.1/en/load-data.html\u003c/a\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.newBuilder(char)",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Creates a new CSV format builder.\n     *\n     * @param delimiter\n     *            the char used for value separation, must not be a line break character\n     * @return a new CSV format builder.\n     * @throws IllegalArgumentException if the delimiter is a line break character\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.newBuilder(org.apache.commons.csv.CSVFormat)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Creates a CSVFormatBuilder, using the values of the given CSVFormat.\n     *\n     * @param format\n     *            The format to use values from\n     * @return a new CSVFormatBuilder\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.newBuilder()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Creates a standard comma separated format builder, as for {@link #RFC4180} but allowing empty lines.\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuoteChar(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithEmptyLinesIgnored(true)\u003c/li\u003e\n     * \u003cli\u003ewithLineSeparator(CRLF)\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * Shortcut for {@code CSVFormat.newBuilder(CSVFormat.DEFAULT)}\n     *\n     * @return a standard comma separated format builder, as for {@link #RFC4180} but allowing empty lines.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 105)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormat(char, java.lang.Character, org.apache.commons.csv.Quote, java.lang.Character, java.lang.Character, boolean, boolean, java.lang.String, java.lang.String[])",
      "begin_line": 206,
      "end_line": 223,
      "comment": " package protected to give access without needing a synthetic accessor",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 35)",
        "(line 215,col 9)-(line 215,col 35)",
        "(line 216,col 9)-(line 216,col 39)",
        "(line 217,col 9)-(line 217,col 41)",
        "(line 218,col 9)-(line 218,col 29)",
        "(line 219,col 9)-(line 219,col 63)",
        "(line 220,col 9)-(line 220,col 49)",
        "(line 221,col 9)-(line 221,col 45)",
        "(line 222,col 9)-(line 222,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isLineBreak(java.lang.Character)",
      "begin_line": 234,
      "end_line": 236,
      "comment": " package protected to give access without needing a synthetic accessor",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isLineBreak(char)",
      "begin_line": 247,
      "end_line": 249,
      "comment": " package protected to give access without needing a synthetic accessor",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getDelimiter()",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * Returns the character delimiting the values (typically \u0027;\u0027, \u0027,\u0027 or \u0027\\t\u0027).\n     *\n     * @return the delimiter character\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getQuoteChar()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * Returns the character used to encapsulate values containing special characters.\n     *\n     * @return the quoteChar character\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isQuoting()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\n     * Returns whether an quoteChar has been defined.\n     *\n     * @return {@code true} if an quoteChar is defined\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getCommentStart()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * Returns the character marking the start of a line comment.\n     *\n     * @return the comment start marker.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isCommentingEnabled()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\n     * Specifies whether comments are supported by this format.\n     *\n     * Note that the comment introducer character is only recognised at the start of a line.\n     *\n     * @return \u003ctt\u003etrue\u003c/tt\u003e is comments are supported, \u003ctt\u003efalse\u003c/tt\u003e otherwise\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getEscape()",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\n     * Returns the escape character.\n     *\n     * @return the escape character\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isEscaping()",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * Returns whether escape are being processed.\n     *\n     * @return {@code true} if escapes are processed\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreSurroundingSpaces()",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * Specifies whether spaces around values are ignored when parsing input.\n     *\n     * @return \u003ctt\u003etrue\u003c/tt\u003e if spaces around values are ignored, \u003ctt\u003efalse\u003c/tt\u003e if they are treated as part of the\n     *         value.\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreEmptyLines()",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * Specifies whether empty lines between records are ignored when parsing input.\n     *\n     * @return \u003ctt\u003etrue\u003c/tt\u003e if empty lines between records are ignored, \u003ctt\u003efalse\u003c/tt\u003e if they are turned into empty\n     *         records.\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getRecordSeparator()",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * Returns the line separator delimiting output records.\n     *\n     * @return the line separator\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getHeader()",
      "begin_line": 345,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.parse(java.io.Reader)",
      "begin_line": 358,
      "end_line": 360,
      "comment": "\n     * Parses the specified content.\n     *\n     * @param in\n     *            the input stream\n     * @return a stream of CSVRecord\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.format(java.lang.Object...)",
      "begin_line": 369,
      "end_line": 378,
      "comment": "\n     * Formats the specified values.\n     *\n     * @param values\n     *            the values to format\n     * @return the formatted values\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 52)",
        "(line 371,col 9)-(line 377,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.toString()",
      "begin_line": 380,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 53)",
        "(line 383,col 9)-(line 383,col 63)",
        "(line 384,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 402,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getQuotePolicy()",
      "begin_line": 410,
      "end_line": 412,
      "comment": "\n     * Returns the quote policy output fields.\n     *\n     * @return the quote policy\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.hashCode()",
      "begin_line": 414,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 29)",
        "(line 418,col 9)-(line 418,col 23)",
        "(line 420,col 9)-(line 420,col 44)",
        "(line 421,col 9)-(line 421,col 87)",
        "(line 422,col 9)-(line 422,col 83)",
        "(line 423,col 9)-(line 423,col 89)",
        "(line 424,col 9)-(line 424,col 77)",
        "(line 425,col 9)-(line 425,col 74)",
        "(line 426,col 9)-(line 426,col 67)",
        "(line 427,col 9)-(line 427,col 95)",
        "(line 428,col 9)-(line 428,col 58)",
        "(line 429,col 9)-(line 429,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.equals(java.lang.Object)",
      "begin_line": 432,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 442,col 9)",
        "(line 444,col 9)-(line 444,col 48)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.toBuilder()",
      "begin_line": 496,
      "end_line": 498,
      "comment": "\n     * Creates a builder based on this format.\n     *\n     * @return a new builder\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CSVFormatBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 503,
      "end_line": 844,
      "comment": "\n     * Builds CSVFormat objects.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delimiter"
      ],
      "begin_line": 505,
      "end_line": 505,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "quoteChar"
      ],
      "begin_line": 506,
      "end_line": 506,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "quotePolicy"
      ],
      "begin_line": 507,
      "end_line": 507,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "commentStart"
      ],
      "begin_line": 508,
      "end_line": 508,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "escape"
      ],
      "begin_line": 509,
      "end_line": 509,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreSurroundingSpaces"
      ],
      "begin_line": 510,
      "end_line": 510,
      "comment": " Should leading/trailing spaces be ignored around values?"
    },
    {
      "type": "field",
      "varNames": [
        "ignoreEmptyLines"
      ],
      "begin_line": 511,
      "end_line": 511,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordSeparator"
      ],
      "begin_line": 512,
      "end_line": 512,
      "comment": " for outputs"
    },
    {
      "type": "field",
      "varNames": [
        "header"
      ],
      "begin_line": 513,
      "end_line": 513,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.CSVFormatBuilder(char, java.lang.Character, org.apache.commons.csv.Quote, java.lang.Character, java.lang.Character, boolean, boolean, java.lang.String, java.lang.String[])",
      "begin_line": 539,
      "end_line": 556,
      "comment": " package protected for use by test code",
      "child_ranges": [
        "(line 544,col 13)-(line 546,col 13)",
        "(line 547,col 13)-(line 547,col 39)",
        "(line 548,col 13)-(line 548,col 39)",
        "(line 549,col 13)-(line 549,col 43)",
        "(line 550,col 13)-(line 550,col 45)",
        "(line 551,col 13)-(line 551,col 33)",
        "(line 552,col 13)-(line 552,col 67)",
        "(line 553,col 13)-(line 553,col 53)",
        "(line 554,col 13)-(line 554,col 49)",
        "(line 555,col 13)-(line 555,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.CSVFormatBuilder(org.apache.commons.csv.CSVFormat)",
      "begin_line": 564,
      "end_line": 571,
      "comment": "\n         * Creates a CSVFormatBuilder, using the values of the given CSVFormat.\n         *\n         * @param format\n         *            The format to use values from\n         ",
      "child_ranges": [
        "(line 567,col 13)-(line 570,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.CSVFormatBuilder(char)",
      "begin_line": 581,
      "end_line": 583,
      "comment": " package protected to give access without needing a synthetic accessor",
      "child_ranges": [
        "(line 582,col 13)-(line 582,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.build()",
      "begin_line": 590,
      "end_line": 594,
      "comment": "\n         * Builds a new CSVFormat configured with the values from this builder.\n         *\n         * @return a new CSVFormat\n         ",
      "child_ranges": [
        "(line 591,col 13)-(line 591,col 23)",
        "(line 592,col 13)-(line 593,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.parse(java.io.Reader)",
      "begin_line": 606,
      "end_line": 608,
      "comment": "\n         * Parses the specified content. Short-hand for:\n         * \u003cpre\u003eformat.build().parse(in);\u003c/pre\u003e\n         *\n         * @param in\n         *            the input stream\n         * @return a CSVRecord stream\n         * @throws IOException\n         *             If an I/O error occurs\n         ",
      "child_ranges": [
        "(line 607,col 13)-(line 607,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.validate()",
      "begin_line": 615,
      "end_line": 644,
      "comment": "\n         * Verifies the consistency of the parameters and throws an IllegalStateException if necessary.\n         *\n         * @throws IllegalStateException\n         ",
      "child_ranges": [
        "(line 616,col 13)-(line 619,col 13)",
        "(line 621,col 13)-(line 624,col 13)",
        "(line 626,col 13)-(line 629,col 13)",
        "(line 631,col 13)-(line 634,col 13)",
        "(line 636,col 13)-(line 639,col 13)",
        "(line 641,col 13)-(line 643,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withDelimiter(char)",
      "begin_line": 655,
      "end_line": 661,
      "comment": "\n         * Sets the delimiter of the format to the specified character.\n         *\n         * @param delimiter\n         *            the delimiter character\n         * @return This builder with the specified character as delimiter\n         * @throws IllegalArgumentException\n         *             thrown if the specified character is a line break\n         ",
      "child_ranges": [
        "(line 656,col 13)-(line 658,col 13)",
        "(line 659,col 13)-(line 659,col 39)",
        "(line 660,col 13)-(line 660,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withQuoteChar(char)",
      "begin_line": 672,
      "end_line": 674,
      "comment": "\n         * Sets the quoteChar of the format to the specified character.\n         *\n         * @param quoteChar\n         *            the quoteChar character\n         * @return This builder with the specified character as quoteChar\n         * @throws IllegalArgumentException\n         *             thrown if the specified character is a line break\n         ",
      "child_ranges": [
        "(line 673,col 13)-(line 673,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withQuoteChar(java.lang.Character)",
      "begin_line": 685,
      "end_line": 691,
      "comment": "\n         * Sets the quoteChar of the format to the specified character.\n         *\n         * @param quoteChar\n         *            the quoteChar character\n         * @return This builder with the specified character as quoteChar\n         * @throws IllegalArgumentException\n         *             thrown if the specified character is a line break\n         ",
      "child_ranges": [
        "(line 686,col 13)-(line 688,col 13)",
        "(line 689,col 13)-(line 689,col 39)",
        "(line 690,col 13)-(line 690,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withCommentStart(char)",
      "begin_line": 704,
      "end_line": 706,
      "comment": "\n         * Sets the comment start marker of the format to the specified character.\n         *\n         * Note that the comment introducer character is only recognised at the start of a line.\n         *\n         * @param commentStart\n         *            the comment start marker\n         * @return This builder with the specified character as the comment start marker\n         * @throws IllegalArgumentException\n         *             thrown if the specified character is a line break\n         ",
      "child_ranges": [
        "(line 705,col 13)-(line 705,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withCommentStart(java.lang.Character)",
      "begin_line": 719,
      "end_line": 725,
      "comment": "\n         * Sets the comment start marker of the format to the specified character.\n         *\n         * Note that the comment introducer character is only recognised at the start of a line.\n         *\n         * @param commentStart\n         *            the comment start marker\n         * @return This builder with the specified character as the comment start marker\n         * @throws IllegalArgumentException\n         *             thrown if the specified character is a line break\n         ",
      "child_ranges": [
        "(line 720,col 13)-(line 722,col 13)",
        "(line 723,col 13)-(line 723,col 45)",
        "(line 724,col 13)-(line 724,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withEscape(char)",
      "begin_line": 736,
      "end_line": 738,
      "comment": "\n         * Sets the escape character of the format to the specified character.\n         *\n         * @param escape\n         *            the escape character\n         * @return This builder with the specified character as the escape character\n         * @throws IllegalArgumentException\n         *             thrown if the specified character is a line break\n         ",
      "child_ranges": [
        "(line 737,col 13)-(line 737,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withEscape(java.lang.Character)",
      "begin_line": 749,
      "end_line": 755,
      "comment": "\n         * Sets the escape character of the format to the specified character.\n         *\n         * @param escape\n         *            the escape character\n         * @return This builder with the specified character as the escape character\n         * @throws IllegalArgumentException\n         *             thrown if the specified character is a line break\n         ",
      "child_ranges": [
        "(line 750,col 13)-(line 752,col 13)",
        "(line 753,col 13)-(line 753,col 33)",
        "(line 754,col 13)-(line 754,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withHeader(java.lang.String...)",
      "begin_line": 776,
      "end_line": 779,
      "comment": "\n         * Sets the header of the format. The header can either be parsed automatically from the\n         * input file with:\n         *\n         * \u003cpre\u003e\n         * CSVFormat format \u003d aformat.withHeader();\n         * \u003c/pre\u003e\n         *\n         * or specified manually with:\n         *\n         * \u003cpre\u003e\n         * CSVFormat format \u003d aformat.withHeader(\u0026quot;name\u0026quot;, \u0026quot;email\u0026quot;, \u0026quot;phone\u0026quot;);\n         * \u003c/pre\u003e\n         *\n         * @param header\n         *            the header, \u003ctt\u003enull\u003c/tt\u003e if disabled, empty if parsed automatically, user specified otherwise.\n         *\n         * @return This builder with the specified header\n         ",
      "child_ranges": [
        "(line 777,col 13)-(line 777,col 33)",
        "(line 778,col 13)-(line 778,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withIgnoreSurroundingSpaces(boolean)",
      "begin_line": 789,
      "end_line": 792,
      "comment": "\n         * Sets the trimming behavior of the format.\n         *\n         * @param ignoreSurroundingSpaces\n         *            the trimming behavior, \u003ctt\u003etrue\u003c/tt\u003e to remove the surrounding spaces, \u003ctt\u003efalse\u003c/tt\u003e to leave the\n         *            spaces as is.\n         * @return This builder with the specified trimming behavior.\n         ",
      "child_ranges": [
        "(line 790,col 13)-(line 790,col 67)",
        "(line 791,col 13)-(line 791,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withIgnoreEmptyLines(boolean)",
      "begin_line": 802,
      "end_line": 805,
      "comment": "\n         * Sets the empty line skipping behavior of the format.\n         *\n         * @param ignoreEmptyLines\n         *            the empty line skipping behavior, \u003ctt\u003etrue\u003c/tt\u003e to ignore the empty lines between the records,\n         *            \u003ctt\u003efalse\u003c/tt\u003e to translate empty lines to empty records.\n         * @return This builder with the specified empty line skipping behavior.\n         ",
      "child_ranges": [
        "(line 803,col 13)-(line 803,col 53)",
        "(line 804,col 13)-(line 804,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withRecordSeparator(char)",
      "begin_line": 815,
      "end_line": 817,
      "comment": "\n         * Sets the record separator of the format to the specified character.\n         *\n         * @param recordSeparator\n         *            the record separator to use for output.\n         *\n         * @return This builder with the the specified output record separator\n         ",
      "child_ranges": [
        "(line 816,col 13)-(line 816,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withRecordSeparator(java.lang.String)",
      "begin_line": 827,
      "end_line": 830,
      "comment": "\n         * Sets the record separator of the format to the specified String.\n         *\n         * @param recordSeparator\n         *            the record separator to use for output.\n         *\n         * @return This builder with the the specified output record separator\n         ",
      "child_ranges": [
        "(line 828,col 13)-(line 828,col 51)",
        "(line 829,col 13)-(line 829,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withQuotePolicy(org.apache.commons.csv.Quote)",
      "begin_line": 840,
      "end_line": 843,
      "comment": "\n         * Sets the output quote policy of the format to the specified value.\n         *\n         * @param quotePolicy\n         *            the quote policy to use for output.\n         *\n         * @return This builder with the specified quote policy\n         ",
      "child_ranges": [
        "(line 841,col 13)-(line 841,col 43)",
        "(line 842,col 13)-(line 842,col 24)"
      ]
    }
  ]
}