{
  "filepath": "/tmp/Csv-3b/src/main/java/org/apache/commons/csv/CSVFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVFormat",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 875,
      "comment": "\n * Specifies the format of a CSV file and parses input.\n * \u003cp\u003e\n * This class is immutable.\n * \u003c/p\u003e\n * You can extend a format through a builder. For example, to extend the Excel format with columns header, you write:\n * \u003c/p\u003e\n * \u003cpre\u003eCSVFormat.EXCEL.toBuilder().withHeader(\u0026quot;Col1\u0026quot;, \u0026quot;Col2\u0026quot;, \u0026quot;Col3\u0026quot;).build();\u003c/pre\u003e\n * \u003cp\u003e\n * You can parse through a format. For example, to parse an Excel file with columns header, you write:\n * \u003c/p\u003e\n * \u003cpre\u003eReader in \u003d ...;\n *CSVFormat.EXCEL.toBuilder().withHeader(\u0026quot;Col1\u0026quot;, \u0026quot;Col2\u0026quot;, \u0026quot;Col3\u0026quot;).parse(in);\u003c/pre\u003e\n * \u003cp\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "CSVFormatBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 56,
      "end_line": 413,
      "comment": "\n     * Builds CSVFormat objects.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delimiter"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "quoteChar"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "quotePolicy"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "commentStart"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "escape"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreSurroundingSpaces"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Should leading/trailing spaces be ignored around values?"
    },
    {
      "type": "field",
      "varNames": [
        "ignoreEmptyLines"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordSeparator"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " for outputs"
    },
    {
      "type": "field",
      "varNames": [
        "nullToString"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " for outputs"
    },
    {
      "type": "field",
      "varNames": [
        "header"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.CSVFormatBuilder(char)",
      "begin_line": 77,
      "end_line": 79,
      "comment": " package protected to give access without needing a synthetic accessor",
      "child_ranges": [
        "(line 78,col 13)-(line 78,col 95)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.CSVFormatBuilder(char, java.lang.Character, org.apache.commons.csv.Quote, java.lang.Character, java.lang.Character, boolean, boolean, java.lang.String, java.lang.String, java.lang.String[])",
      "begin_line": 106,
      "end_line": 124,
      "comment": " package protected for use by test code",
      "child_ranges": [
        "(line 111,col 13)-(line 113,col 13)",
        "(line 114,col 13)-(line 114,col 39)",
        "(line 115,col 13)-(line 115,col 39)",
        "(line 116,col 13)-(line 116,col 43)",
        "(line 117,col 13)-(line 117,col 45)",
        "(line 118,col 13)-(line 118,col 33)",
        "(line 119,col 13)-(line 119,col 67)",
        "(line 120,col 13)-(line 120,col 53)",
        "(line 121,col 13)-(line 121,col 51)",
        "(line 122,col 13)-(line 122,col 45)",
        "(line 123,col 13)-(line 123,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.CSVFormatBuilder(org.apache.commons.csv.CSVFormat)",
      "begin_line": 132,
      "end_line": 139,
      "comment": "\n         * Creates a CSVFormatBuilder, using the values of the given CSVFormat.\n         *\n         * @param format\n         *            The format to use values from\n         ",
      "child_ranges": [
        "(line 135,col 13)-(line 138,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.build()",
      "begin_line": 146,
      "end_line": 150,
      "comment": "\n         * Builds a new CSVFormat configured with the values from this builder.\n         *\n         * @return a new CSVFormat\n         ",
      "child_ranges": [
        "(line 147,col 13)-(line 147,col 23)",
        "(line 148,col 13)-(line 149,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.parse(java.io.Reader)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n         * Parses the specified content. Short-hand for:\n         * \u003cpre\u003eformat.build().parse(in);\u003c/pre\u003e\n         *\n         * @param in\n         *            the input stream\n         * @return a CSVRecord stream\n         * @throws IOException\n         *             If an I/O error occurs\n         ",
      "child_ranges": [
        "(line 163,col 13)-(line 163,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.validate()",
      "begin_line": 171,
      "end_line": 200,
      "comment": "\n         * Verifies the consistency of the parameters and throws an IllegalStateException if necessary.\n         *\n         * @throws IllegalStateException\n         ",
      "child_ranges": [
        "(line 172,col 13)-(line 175,col 13)",
        "(line 177,col 13)-(line 180,col 13)",
        "(line 182,col 13)-(line 185,col 13)",
        "(line 187,col 13)-(line 190,col 13)",
        "(line 192,col 13)-(line 195,col 13)",
        "(line 197,col 13)-(line 199,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withCommentStart(char)",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n         * Sets the comment start marker of the format to the specified character.\n         *\n         * Note that the comment introducer character is only recognised at the start of a line.\n         *\n         * @param commentStart\n         *            the comment start marker\n         * @return This builder with the specified character as the comment start marker\n         * @throws IllegalArgumentException\n         *             thrown if the specified character is a line break\n         ",
      "child_ranges": [
        "(line 214,col 13)-(line 214,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withCommentStart(java.lang.Character)",
      "begin_line": 228,
      "end_line": 234,
      "comment": "\n         * Sets the comment start marker of the format to the specified character.\n         *\n         * Note that the comment introducer character is only recognised at the start of a line.\n         *\n         * @param commentStart\n         *            the comment start marker\n         * @return This builder with the specified character as the comment start marker\n         * @throws IllegalArgumentException\n         *             thrown if the specified character is a line break\n         ",
      "child_ranges": [
        "(line 229,col 13)-(line 231,col 13)",
        "(line 232,col 13)-(line 232,col 45)",
        "(line 233,col 13)-(line 233,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withDelimiter(char)",
      "begin_line": 245,
      "end_line": 251,
      "comment": "\n         * Sets the delimiter of the format to the specified character.\n         *\n         * @param delimiter\n         *            the delimiter character\n         * @return This builder with the specified character as delimiter\n         * @throws IllegalArgumentException\n         *             thrown if the specified character is a line break\n         ",
      "child_ranges": [
        "(line 246,col 13)-(line 248,col 13)",
        "(line 249,col 13)-(line 249,col 39)",
        "(line 250,col 13)-(line 250,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withEscape(char)",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n         * Sets the escape character of the format to the specified character.\n         *\n         * @param escape\n         *            the escape character\n         * @return This builder with the specified character as the escape character\n         * @throws IllegalArgumentException\n         *             thrown if the specified character is a line break\n         ",
      "child_ranges": [
        "(line 263,col 13)-(line 263,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withEscape(java.lang.Character)",
      "begin_line": 275,
      "end_line": 281,
      "comment": "\n         * Sets the escape character of the format to the specified character.\n         *\n         * @param escape\n         *            the escape character\n         * @return This builder with the specified character as the escape character\n         * @throws IllegalArgumentException\n         *             thrown if the specified character is a line break\n         ",
      "child_ranges": [
        "(line 276,col 13)-(line 278,col 13)",
        "(line 279,col 13)-(line 279,col 33)",
        "(line 280,col 13)-(line 280,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withHeader(java.lang.String...)",
      "begin_line": 302,
      "end_line": 305,
      "comment": "\n         * Sets the header of the format. The header can either be parsed automatically from the\n         * input file with:\n         *\n         * \u003cpre\u003e\n         * CSVFormat format \u003d aformat.withHeader();\n         * \u003c/pre\u003e\n         *\n         * or specified manually with:\n         *\n         * \u003cpre\u003e\n         * CSVFormat format \u003d aformat.withHeader(\u0026quot;name\u0026quot;, \u0026quot;email\u0026quot;, \u0026quot;phone\u0026quot;);\n         * \u003c/pre\u003e\n         *\n         * @param header\n         *            the header, \u003ctt\u003enull\u003c/tt\u003e if disabled, empty if parsed automatically, user specified otherwise.\n         *\n         * @return This builder with the specified header\n         ",
      "child_ranges": [
        "(line 303,col 13)-(line 303,col 33)",
        "(line 304,col 13)-(line 304,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withIgnoreEmptyLines(boolean)",
      "begin_line": 315,
      "end_line": 318,
      "comment": "\n         * Sets the empty line skipping behavior of the format.\n         *\n         * @param ignoreEmptyLines\n         *            the empty line skipping behavior, \u003ctt\u003etrue\u003c/tt\u003e to ignore the empty lines between the records,\n         *            \u003ctt\u003efalse\u003c/tt\u003e to translate empty lines to empty records.\n         * @return This builder with the specified empty line skipping behavior.\n         ",
      "child_ranges": [
        "(line 316,col 13)-(line 316,col 53)",
        "(line 317,col 13)-(line 317,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withIgnoreSurroundingSpaces(boolean)",
      "begin_line": 328,
      "end_line": 331,
      "comment": "\n         * Sets the trimming behavior of the format.\n         *\n         * @param ignoreSurroundingSpaces\n         *            the trimming behavior, \u003ctt\u003etrue\u003c/tt\u003e to remove the surrounding spaces, \u003ctt\u003efalse\u003c/tt\u003e to leave the\n         *            spaces as is.\n         * @return This builder with the specified trimming behavior.\n         ",
      "child_ranges": [
        "(line 329,col 13)-(line 329,col 67)",
        "(line 330,col 13)-(line 330,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withNullToString(java.lang.String)",
      "begin_line": 341,
      "end_line": 344,
      "comment": "\n         * Sets the String to use for null values for output.\n         *\n         * @param nullToString\n         *            the String to use for null values for output.\n         *\n         * @return This builder with the the specified output record separator\n         ",
      "child_ranges": [
        "(line 342,col 13)-(line 342,col 45)",
        "(line 343,col 13)-(line 343,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withQuoteChar(char)",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\n         * Sets the quoteChar of the format to the specified character.\n         *\n         * @param quoteChar\n         *            the quoteChar character\n         * @return This builder with the specified character as quoteChar\n         * @throws IllegalArgumentException\n         *             thrown if the specified character is a line break\n         ",
      "child_ranges": [
        "(line 356,col 13)-(line 356,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withQuoteChar(java.lang.Character)",
      "begin_line": 368,
      "end_line": 374,
      "comment": "\n         * Sets the quoteChar of the format to the specified character.\n         *\n         * @param quoteChar\n         *            the quoteChar character\n         * @return This builder with the specified character as quoteChar\n         * @throws IllegalArgumentException\n         *             thrown if the specified character is a line break\n         ",
      "child_ranges": [
        "(line 369,col 13)-(line 371,col 13)",
        "(line 372,col 13)-(line 372,col 39)",
        "(line 373,col 13)-(line 373,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withQuotePolicy(org.apache.commons.csv.Quote)",
      "begin_line": 384,
      "end_line": 387,
      "comment": "\n         * Sets the output quote policy of the format to the specified value.\n         *\n         * @param quotePolicy\n         *            the quote policy to use for output.\n         *\n         * @return This builder with the specified quote policy\n         ",
      "child_ranges": [
        "(line 385,col 13)-(line 385,col 43)",
        "(line 386,col 13)-(line 386,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withRecordSeparator(char)",
      "begin_line": 397,
      "end_line": 399,
      "comment": "\n         * Sets the record separator of the format to the specified character.\n         *\n         * @param recordSeparator\n         *            the record separator to use for output.\n         *\n         * @return This builder with the the specified output record separator\n         ",
      "child_ranges": [
        "(line 398,col 13)-(line 398,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormatBuilder.withRecordSeparator(java.lang.String)",
      "begin_line": 409,
      "end_line": 412,
      "comment": "\n         * Sets the record separator of the format to the specified String.\n         *\n         * @param recordSeparator\n         *            the record separator to use for output.\n         *\n         * @return This builder with the the specified output record separator\n         ",
      "child_ranges": [
        "(line 410,col 13)-(line 410,col 51)",
        "(line 411,col 13)-(line 411,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 415,
      "end_line": 415,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isLineBreak(java.lang.Character)",
      "begin_line": 425,
      "end_line": 427,
      "comment": " package protected to give access without needing a synthetic accessor",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.newBuilder()",
      "begin_line": 441,
      "end_line": 444,
      "comment": "\n     * Creates a standard comma separated format builder, as for {@link #RFC4180} but allowing empty lines.\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuoteChar(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithEmptyLinesIgnored(true)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(CRLF)\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * Shortcut for {@code CSVFormat.newBuilder(CSVFormat.DEFAULT)}\n     *\n     * @return a standard comma separated format builder, as for {@link #RFC4180} but allowing empty lines.\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 443,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "delimiter"
      ],
      "begin_line": 445,
      "end_line": 445,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "quoteChar"
      ],
      "begin_line": 446,
      "end_line": 446,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "quotePolicy"
      ],
      "begin_line": 447,
      "end_line": 447,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "commentStart"
      ],
      "begin_line": 448,
      "end_line": 448,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "escape"
      ],
      "begin_line": 449,
      "end_line": 449,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreSurroundingSpaces"
      ],
      "begin_line": 450,
      "end_line": 450,
      "comment": " Should leading/trailing spaces be ignored around values?"
    },
    {
      "type": "field",
      "varNames": [
        "ignoreEmptyLines"
      ],
      "begin_line": 451,
      "end_line": 451,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordSeparator"
      ],
      "begin_line": 453,
      "end_line": 453,
      "comment": " for outputs"
    },
    {
      "type": "field",
      "varNames": [
        "nullToString"
      ],
      "begin_line": 455,
      "end_line": 455,
      "comment": " for outputs"
    },
    {
      "type": "field",
      "varNames": [
        "header"
      ],
      "begin_line": 457,
      "end_line": 457,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RFC4180"
      ],
      "begin_line": 468,
      "end_line": 471,
      "comment": "\n     * Comma separated format as defined by \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     * \u003ch3\u003eRFC 4180:\u003c/h3\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuoteChar(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(CRLF)\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT"
      ],
      "begin_line": 486,
      "end_line": 488,
      "comment": "\n     * Standard comma separated format, as for {@link #RFC4180} but allowing empty lines.\n     * \u003ch3\u003eRFC 4180:\u003c/h3\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuoteChar(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(CRLF)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003ch3\u003eAdditional:\u003c/h3\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithIgnoreEmptyLines(true)\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXCEL"
      ],
      "begin_line": 507,
      "end_line": 510,
      "comment": "\n     * Excel file format (using a comma as the value delimiter). Note that the actual value delimiter used by Excel is\n     * locale dependent, it might be necessary to customize this format to accommodate to your regional settings.\n     * \u003cp/\u003e\n     * For example for parsing or generating a CSV file on a French system the following format will be used:\n     *\n     * \u003cpre\u003e\n     * CSVFormat fmt \u003d CSVFormat.newBuilder(EXCEL).withDelimiter(\u0027;\u0027).build();\n     * \u003c/pre\u003e\n     * Settings are:\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuoteChar(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(CRLF)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * Note: this is currently the same as RFC4180\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TDF"
      ],
      "begin_line": 513,
      "end_line": 517,
      "comment": " Tab-delimited format, with quote; leading and trailing spaces ignored. "
    },
    {
      "type": "field",
      "varNames": [
        "MYSQL"
      ],
      "begin_line": 527,
      "end_line": 534,
      "comment": "\n     * Default MySQL format used by the \u003ctt\u003eSELECT INTO OUTFILE\u003c/tt\u003e and \u003ctt\u003eLOAD DATA INFILE\u003c/tt\u003e operations. This is\n     * a tab-delimited format with a LF character as the line separator. Values are not quoted and special characters\n     * are escaped with \u0027\\\u0027.\n     *\n     * @see \u003ca href\u003d\"http://dev.mysql.com/doc/refman/5.1/en/load-data.html\"\u003e\n     *      http://dev.mysql.com/doc/refman/5.1/en/load-data.html\u003c/a\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isLineBreak(char)",
      "begin_line": 545,
      "end_line": 547,
      "comment": " package protected to give access without needing a synthetic accessor",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.newBuilder(char)",
      "begin_line": 557,
      "end_line": 559,
      "comment": "\n     * Creates a new CSV format builder.\n     *\n     * @param delimiter\n     *            the char used for value separation, must not be a line break character\n     * @return a new CSV format builder.\n     * @throws IllegalArgumentException if the delimiter is a line break character\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.newBuilder(org.apache.commons.csv.CSVFormat)",
      "begin_line": 568,
      "end_line": 570,
      "comment": "\n     * Creates a CSVFormatBuilder, using the values of the given CSVFormat.\n     *\n     * @param format\n     *            The format to use values from\n     * @return a new CSVFormatBuilder\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormat(char, java.lang.Character, org.apache.commons.csv.Quote, java.lang.Character, java.lang.Character, boolean, boolean, java.lang.String, java.lang.String, java.lang.String[])",
      "begin_line": 598,
      "end_line": 616,
      "comment": " package protected to give access without needing a synthetic accessor",
      "child_ranges": [
        "(line 603,col 9)-(line 605,col 9)",
        "(line 606,col 9)-(line 606,col 35)",
        "(line 607,col 9)-(line 607,col 35)",
        "(line 608,col 9)-(line 608,col 39)",
        "(line 609,col 9)-(line 609,col 41)",
        "(line 610,col 9)-(line 610,col 29)",
        "(line 611,col 9)-(line 611,col 63)",
        "(line 612,col 9)-(line 612,col 49)",
        "(line 613,col 9)-(line 613,col 47)",
        "(line 614,col 9)-(line 614,col 41)",
        "(line 615,col 9)-(line 615,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.equals(java.lang.Object)",
      "begin_line": 618,
      "end_line": 675,
      "comment": "",
      "child_ranges": [
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 628,col 9)",
        "(line 630,col 9)-(line 630,col 48)",
        "(line 631,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 636,col 9)",
        "(line 637,col 9)-(line 643,col 9)",
        "(line 644,col 9)-(line 650,col 9)",
        "(line 651,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 660,col 9)",
        "(line 661,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 673,col 9)",
        "(line 674,col 9)-(line 674,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.format(java.lang.Object...)",
      "begin_line": 684,
      "end_line": 693,
      "comment": "\n     * Formats the specified values.\n     *\n     * @param values\n     *            the values to format\n     * @return the formatted values\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 52)",
        "(line 686,col 9)-(line 692,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getCommentStart()",
      "begin_line": 700,
      "end_line": 702,
      "comment": "\n     * Returns the character marking the start of a line comment.\n     *\n     * @return the comment start marker.\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getDelimiter()",
      "begin_line": 709,
      "end_line": 711,
      "comment": "\n     * Returns the character delimiting the values (typically \u0027;\u0027, \u0027,\u0027 or \u0027\\t\u0027).\n     *\n     * @return the delimiter character\n     ",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getEscape()",
      "begin_line": 718,
      "end_line": 720,
      "comment": "\n     * Returns the escape character.\n     *\n     * @return the escape character\n     ",
      "child_ranges": [
        "(line 719,col 9)-(line 719,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getHeader()",
      "begin_line": 722,
      "end_line": 724,
      "comment": "",
      "child_ranges": [
        "(line 723,col 9)-(line 723,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreEmptyLines()",
      "begin_line": 732,
      "end_line": 734,
      "comment": "\n     * Specifies whether empty lines between records are ignored when parsing input.\n     *\n     * @return \u003ctt\u003etrue\u003c/tt\u003e if empty lines between records are ignored, \u003ctt\u003efalse\u003c/tt\u003e if they are turned into empty\n     *         records.\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreSurroundingSpaces()",
      "begin_line": 742,
      "end_line": 744,
      "comment": "\n     * Specifies whether spaces around values are ignored when parsing input.\n     *\n     * @return \u003ctt\u003etrue\u003c/tt\u003e if spaces around values are ignored, \u003ctt\u003efalse\u003c/tt\u003e if they are treated as part of the\n     *         value.\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getNullToString()",
      "begin_line": 751,
      "end_line": 753,
      "comment": "\n     * Returns the value to use for writing null values.\n     *\n     * @return the value to use for writing null values.\n     ",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getQuoteChar()",
      "begin_line": 760,
      "end_line": 762,
      "comment": "\n     * Returns the character used to encapsulate values containing special characters.\n     *\n     * @return the quoteChar character\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getQuotePolicy()",
      "begin_line": 769,
      "end_line": 771,
      "comment": "\n     * Returns the quote policy output fields.\n     *\n     * @return the quote policy\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getRecordSeparator()",
      "begin_line": 778,
      "end_line": 780,
      "comment": "\n     * Returns the line separator delimiting output records.\n     *\n     * @return the line separator\n     ",
      "child_ranges": [
        "(line 779,col 9)-(line 779,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.hashCode()",
      "begin_line": 782,
      "end_line": 798,
      "comment": "",
      "child_ranges": [
        "(line 785,col 9)-(line 785,col 29)",
        "(line 786,col 9)-(line 786,col 23)",
        "(line 788,col 9)-(line 788,col 44)",
        "(line 789,col 9)-(line 789,col 87)",
        "(line 790,col 9)-(line 790,col 83)",
        "(line 791,col 9)-(line 791,col 89)",
        "(line 792,col 9)-(line 792,col 77)",
        "(line 793,col 9)-(line 793,col 74)",
        "(line 794,col 9)-(line 794,col 67)",
        "(line 795,col 9)-(line 795,col 95)",
        "(line 796,col 9)-(line 796,col 58)",
        "(line 797,col 9)-(line 797,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isCommentingEnabled()",
      "begin_line": 807,
      "end_line": 809,
      "comment": "\n     * Specifies whether comments are supported by this format.\n     *\n     * Note that the comment introducer character is only recognised at the start of a line.\n     *\n     * @return \u003ctt\u003etrue\u003c/tt\u003e is comments are supported, \u003ctt\u003efalse\u003c/tt\u003e otherwise\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 808,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isEscaping()",
      "begin_line": 816,
      "end_line": 818,
      "comment": "\n     * Returns whether escape are being processed.\n     *\n     * @return {@code true} if escapes are processed\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isQuoting()",
      "begin_line": 825,
      "end_line": 827,
      "comment": "\n     * Returns whether an quoteChar has been defined.\n     *\n     * @return {@code true} if an quoteChar is defined\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.parse(java.io.Reader)",
      "begin_line": 838,
      "end_line": 840,
      "comment": "\n     * Parses the specified content.\n     *\n     * @param in\n     *            the input stream\n     * @return a stream of CSVRecord\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.toBuilder()",
      "begin_line": 847,
      "end_line": 849,
      "comment": "\n     * Creates a builder based on this format.\n     *\n     * @return a new builder\n     ",
      "child_ranges": [
        "(line 848,col 9)-(line 848,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.toString()",
      "begin_line": 851,
      "end_line": 874,
      "comment": "",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 53)",
        "(line 854,col 9)-(line 854,col 63)",
        "(line 855,col 9)-(line 858,col 9)",
        "(line 859,col 9)-(line 862,col 9)",
        "(line 863,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 869,col 9)",
        "(line 870,col 9)-(line 872,col 9)",
        "(line 873,col 9)-(line 873,col 29)"
      ]
    }
  ]
}