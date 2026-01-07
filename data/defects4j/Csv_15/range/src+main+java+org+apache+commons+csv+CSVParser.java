{
  "filepath": "/tmp/Csv-15b/src/main/java/org/apache/commons/csv/CSVParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVParser",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003corg.apache.commons.csv.CSVRecord\u003e",
        "java.io.Closeable"
      ],
      "begin_line": 134,
      "end_line": 624,
      "comment": "\n * Parses CSV files according to the specified format.\n *\n * Because CSV appears in many different dialects, the parser supports many formats by allowing the\n * specification of a {@link CSVFormat}.\n *\n * The parser works record wise. It is not possible to go back, once a record has been parsed from the input stream.\n *\n * \u003ch2\u003eCreating instances\u003c/h2\u003e\n * \u003cp\u003e\n * There are several static factory methods that can be used to create instances for various types of resources:\n * \u003c/p\u003e\n * \u003cul\u003e\n *     \u003cli\u003e{@link #parse(java.io.File, Charset, CSVFormat)}\u003c/li\u003e\n *     \u003cli\u003e{@link #parse(String, CSVFormat)}\u003c/li\u003e\n *     \u003cli\u003e{@link #parse(java.net.URL, java.nio.charset.Charset, CSVFormat)}\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Alternatively parsers can also be created by passing a {@link Reader} directly to the sole constructor.\n *\n * For those who like fluent APIs, parsers can be created using {@link CSVFormat#parse(java.io.Reader)} as a shortcut:\n * \u003c/p\u003e\n * \u003cpre\u003e\n * for(CSVRecord record : CSVFormat.EXCEL.parse(in)) {\n *     ...\n * }\n * \u003c/pre\u003e\n *\n * \u003ch2\u003eParsing record wise\u003c/h2\u003e\n * \u003cp\u003e\n * To parse a CSV input from a file, you write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * File csvData \u003d new File(\u0026quot;/path/to/csv\u0026quot;);\n * CSVParser parser \u003d CSVParser.parse(csvData, CSVFormat.RFC4180);\n * for (CSVRecord csvRecord : parser) {\n *     ...\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * This will read the parse the contents of the file using the\n * \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\" target\u003d\"_blank\"\u003eRFC 4180\u003c/a\u003e format.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * To parse CSV input in a format like Excel, you write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVParser parser \u003d CSVParser.parse(csvData, CSVFormat.EXCEL);\n * for (CSVRecord csvRecord : parser) {\n *     ...\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * If the predefined formats don\u0027t match the format at hands, custom formats can be defined. More information about\n * customising CSVFormats is available in {@link CSVFormat CSVFormat JavaDoc}.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eParsing into memory\u003c/h2\u003e\n * \u003cp\u003e\n * If parsing record wise is not desired, the contents of the input can be read completely into memory.\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * Reader in \u003d new StringReader(\u0026quot;a;b\\nc;d\u0026quot;);\n * CSVParser parser \u003d new CSVParser(in, CSVFormat.EXCEL);\n * List\u0026lt;CSVRecord\u0026gt; list \u003d parser.getRecords();\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * There are two constraints that have to be kept in mind:\n * \u003c/p\u003e\n *\n * \u003col\u003e\n *     \u003cli\u003eParsing into memory starts at the current position of the parser. If you have already parsed records from\n *     the input, those records will not end up in the in memory representation of your CSV data.\u003c/li\u003e\n *     \u003cli\u003eParsing into memory may consume a lot of system resources depending on the input. For example if you\u0027re\n *     parsing a 150MB file of CSV data the contents will be read completely into memory.\u003c/li\u003e\n * \u003c/ol\u003e\n *\n * \u003ch2\u003eNotes\u003c/h2\u003e\n * \u003cp\u003e\n * Internal parser state is completely covered by the format and the reader-state.\n * \u003c/p\u003e\n *\n * @see \u003ca href\u003d\"package-summary.html\"\u003epackage documentation for more details\u003c/a\u003e\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.io.File, java.nio.charset.Charset, org.apache.commons.csv.CSVFormat)",
      "begin_line": 151,
      "end_line": 156,
      "comment": "\n     * Creates a parser for the given {@link File}.\n     *\n     * @param file\n     *            a CSV file. Must not be null.\n     * @param charset\n     *            A Charset\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @return a new parser\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either file or format are null.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 41)",
        "(line 154,col 9)-(line 154,col 45)",
        "(line 155,col 9)-(line 155,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.io.InputStream, java.nio.charset.Charset, org.apache.commons.csv.CSVFormat)",
      "begin_line": 179,
      "end_line": 185,
      "comment": "\n     * Creates a CSV parser using the given {@link CSVFormat}.\n     *\n     * \u003cp\u003e\n     * If you do not read all records from the given {@code reader}, you should call {@link #close()} on the parser,\n     * unless you close the {@code reader}.\n     * \u003c/p\u003e\n     *\n     * @param inputStream\n     *            an InputStream containing CSV-formatted input. Must not be null.\n     * @param charset\n     *            a Charset.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @return a new CSVParser configured with the given reader and format.\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either reader or format are null.\n     * @throws IOException\n     *             If there is a problem reading the header or skipping the first record\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 55)",
        "(line 183,col 9)-(line 183,col 45)",
        "(line 184,col 9)-(line 184,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.nio.file.Path, java.nio.charset.Charset, org.apache.commons.csv.CSVFormat)",
      "begin_line": 203,
      "end_line": 207,
      "comment": "\n     * Creates a parser for the given {@link Path}.\n     *\n     * @param path\n     *            a CSV file. Must not be null.\n     * @param charset\n     *            A Charset\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @return a new parser\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either file or format are null.\n     * @throws IOException\n     *             If an I/O error occurs\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 41)",
        "(line 205,col 9)-(line 205,col 45)",
        "(line 206,col 9)-(line 206,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.io.Reader, org.apache.commons.csv.CSVFormat)",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * Creates a CSV parser using the given {@link CSVFormat}\n     *\n     * \u003cp\u003e\n     * If you do not read all records from the given {@code reader}, you should call {@link #close()} on the parser,\n     * unless you close the {@code reader}.\n     * \u003c/p\u003e\n     *\n     * @param reader\n     *            a Reader containing CSV-formatted input. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @return a new CSVParser configured with the given reader and format.\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either reader or format are null.\n     * @throws IOException\n     *             If there is a problem reading the header or skipping the first record\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.lang.String, org.apache.commons.csv.CSVFormat)",
      "begin_line": 245,
      "end_line": 250,
      "comment": "\n     * Creates a parser for the given {@link String}.\n     *\n     * @param string\n     *            a CSV string. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @return a new parser\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either string or format are null.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 45)",
        "(line 247,col 9)-(line 247,col 45)",
        "(line 249,col 9)-(line 249,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.net.URL, java.nio.charset.Charset, org.apache.commons.csv.CSVFormat)",
      "begin_line": 272,
      "end_line": 278,
      "comment": "\n     * Creates a parser for the given URL.\n     *\n     * \u003cp\u003e\n     * If you do not read all records from the given {@code url}, you should call {@link #close()} on the parser, unless\n     * you close the {@code url}.\n     * \u003c/p\u003e\n     *\n     * @param url\n     *            a URL. Must not be null.\n     * @param charset\n     *            the charset for the resource. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @return a new parser\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either url, charset or format are null.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 39)",
        "(line 274,col 9)-(line 274,col 47)",
        "(line 275,col 9)-(line 275,col 45)",
        "(line 277,col 9)-(line 277,col 87)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headerMap"
      ],
      "begin_line": 285,
      "end_line": 285,
      "comment": " A mapping of column names to column indices "
    },
    {
      "type": "field",
      "varNames": [
        "lexer"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordList"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": " A record buffer for getRecord(). Grows as necessary and is reused. "
    },
    {
      "type": "field",
      "varNames": [
        "recordNumber"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": "\n     * The next record number to assign.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "characterOffset"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": "\n     * Lexer offset when the parser does not start parsing at the beginning of the source. Usually used in combination\n     * with {@link #recordNumber}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "reusableToken"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVParser.CSVParser(java.io.Reader, org.apache.commons.csv.CSVFormat)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * Customized CSV parser using the given {@link CSVFormat}\n     *\n     * \u003cp\u003e\n     * If you do not read all records from the given {@code reader}, you should call {@link #close()} on the parser,\n     * unless you close the {@code reader}.\n     * \u003c/p\u003e\n     *\n     * @param reader\n     *            a Reader containing CSV-formatted input. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either reader or format are null.\n     * @throws IOException\n     *             If there is a problem reading the header or skipping the first record\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVParser.CSVParser(java.io.Reader, org.apache.commons.csv.CSVFormat, long, long)",
      "begin_line": 348,
      "end_line": 359,
      "comment": "\n     * Customized CSV parser using the given {@link CSVFormat}\n     *\n     * \u003cp\u003e\n     * If you do not read all records from the given {@code reader}, you should call {@link #close()} on the parser,\n     * unless you close the {@code reader}.\n     * \u003c/p\u003e\n     *\n     * @param reader\n     *            a Reader containing CSV-formatted input. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @param characterOffset\n     *            Lexer offset when the parser does not start parsing at the beginning of the source.\n     * @param recordNumber\n     *            The next record number to assign\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either reader or format are null.\n     * @throws IOException\n     *             If there is a problem reading the header or skipping the first record\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 45)",
        "(line 352,col 9)-(line 352,col 45)",
        "(line 354,col 9)-(line 354,col 29)",
        "(line 355,col 9)-(line 355,col 75)",
        "(line 356,col 9)-(line 356,col 49)",
        "(line 357,col 9)-(line 357,col 47)",
        "(line 358,col 9)-(line 358,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.addRecordValue(boolean)",
      "begin_line": 361,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 67)",
        "(line 363,col 9)-(line 363,col 79)",
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 62)",
        "(line 368,col 9)-(line 368,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.close()",
      "begin_line": 377,
      "end_line": 382,
      "comment": "\n     * Closes resources.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 381,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getCurrentLineNumber()",
      "begin_line": 394,
      "end_line": 396,
      "comment": "\n     * Returns the current line number in the input stream.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eATTENTION:\u003c/strong\u003e If your CSV input has multi-line values, the returned number does not correspond to\n     * the record number.\n     * \u003c/p\u003e\n     *\n     * @return current line number\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getFirstEndOfLine()",
      "begin_line": 404,
      "end_line": 406,
      "comment": "\n     * Gets the first end-of-line string encountered.\n     *\n     * @return the first end-of-line string\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getHeaderMap()",
      "begin_line": 415,
      "end_line": 417,
      "comment": "\n     * Returns a copy of the header map that iterates in column order.\n     * \u003cp\u003e\n     * The map keys are column names. The map values are 0-based indices.\n     * \u003c/p\u003e\n     * @return a copy of the header map that iterates in column order.\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getRecordNumber()",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\n     * Returns the current record number in the input stream.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eATTENTION:\u003c/strong\u003e If your CSV input has multi-line values, the returned number does not correspond to\n     * the line number.\n     * \u003c/p\u003e\n     *\n     * @return current record number\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getRecords()",
      "begin_line": 445,
      "end_line": 452,
      "comment": "\n     * Parses the CSV input according to the given format and returns the content as a list of\n     * {@link CSVRecord CSVRecords}.\n     *\n     * \u003cp\u003e\n     * The returned content starts at the current parse-position in the stream.\n     * \u003c/p\u003e\n     *\n     * @return list of {@link CSVRecord CSVRecords}, may be empty\n     * @throws IOException\n     *             on parse error or input read-failure\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 22)",
        "(line 447,col 9)-(line 447,col 58)",
        "(line 448,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 451,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.initializeHeader()",
      "begin_line": 460,
      "end_line": 497,
      "comment": "\n     * Initializes the name to index mapping if the format defines a header.\n     *\n     * @return null if the format has no header.\n     * @throws IOException if there is a problem reading the header or skipping the first record\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 43)",
        "(line 462,col 9)-(line 462,col 62)",
        "(line 463,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.isClosed()",
      "begin_line": 504,
      "end_line": 506,
      "comment": "\n     * Gets whether this parser is closed.\n     *\n     * @return whether this parser is closed.\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.iterator()",
      "begin_line": 520,
      "end_line": 570,
      "comment": "\n     * Returns an iterator on the records.\n     *\n     * \u003cp\u003e\n     * An {@link IOException} caught during the iteration are re-thrown as an\n     * {@link IllegalStateException}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * If the parser is closed a call to {@link Iterator#next()} will throw a\n     * {@link NoSuchElementException}.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 569,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 523,
      "end_line": 523,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-6731ae62-d413-4f59-be67-3fe2764e8376.getNextRecord()",
      "begin_line": 525,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 526,col 17)-(line 531,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-04d1fff9-f62f-43ca-b5ff-85541c6056f7.hasNext()",
      "begin_line": 534,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 536,col 17)-(line 538,col 17)",
        "(line 539,col 17)-(line 541,col 17)",
        "(line 543,col 17)-(line 543,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-6da8551c-852a-4b45-aabe-6f0a15ce140f.next()",
      "begin_line": 546,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 548,col 17)-(line 550,col 17)",
        "(line 551,col 17)-(line 551,col 46)",
        "(line 552,col 17)-(line 552,col 36)",
        "(line 554,col 17)-(line 560,col 17)",
        "(line 562,col 17)-(line 562,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-5e2ae877-216a-4138-95bc-463aeafd6fd3.remove()",
      "begin_line": 565,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 567,col 17)-(line 567,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.nextRecord()",
      "begin_line": 579,
      "end_line": 622,
      "comment": "\n     * Parses the next record from the current point in the stream.\n     *\n     * @return the record as an array of values, or {@code null} if the end of the stream has been reached\n     * @throws IOException\n     *             on parse error or input read-failure\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 32)",
        "(line 581,col 9)-(line 581,col 32)",
        "(line 582,col 9)-(line 582,col 32)",
        "(line 583,col 9)-(line 583,col 91)",
        "(line 584,col 9)-(line 613,col 51)",
        "(line 615,col 9)-(line 620,col 9)",
        "(line 621,col 9)-(line 621,col 22)"
      ]
    }
  ]
}