{
  "filepath": "/tmp/Csv-13b/src/main/java/org/apache/commons/csv/CSVParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVParser",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003corg.apache.commons.csv.CSVRecord\u003e",
        "java.io.Closeable"
      ],
      "begin_line": 133,
      "end_line": 535,
      "comment": "\n * Parses CSV files according to the specified format.\n *\n * Because CSV appears in many different dialects, the parser supports many formats by allowing the\n * specification of a {@link CSVFormat}.\n *\n * The parser works record wise. It is not possible to go back, once a record has been parsed from the input stream.\n *\n * \u003ch2\u003eCreating instances\u003c/h2\u003e\n * \u003cp\u003e\n * There are several static factory methods that can be used to create instances for various types of resources:\n * \u003c/p\u003e\n * \u003cul\u003e\n *     \u003cli\u003e{@link #parse(java.io.File, Charset, CSVFormat)}\u003c/li\u003e\n *     \u003cli\u003e{@link #parse(String, CSVFormat)}\u003c/li\u003e\n *     \u003cli\u003e{@link #parse(java.net.URL, java.nio.charset.Charset, CSVFormat)}\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Alternatively parsers can also be created by passing a {@link Reader} directly to the sole constructor.\n *\n * For those who like fluent APIs, parsers can be created using {@link CSVFormat#parse(java.io.Reader)} as a shortcut:\n * \u003c/p\u003e\n * \u003cpre\u003e\n * for(CSVRecord record : CSVFormat.EXCEL.parse(in)) {\n *     ...\n * }\n * \u003c/pre\u003e\n *\n * \u003ch2\u003eParsing record wise\u003c/h2\u003e\n * \u003cp\u003e\n * To parse a CSV input from a file, you write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * File csvData \u003d new File(\u0026quot;/path/to/csv\u0026quot;);\n * CSVParser parser \u003d CSVParser.parse(csvData, CSVFormat.RFC4180);\n * for (CSVRecord csvRecord : parser) {\n *     ...\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * This will read the parse the contents of the file using the\n * \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\" target\u003d\"_blank\"\u003eRFC 4180\u003c/a\u003e format.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * To parse CSV input in a format like Excel, you write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVParser parser \u003d CSVParser.parse(csvData, CSVFormat.EXCEL);\n * for (CSVRecord csvRecord : parser) {\n *     ...\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * If the predefined formats don\u0027t match the format at hands, custom formats can be defined. More information about\n * customising CSVFormats is available in {@link CSVFormat CSVFormat JavaDoc}.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eParsing into memory\u003c/h2\u003e\n * \u003cp\u003e\n * If parsing record wise is not desired, the contents of the input can be read completely into memory.\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * Reader in \u003d new StringReader(\u0026quot;a;b\\nc;d\u0026quot;);\n * CSVParser parser \u003d new CSVParser(in, CSVFormat.EXCEL);\n * List\u0026lt;CSVRecord\u0026gt; list \u003d parser.getRecords();\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * There are two constraints that have to be kept in mind:\n * \u003c/p\u003e\n *\n * \u003col\u003e\n *     \u003cli\u003eParsing into memory starts at the current position of the parser. If you have already parsed records from\n *     the input, those records will not end up in the in memory representation of your CSV data.\u003c/li\u003e\n *     \u003cli\u003eParsing into memory may consume a lot of system resources depending on the input. For example if you\u0027re\n *     parsing a 150MB file of CSV data the contents will be read completely into memory.\u003c/li\u003e\n * \u003c/ol\u003e\n *\n * \u003ch2\u003eNotes\u003c/h2\u003e\n * \u003cp\u003e\n * Internal parser state is completely covered by the format and the reader-state.\n * \u003c/p\u003e\n *\n * @version $Id$\n *\n * @see \u003ca href\u003d\"package-summary.html\"\u003epackage documentation for more details\u003c/a\u003e\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.io.File, java.nio.charset.Charset, org.apache.commons.csv.CSVFormat)",
      "begin_line": 155,
      "end_line": 159,
      "comment": "\n     * Creates a parser for the given {@link File}.\n     *\n     * \u003cp\u003e\u003cstrong\u003eNote:\u003c/strong\u003e This method internally creates a FileReader using\n     * {@link java.io.FileReader#FileReader(java.io.File)} which in turn relies on the default encoding of the JVM that\n     * is executing the code. If this is insufficient create a URL to the file and use\n     * {@link #parse(URL, Charset, CSVFormat)}\u003c/p\u003e\n     *\n     * @param file\n     *            a CSV file. Must not be null.\n     * @param charset\n     *            A charset\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @return a new parser\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either file or format are null.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 41)",
        "(line 157,col 9)-(line 157,col 45)",
        "(line 158,col 9)-(line 158,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.lang.String, org.apache.commons.csv.CSVFormat)",
      "begin_line": 174,
      "end_line": 179,
      "comment": "\n     * Creates a parser for the given {@link String}.\n     *\n     * @param string\n     *            a CSV string. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @return a new parser\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either string or format are null.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 45)",
        "(line 176,col 9)-(line 176,col 45)",
        "(line 178,col 9)-(line 178,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.net.URL, java.nio.charset.Charset, org.apache.commons.csv.CSVFormat)",
      "begin_line": 201,
      "end_line": 207,
      "comment": "\n     * Creates a parser for the given URL.\n     *\n     * \u003cp\u003e\n     * If you do not read all records from the given {@code url}, you should call {@link #close()} on the parser, unless\n     * you close the {@code url}.\n     * \u003c/p\u003e\n     *\n     * @param url\n     *            a URL. Must not be null.\n     * @param charset\n     *            the charset for the resource. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @return a new parser\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either url, charset or format are null.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 39)",
        "(line 203,col 9)-(line 203,col 47)",
        "(line 204,col 9)-(line 204,col 45)",
        "(line 206,col 9)-(line 206,col 87)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headerMap"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " A mapping of column names to column indices "
    },
    {
      "type": "field",
      "varNames": [
        "lexer"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "record"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": " A record buffer for getRecord(). Grows as necessary and is reused. "
    },
    {
      "type": "field",
      "varNames": [
        "recordNumber"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": "\n     * The next record number to assign.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "characterOffset"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": "\n     * Lexer offset when the parser does not start parsing at the beginning of the source. Usually used in combination\n     * with {@link #recordNumber}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "reusableToken"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVParser.CSVParser(java.io.Reader, org.apache.commons.csv.CSVFormat)",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * Customized CSV parser using the given {@link CSVFormat}\n     *\n     * \u003cp\u003e\n     * If you do not read all records from the given {@code reader}, you should call {@link #close()} on the parser,\n     * unless you close the {@code reader}.\n     * \u003c/p\u003e\n     *\n     * @param reader\n     *            a Reader containing CSV-formatted input. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either reader or format are null.\n     * @throws IOException\n     *             If there is a problem reading the header or skipping the first record\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVParser.CSVParser(java.io.Reader, org.apache.commons.csv.CSVFormat, long, long)",
      "begin_line": 277,
      "end_line": 287,
      "comment": "\n     * Customized CSV parser using the given {@link CSVFormat}\n     *\n     * \u003cp\u003e\n     * If you do not read all records from the given {@code reader}, you should call {@link #close()} on the parser,\n     * unless you close the {@code reader}.\n     * \u003c/p\u003e\n     *\n     * @param reader\n     *            a Reader containing CSV-formatted input. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @param characterOffset\n     *            Lexer offset when the parser does not start parsing at the beginning of the source.\n     * @param recordNumber\n     *            The next record number to assign\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either reader or format are null.\n     * @throws IOException\n     *             If there is a problem reading the header or skipping the first record\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 45)",
        "(line 280,col 9)-(line 280,col 45)",
        "(line 282,col 9)-(line 282,col 29)",
        "(line 283,col 9)-(line 283,col 75)",
        "(line 284,col 9)-(line 284,col 49)",
        "(line 285,col 9)-(line 285,col 47)",
        "(line 286,col 9)-(line 286,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.addRecordValue()",
      "begin_line": 289,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 67)",
        "(line 291,col 9)-(line 291,col 62)",
        "(line 292,col 9)-(line 292,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.close()",
      "begin_line": 301,
      "end_line": 306,
      "comment": "\n     * Closes resources.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 305,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getCurrentLineNumber()",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\n     * Returns the current line number in the input stream.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eATTENTION:\u003c/strong\u003e If your CSV input has multi-line values, the returned number does not correspond to\n     * the record number.\n     * \u003c/p\u003e\n     *\n     * @return current line number\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getHeaderMap()",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\n     * Returns a copy of the header map that iterates in column order.\n     * \u003cp\u003e\n     * The map keys are column names. The map values are 0-based indices.\n     * \u003c/p\u003e\n     * @return a copy of the header map that iterates in column order.\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getRecordNumber()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\n     * Returns the current record number in the input stream.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eATTENTION:\u003c/strong\u003e If your CSV input has multi-line values, the returned number does not correspond to\n     * the line number.\n     * \u003c/p\u003e\n     *\n     * @return current record number\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getRecords()",
      "begin_line": 359,
      "end_line": 366,
      "comment": "\n     * Parses the CSV input according to the given format and returns the content as a list of\n     * {@link CSVRecord CSVRecords}.\n     *\n     * \u003cp\u003e\n     * The returned content starts at the current parse-position in the stream.\n     * \u003c/p\u003e\n     *\n     * @return list of {@link CSVRecord CSVRecords}, may be empty\n     * @throws IOException\n     *             on parse error or input read-failure\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 22)",
        "(line 361,col 9)-(line 361,col 67)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.initializeHeader()",
      "begin_line": 374,
      "end_line": 412,
      "comment": "\n     * Initializes the name to index mapping if the format defines a header.\n     *\n     * @return null if the format has no header.\n     * @throws IOException if there is a problem reading the header or skipping the first record\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 43)",
        "(line 376,col 9)-(line 376,col 62)",
        "(line 377,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.isClosed()",
      "begin_line": 419,
      "end_line": 421,
      "comment": "\n     * Gets whether this parser is closed.\n     *\n     * @return whether this parser is closed.\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.iterator()",
      "begin_line": 431,
      "end_line": 481,
      "comment": "\n     * Returns an iterator on the records.\n     *\n     * \u003cp\u003eIOExceptions occurring during the iteration are wrapped in a\n     * RuntimeException.\n     * If the parser is closed a call to {@code next()} will throw a\n     * NoSuchElementException.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 480,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 434,
      "end_line": 434,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-f6380ee7-ad39-4b95-a63c-2f17d89c23d2.getNextRecord()",
      "begin_line": 436,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 437,col 17)-(line 442,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-92436523-723a-40ec-ade0-caf04964c4de.hasNext()",
      "begin_line": 445,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 447,col 17)-(line 449,col 17)",
        "(line 450,col 17)-(line 452,col 17)",
        "(line 454,col 17)-(line 454,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-d7fd5da5-abb3-4a13-955b-9bddfc44e28d.next()",
      "begin_line": 457,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 459,col 17)-(line 461,col 17)",
        "(line 462,col 17)-(line 462,col 46)",
        "(line 463,col 17)-(line 463,col 36)",
        "(line 465,col 17)-(line 471,col 17)",
        "(line 473,col 17)-(line 473,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-4368d530-20df-494a-992d-9deb82ce735c.remove()",
      "begin_line": 476,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 478,col 17)-(line 478,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.nextRecord()",
      "begin_line": 490,
      "end_line": 533,
      "comment": "\n     * Parses the next record from the current point in the stream.\n     *\n     * @return the record as an array of values, or {@code null} if the end of the stream has been reached\n     * @throws IOException\n     *             on parse error or input read-failure\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 32)",
        "(line 492,col 9)-(line 492,col 28)",
        "(line 493,col 9)-(line 493,col 32)",
        "(line 494,col 9)-(line 494,col 91)",
        "(line 495,col 9)-(line 524,col 51)",
        "(line 526,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 22)"
      ]
    }
  ]
}