{
  "filepath": "/tmp/Csv-14b/src/main/java/org/apache/commons/csv/CSVParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVParser",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003corg.apache.commons.csv.CSVRecord\u003e",
        "java.io.Closeable"
      ],
      "begin_line": 136,
      "end_line": 623,
      "comment": "\n * Parses CSV files according to the specified format.\n *\n * Because CSV appears in many different dialects, the parser supports many formats by allowing the\n * specification of a {@link CSVFormat}.\n *\n * The parser works record wise. It is not possible to go back, once a record has been parsed from the input stream.\n *\n * \u003ch2\u003eCreating instances\u003c/h2\u003e\n * \u003cp\u003e\n * There are several static factory methods that can be used to create instances for various types of resources:\n * \u003c/p\u003e\n * \u003cul\u003e\n *     \u003cli\u003e{@link #parse(java.io.File, Charset, CSVFormat)}\u003c/li\u003e\n *     \u003cli\u003e{@link #parse(String, CSVFormat)}\u003c/li\u003e\n *     \u003cli\u003e{@link #parse(java.net.URL, java.nio.charset.Charset, CSVFormat)}\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Alternatively parsers can also be created by passing a {@link Reader} directly to the sole constructor.\n *\n * For those who like fluent APIs, parsers can be created using {@link CSVFormat#parse(java.io.Reader)} as a shortcut:\n * \u003c/p\u003e\n * \u003cpre\u003e\n * for(CSVRecord record : CSVFormat.EXCEL.parse(in)) {\n *     ...\n * }\n * \u003c/pre\u003e\n *\n * \u003ch2\u003eParsing record wise\u003c/h2\u003e\n * \u003cp\u003e\n * To parse a CSV input from a file, you write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * File csvData \u003d new File(\u0026quot;/path/to/csv\u0026quot;);\n * CSVParser parser \u003d CSVParser.parse(csvData, CSVFormat.RFC4180);\n * for (CSVRecord csvRecord : parser) {\n *     ...\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * This will read the parse the contents of the file using the\n * \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\" target\u003d\"_blank\"\u003eRFC 4180\u003c/a\u003e format.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * To parse CSV input in a format like Excel, you write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVParser parser \u003d CSVParser.parse(csvData, CSVFormat.EXCEL);\n * for (CSVRecord csvRecord : parser) {\n *     ...\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * If the predefined formats don\u0027t match the format at hands, custom formats can be defined. More information about\n * customising CSVFormats is available in {@link CSVFormat CSVFormat JavaDoc}.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eParsing into memory\u003c/h2\u003e\n * \u003cp\u003e\n * If parsing record wise is not desired, the contents of the input can be read completely into memory.\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * Reader in \u003d new StringReader(\u0026quot;a;b\\nc;d\u0026quot;);\n * CSVParser parser \u003d new CSVParser(in, CSVFormat.EXCEL);\n * List\u0026lt;CSVRecord\u0026gt; list \u003d parser.getRecords();\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * There are two constraints that have to be kept in mind:\n * \u003c/p\u003e\n *\n * \u003col\u003e\n *     \u003cli\u003eParsing into memory starts at the current position of the parser. If you have already parsed records from\n *     the input, those records will not end up in the in memory representation of your CSV data.\u003c/li\u003e\n *     \u003cli\u003eParsing into memory may consume a lot of system resources depending on the input. For example if you\u0027re\n *     parsing a 150MB file of CSV data the contents will be read completely into memory.\u003c/li\u003e\n * \u003c/ol\u003e\n *\n * \u003ch2\u003eNotes\u003c/h2\u003e\n * \u003cp\u003e\n * Internal parser state is completely covered by the format and the reader-state.\n * \u003c/p\u003e\n *\n * @version $Id$\n *\n * @see \u003ca href\u003d\"package-summary.html\"\u003epackage documentation for more details\u003c/a\u003e\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.io.File, java.nio.charset.Charset, org.apache.commons.csv.CSVFormat)",
      "begin_line": 158,
      "end_line": 163,
      "comment": "\n     * Creates a parser for the given {@link File}.\n     *\n     * \u003cp\u003e\u003cstrong\u003eNote:\u003c/strong\u003e This method internally creates a FileReader using\n     * {@link java.io.FileReader#FileReader(java.io.File)} which in turn relies on the default encoding of the JVM that\n     * is executing the code. If this is insufficient create a URL to the file and use\n     * {@link #parse(URL, Charset, CSVFormat)}\u003c/p\u003e\n     *\n     * @param file\n     *            a CSV file. Must not be null.\n     * @param charset\n     *            A charset\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @return a new parser\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either file or format are null.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 41)",
        "(line 161,col 9)-(line 161,col 45)",
        "(line 162,col 9)-(line 162,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.io.InputStream, java.nio.charset.Charset, org.apache.commons.csv.CSVFormat)",
      "begin_line": 187,
      "end_line": 192,
      "comment": "\n     * Creates a CSV parser using the given {@link CSVFormat}.\n     *\n     * \u003cp\u003e\n     * If you do not read all records from the given {@code reader}, you should\n     * call {@link #close()} on the parser, unless you close the {@code reader}.\n     * \u003c/p\u003e\n     *\n     * @param reader\n     *            a Reader containing CSV-formatted input. Must not be null.\n     * @param charset\n     *            a Charset.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either\n     *             reader or format are null.\n     * @throws IOException\n     *             If there is a problem reading the header or skipping the\n     *             first record\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 55)",
        "(line 190,col 9)-(line 190,col 45)",
        "(line 191,col 9)-(line 191,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.nio.file.Path, java.nio.charset.Charset, org.apache.commons.csv.CSVFormat)",
      "begin_line": 215,
      "end_line": 219,
      "comment": "\n     * Creates a parser for the given {@link File}.\n     *\n     * \u003cp\u003e\u003cstrong\u003eNote:\u003c/strong\u003e This method internally creates a FileReader using\n     * {@link java.io.FileReader#FileReader(java.io.File)} which in turn relies on the default encoding of the JVM that\n     * is executing the code. If this is insufficient create a URL to the file and use\n     * {@link #parse(URL, Charset, CSVFormat)}\u003c/p\u003e\n     *\n     * @param path\n     *            a CSV file. Must not be null.\n     * @param charset\n     *            A charset\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @return a new parser\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either file or format are null.\n     * @throws IOException\n     *             If an I/O error occurs\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 41)",
        "(line 217,col 9)-(line 217,col 45)",
        "(line 218,col 9)-(line 218,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.io.Reader, org.apache.commons.csv.CSVFormat)",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\n     * Creates a CSV parser using the given {@link CSVFormat}\n     *\n     * \u003cp\u003e\n     * If you do not read all records from the given {@code reader}, you should\n     * call {@link #close()} on the parser, unless you close the {@code reader}.\n     * \u003c/p\u003e\n     *\n     * @param reader\n     *            a Reader containing CSV-formatted input. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either\n     *             reader or format are null.\n     * @throws IOException\n     *             If there is a problem reading the header or skipping the\n     *             first record\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.lang.String, org.apache.commons.csv.CSVFormat)",
      "begin_line": 258,
      "end_line": 263,
      "comment": "\n     * Creates a parser for the given {@link String}.\n     *\n     * @param string\n     *            a CSV string. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @return a new parser\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either string or format are null.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 45)",
        "(line 260,col 9)-(line 260,col 45)",
        "(line 262,col 9)-(line 262,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.net.URL, java.nio.charset.Charset, org.apache.commons.csv.CSVFormat)",
      "begin_line": 285,
      "end_line": 291,
      "comment": "\n     * Creates a parser for the given URL.\n     *\n     * \u003cp\u003e\n     * If you do not read all records from the given {@code url}, you should call {@link #close()} on the parser, unless\n     * you close the {@code url}.\n     * \u003c/p\u003e\n     *\n     * @param url\n     *            a URL. Must not be null.\n     * @param charset\n     *            the charset for the resource. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @return a new parser\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either url, charset or format are null.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 39)",
        "(line 287,col 9)-(line 287,col 47)",
        "(line 288,col 9)-(line 288,col 45)",
        "(line 290,col 9)-(line 290,col 87)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headerMap"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": " A mapping of column names to column indices "
    },
    {
      "type": "field",
      "varNames": [
        "lexer"
      ],
      "begin_line": 300,
      "end_line": 300,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "record"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": " A record buffer for getRecord(). Grows as necessary and is reused. "
    },
    {
      "type": "field",
      "varNames": [
        "recordNumber"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": "\n     * The next record number to assign.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "characterOffset"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": "\n     * Lexer offset when the parser does not start parsing at the beginning of the source. Usually used in combination\n     * with {@link #recordNumber}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "reusableToken"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVParser.CSVParser(java.io.Reader, org.apache.commons.csv.CSVFormat)",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\n     * Customized CSV parser using the given {@link CSVFormat}\n     *\n     * \u003cp\u003e\n     * If you do not read all records from the given {@code reader}, you should call {@link #close()} on the parser,\n     * unless you close the {@code reader}.\n     * \u003c/p\u003e\n     *\n     * @param reader\n     *            a Reader containing CSV-formatted input. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either reader or format are null.\n     * @throws IOException\n     *             If there is a problem reading the header or skipping the first record\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVParser.CSVParser(java.io.Reader, org.apache.commons.csv.CSVFormat, long, long)",
      "begin_line": 361,
      "end_line": 372,
      "comment": "\n     * Customized CSV parser using the given {@link CSVFormat}\n     *\n     * \u003cp\u003e\n     * If you do not read all records from the given {@code reader}, you should call {@link #close()} on the parser,\n     * unless you close the {@code reader}.\n     * \u003c/p\u003e\n     *\n     * @param reader\n     *            a Reader containing CSV-formatted input. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @param characterOffset\n     *            Lexer offset when the parser does not start parsing at the beginning of the source.\n     * @param recordNumber\n     *            The next record number to assign\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either reader or format are null.\n     * @throws IOException\n     *             If there is a problem reading the header or skipping the first record\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 45)",
        "(line 365,col 9)-(line 365,col 45)",
        "(line 367,col 9)-(line 367,col 29)",
        "(line 368,col 9)-(line 368,col 75)",
        "(line 369,col 9)-(line 369,col 49)",
        "(line 370,col 9)-(line 370,col 47)",
        "(line 371,col 9)-(line 371,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.addRecordValue(boolean)",
      "begin_line": 374,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 67)",
        "(line 376,col 9)-(line 376,col 79)",
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 62)",
        "(line 381,col 9)-(line 381,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.close()",
      "begin_line": 390,
      "end_line": 395,
      "comment": "\n     * Closes resources.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 394,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getCurrentLineNumber()",
      "begin_line": 407,
      "end_line": 409,
      "comment": "\n     * Returns the current line number in the input stream.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eATTENTION:\u003c/strong\u003e If your CSV input has multi-line values, the returned number does not correspond to\n     * the record number.\n     * \u003c/p\u003e\n     *\n     * @return current line number\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getHeaderMap()",
      "begin_line": 418,
      "end_line": 420,
      "comment": "\n     * Returns a copy of the header map that iterates in column order.\n     * \u003cp\u003e\n     * The map keys are column names. The map values are 0-based indices.\n     * \u003c/p\u003e\n     * @return a copy of the header map that iterates in column order.\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getRecordNumber()",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\n     * Returns the current record number in the input stream.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eATTENTION:\u003c/strong\u003e If your CSV input has multi-line values, the returned number does not correspond to\n     * the line number.\n     * \u003c/p\u003e\n     *\n     * @return current record number\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getRecords()",
      "begin_line": 448,
      "end_line": 455,
      "comment": "\n     * Parses the CSV input according to the given format and returns the content as a list of\n     * {@link CSVRecord CSVRecords}.\n     *\n     * \u003cp\u003e\n     * The returned content starts at the current parse-position in the stream.\n     * \u003c/p\u003e\n     *\n     * @return list of {@link CSVRecord CSVRecords}, may be empty\n     * @throws IOException\n     *             on parse error or input read-failure\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 22)",
        "(line 450,col 9)-(line 450,col 58)",
        "(line 451,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 454,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.initializeHeader()",
      "begin_line": 463,
      "end_line": 500,
      "comment": "\n     * Initializes the name to index mapping if the format defines a header.\n     *\n     * @return null if the format has no header.\n     * @throws IOException if there is a problem reading the header or skipping the first record\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 43)",
        "(line 465,col 9)-(line 465,col 62)",
        "(line 466,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 499,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.isClosed()",
      "begin_line": 507,
      "end_line": 509,
      "comment": "\n     * Gets whether this parser is closed.\n     *\n     * @return whether this parser is closed.\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.iterator()",
      "begin_line": 519,
      "end_line": 569,
      "comment": "\n     * Returns an iterator on the records.\n     *\n     * \u003cp\u003eIOExceptions occurring during the iteration are wrapped in a\n     * RuntimeException.\n     * If the parser is closed a call to {@code next()} will throw a\n     * NoSuchElementException.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 568,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 522,
      "end_line": 522,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-8df69a4f-0339-4101-98ae-e8cd4c7ed0cc.getNextRecord()",
      "begin_line": 524,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 525,col 17)-(line 530,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-4ca6db5a-604f-4503-94f4-e62b2042ba07.hasNext()",
      "begin_line": 533,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 535,col 17)-(line 537,col 17)",
        "(line 538,col 17)-(line 540,col 17)",
        "(line 542,col 17)-(line 542,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-b874ace7-b1c7-47dd-bc43-542dc4f10e6f.next()",
      "begin_line": 545,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 547,col 17)-(line 549,col 17)",
        "(line 550,col 17)-(line 550,col 46)",
        "(line 551,col 17)-(line 551,col 36)",
        "(line 553,col 17)-(line 559,col 17)",
        "(line 561,col 17)-(line 561,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-4d6355fe-122a-44e5-a277-6f56dd18e02a.remove()",
      "begin_line": 564,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 566,col 17)-(line 566,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.nextRecord()",
      "begin_line": 578,
      "end_line": 621,
      "comment": "\n     * Parses the next record from the current point in the stream.\n     *\n     * @return the record as an array of values, or {@code null} if the end of the stream has been reached\n     * @throws IOException\n     *             on parse error or input read-failure\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 32)",
        "(line 580,col 9)-(line 580,col 28)",
        "(line 581,col 9)-(line 581,col 32)",
        "(line 582,col 9)-(line 582,col 91)",
        "(line 583,col 9)-(line 612,col 51)",
        "(line 614,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 620,col 22)"
      ]
    }
  ]
}