{
  "filepath": "/tmp/Csv-16b/src/main/java/org/apache/commons/csv/CSVFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVFormat",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 156,
      "end_line": 2035,
      "comment": "\n * Specifies the format of a CSV file and parses input.\n *\n * \u003ch2\u003eUsing predefined formats\u003c/h2\u003e\n *\n * \u003cp\u003e\n * You can use one of the predefined formats:\n * \u003c/p\u003e\n *\n * \u003cul\u003e\n * \u003cli\u003e{@link #DEFAULT}\u003c/li\u003e\n * \u003cli\u003e{@link #EXCEL}\u003c/li\u003e\n * \u003cli\u003e{@link #MYSQL}\u003c/li\u003e\n * \u003cli\u003e{@link #RFC4180}\u003c/li\u003e\n * \u003cli\u003e{@link #TDF}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003e\n * For example:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVParser parser \u003d CSVFormat.EXCEL.parse(reader);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * The {@link CSVParser} provides static methods to parse other input types, for example:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVParser parser \u003d CSVParser.parse(file, StandardCharsets.US_ASCII, CSVFormat.EXCEL);\n * \u003c/pre\u003e\n *\n * \u003ch2\u003eDefining formats\u003c/h2\u003e\n *\n * \u003cp\u003e\n * You can extend a format by calling the {@code with} methods. For example:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVFormat.EXCEL.withNullString(\u0026quot;N/A\u0026quot;).withIgnoreSurroundingSpaces(true);\n * \u003c/pre\u003e\n *\n * \u003ch2\u003eDefining column names\u003c/h2\u003e\n *\n * \u003cp\u003e\n * To define the column names you want to use to access records, write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVFormat.EXCEL.withHeader(\u0026quot;Col1\u0026quot;, \u0026quot;Col2\u0026quot;, \u0026quot;Col3\u0026quot;);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * Calling {@link #withHeader(String...)} let\u0027s you use the given names to address values in a {@link CSVRecord}, and\n * assumes that your CSV source does not contain a first record that also defines column names.\n *\n * If it does, then you are overriding this metadata with your names and you should skip the first record by calling\n * {@link #withSkipHeaderRecord(boolean)} with {@code true}.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eParsing\u003c/h2\u003e\n *\n * \u003cp\u003e\n * You can use a format directly to parse a reader. For example, to parse an Excel file with columns header, write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * Reader in \u003d ...;\n * CSVFormat.EXCEL.withHeader(\u0026quot;Col1\u0026quot;, \u0026quot;Col2\u0026quot;, \u0026quot;Col3\u0026quot;).parse(in);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * For other input types, like resources, files, and URLs, use the static methods on {@link CSVParser}.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eReferencing columns safely\u003c/h2\u003e\n *\n * \u003cp\u003e\n * If your source contains a header record, you can simplify your code and safely reference columns, by using\n * {@link #withHeader(String...)} with no arguments:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVFormat.EXCEL.withHeader();\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * This causes the parser to read the first record and use its values as column names.\n *\n * Then, call one of the {@link CSVRecord} get method that takes a String column name argument:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * String value \u003d record.get(\u0026quot;Col1\u0026quot;);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * This makes your code impervious to changes in column order in the CSV file.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eNotes\u003c/h2\u003e\n *\n * \u003cp\u003e\n * This class is immutable.\n * \u003c/p\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVFormat.Predefined.Predefined(org.apache.commons.csv.CSVFormat)",
      "begin_line": 220,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 221,col 13)-(line 221,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.Predefined.getFormat()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n         * Gets the format.\n         *\n         * @return the format.\n         ",
      "child_ranges": [
        "(line 230,col 13)-(line 230,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT"
      ],
      "begin_line": 249,
      "end_line": 250,
      "comment": "\n     * Standard Comma Separated Value format, as for {@link #RFC4180} but allowing empty lines.\n     *\n     * \u003cp\u003e\n     * Settings are:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuote(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(\"\\r\\n\")\u003c/li\u003e\n     * \u003cli\u003ewithIgnoreEmptyLines(true)\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see Predefined#Default\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXCEL"
      ],
      "begin_line": 282,
      "end_line": 284,
      "comment": " @formatter:off"
    },
    {
      "type": "field",
      "varNames": [
        "INFORMIX_UNLOAD"
      ],
      "begin_line": 312,
      "end_line": 316,
      "comment": " @formatter:off"
    },
    {
      "type": "field",
      "varNames": [
        "INFORMIX_UNLOAD_CSV"
      ],
      "begin_line": 343,
      "end_line": 346,
      "comment": " @formatter:off"
    },
    {
      "type": "field",
      "varNames": [
        "MYSQL"
      ],
      "begin_line": 375,
      "end_line": 382,
      "comment": " @formatter:off"
    },
    {
      "type": "field",
      "varNames": [
        "ORACLE"
      ],
      "begin_line": 412,
      "end_line": 420,
      "comment": " @formatter:off"
    },
    {
      "type": "field",
      "varNames": [
        "POSTGRESQL_CSV"
      ],
      "begin_line": 450,
      "end_line": 457,
      "comment": " @formatter:off"
    },
    {
      "type": "field",
      "varNames": [
        "POSTGRESQL_TEXT"
      ],
      "begin_line": 486,
      "end_line": 493,
      "comment": " @formatter:off"
    },
    {
      "type": "field",
      "varNames": [
        "RFC4180"
      ],
      "begin_line": 511,
      "end_line": 511,
      "comment": "\n     * Comma separated format as defined by \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     *\n     * \u003cp\u003e\n     * Settings are:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuote(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(\"\\r\\n\")\u003c/li\u003e\n     * \u003cli\u003ewithIgnoreEmptyLines(false)\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see Predefined#RFC4180\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 513,
      "end_line": 513,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TDF"
      ],
      "begin_line": 531,
      "end_line": 533,
      "comment": " @formatter:off"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isLineBreak(char)",
      "begin_line": 544,
      "end_line": 546,
      "comment": "\n     * Returns true if the given character is a line break character.\n     *\n     * @param c\n     *            the character to check\n     *\n     * @return true if \u003ccode\u003ec\u003c/code\u003e is a line break character\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isLineBreak(java.lang.Character)",
      "begin_line": 556,
      "end_line": 558,
      "comment": "\n     * Returns true if the given character is a line break character.\n     *\n     * @param c\n     *            the character to check, may be null\n     *\n     * @return true if \u003ccode\u003ec\u003c/code\u003e is a line break character (and not null)\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.newFormat(char)",
      "begin_line": 580,
      "end_line": 583,
      "comment": "\n     * Creates a new CSV format with the specified delimiter.\n     *\n     * \u003cp\u003e\n     * Use this method if you want to create a CSVFormat from scratch. All fields but the delimiter will be initialized\n     * with null/false.\n     * \u003c/p\u003e\n     *\n     * @param delimiter\n     *            the char used for value separation, must not be a line break character\n     * @return a new CSV format.\n     * @throws IllegalArgumentException\n     *             if the delimiter is a line break character\n     *\n     * @see #DEFAULT\n     * @see #RFC4180\n     * @see #MYSQL\n     * @see #EXCEL\n     * @see #TDF\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 582,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.valueOf(java.lang.String)",
      "begin_line": 593,
      "end_line": 595,
      "comment": "\n     * Gets one of the predefined formats from {@link CSVFormat.Predefined}.\n     *\n     * @param format\n     *            name\n     * @return one of the predefined formats\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 64)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "allowMissingColumnNames"
      ],
      "begin_line": 597,
      "end_line": 597,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "commentMarker"
      ],
      "begin_line": 599,
      "end_line": 599,
      "comment": " null if commenting is disabled"
    },
    {
      "type": "field",
      "varNames": [
        "delimiter"
      ],
      "begin_line": 601,
      "end_line": 601,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "escapeCharacter"
      ],
      "begin_line": 603,
      "end_line": 603,
      "comment": " null if escaping is disabled"
    },
    {
      "type": "field",
      "varNames": [
        "header"
      ],
      "begin_line": 605,
      "end_line": 605,
      "comment": " array of header column names"
    },
    {
      "type": "field",
      "varNames": [
        "headerComments"
      ],
      "begin_line": 607,
      "end_line": 607,
      "comment": " array of header comment lines"
    },
    {
      "type": "field",
      "varNames": [
        "ignoreEmptyLines"
      ],
      "begin_line": 609,
      "end_line": 609,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreHeaderCase"
      ],
      "begin_line": 611,
      "end_line": 611,
      "comment": " should ignore header names case"
    },
    {
      "type": "field",
      "varNames": [
        "ignoreSurroundingSpaces"
      ],
      "begin_line": 613,
      "end_line": 613,
      "comment": " Should leading/trailing spaces be ignored around values?"
    },
    {
      "type": "field",
      "varNames": [
        "nullString"
      ],
      "begin_line": 615,
      "end_line": 615,
      "comment": " the string to be used for null values"
    },
    {
      "type": "field",
      "varNames": [
        "quoteCharacter"
      ],
      "begin_line": 617,
      "end_line": 617,
      "comment": " null if quoting is disabled"
    },
    {
      "type": "field",
      "varNames": [
        "quoteMode"
      ],
      "begin_line": 619,
      "end_line": 619,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordSeparator"
      ],
      "begin_line": 621,
      "end_line": 621,
      "comment": " for outputs"
    },
    {
      "type": "field",
      "varNames": [
        "skipHeaderRecord"
      ],
      "begin_line": 623,
      "end_line": 623,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "trailingDelimiter"
      ],
      "begin_line": 625,
      "end_line": 625,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "trim"
      ],
      "begin_line": 627,
      "end_line": 627,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "autoFlush"
      ],
      "begin_line": 629,
      "end_line": 629,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormat(char, java.lang.Character, org.apache.commons.csv.QuoteMode, java.lang.Character, java.lang.Character, boolean, boolean, java.lang.String, java.lang.String, java.lang.Object[], java.lang.String[], boolean, boolean, boolean, boolean, boolean, boolean)",
      "begin_line": 670,
      "end_line": 694,
      "comment": "\n     * Creates a customized CSV format.\n     *\n     * @param delimiter\n     *            the char used for value separation, must not be a line break character\n     * @param quoteChar\n     *            the Character used as value encapsulation marker, may be {@code null} to disable\n     * @param quoteMode\n     *            the quote mode\n     * @param commentStart\n     *            the Character used for comment identification, may be {@code null} to disable\n     * @param escape\n     *            the Character used to escape special characters in values, may be {@code null} to disable\n     * @param ignoreSurroundingSpaces\n     *            {@code true} when whitespaces enclosing values should be ignored\n     * @param ignoreEmptyLines\n     *            {@code true} when the parser should skip empty lines\n     * @param recordSeparator\n     *            the line separator to use for output\n     * @param nullString\n     *            the line separator to use for output\n     * @param headerComments\n     *            the comments to be printed by the Printer before the actual CSV data\n     * @param header\n     *            the header\n     * @param skipHeaderRecord\n     *            TODO\n     * @param allowMissingColumnNames\n     *            TODO\n     * @param ignoreHeaderCase\n     *            TODO\n     * @param trim\n     *            TODO\n     * @param trailingDelimiter\n     *            TODO\n     * @param autoFlush\n     * @throws IllegalArgumentException\n     *             if the delimiter is a line break character\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 35)",
        "(line 677,col 9)-(line 677,col 40)",
        "(line 678,col 9)-(line 678,col 35)",
        "(line 679,col 9)-(line 679,col 42)",
        "(line 680,col 9)-(line 680,col 38)",
        "(line 681,col 9)-(line 681,col 63)",
        "(line 682,col 9)-(line 682,col 63)",
        "(line 683,col 9)-(line 683,col 49)",
        "(line 684,col 9)-(line 684,col 47)",
        "(line 685,col 9)-(line 685,col 37)",
        "(line 686,col 9)-(line 686,col 60)",
        "(line 687,col 9)-(line 687,col 61)",
        "(line 688,col 9)-(line 688,col 49)",
        "(line 689,col 9)-(line 689,col 49)",
        "(line 690,col 9)-(line 690,col 51)",
        "(line 691,col 9)-(line 691,col 25)",
        "(line 692,col 9)-(line 692,col 35)",
        "(line 693,col 9)-(line 693,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.equals(java.lang.Object)",
      "begin_line": 696,
      "end_line": 763,
      "comment": "",
      "child_ranges": [
        "(line 698,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 706,col 9)",
        "(line 708,col 9)-(line 708,col 48)",
        "(line 709,col 9)-(line 711,col 9)",
        "(line 712,col 9)-(line 714,col 9)",
        "(line 715,col 9)-(line 721,col 9)",
        "(line 722,col 9)-(line 728,col 9)",
        "(line 729,col 9)-(line 735,col 9)",
        "(line 736,col 9)-(line 742,col 9)",
        "(line 743,col 9)-(line 745,col 9)",
        "(line 746,col 9)-(line 748,col 9)",
        "(line 749,col 9)-(line 751,col 9)",
        "(line 752,col 9)-(line 754,col 9)",
        "(line 755,col 9)-(line 761,col 9)",
        "(line 762,col 9)-(line 762,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.format(java.lang.Object...)",
      "begin_line": 772,
      "end_line": 781,
      "comment": "\n     * Formats the specified values.\n     *\n     * @param values\n     *            the values to format\n     * @return the formatted values\n     ",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 52)",
        "(line 774,col 9)-(line 780,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getAllowMissingColumnNames()",
      "begin_line": 789,
      "end_line": 791,
      "comment": "\n     * Specifies whether missing column names are allowed when parsing the header line.\n     *\n     * @return {@code true} if missing column names are allowed when parsing the header line, {@code false} to throw an\n     *         {@link IllegalArgumentException}.\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getAutoFlush()",
      "begin_line": 799,
      "end_line": 801,
      "comment": "\n     * Returns whether to flush on close.\n     *\n     * @return whether to flush on close.\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 800,col 9)-(line 800,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getCommentMarker()",
      "begin_line": 808,
      "end_line": 810,
      "comment": "\n     * Returns the character marking the start of a line comment.\n     *\n     * @return the comment start marker, may be {@code null}\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getDelimiter()",
      "begin_line": 817,
      "end_line": 819,
      "comment": "\n     * Returns the character delimiting the values (typically \u0027;\u0027, \u0027,\u0027 or \u0027\\t\u0027).\n     *\n     * @return the delimiter character\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getEscapeCharacter()",
      "begin_line": 826,
      "end_line": 828,
      "comment": "\n     * Returns the escape character.\n     *\n     * @return the escape character, may be {@code null}\n     ",
      "child_ranges": [
        "(line 827,col 9)-(line 827,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getHeader()",
      "begin_line": 835,
      "end_line": 837,
      "comment": "\n     * Returns a copy of the header array.\n     *\n     * @return a copy of the header array; {@code null} if disabled, the empty array if to be read from the file\n     ",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getHeaderComments()",
      "begin_line": 844,
      "end_line": 846,
      "comment": "\n     * Returns a copy of the header comment array.\n     *\n     * @return a copy of the header comment array; {@code null} if disabled.\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreEmptyLines()",
      "begin_line": 854,
      "end_line": 856,
      "comment": "\n     * Specifies whether empty lines between records are ignored when parsing input.\n     *\n     * @return {@code true} if empty lines between records are ignored, {@code false} if they are turned into empty\n     *         records.\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreHeaderCase()",
      "begin_line": 864,
      "end_line": 866,
      "comment": "\n     * Specifies whether header names will be accessed ignoring case.\n     *\n     * @return {@code true} if header names cases are ignored, {@code false} if they are case sensitive.\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreSurroundingSpaces()",
      "begin_line": 873,
      "end_line": 875,
      "comment": "\n     * Specifies whether spaces around values are ignored when parsing input.\n     *\n     * @return {@code true} if spaces around values are ignored, {@code false} if they are treated as part of the value.\n     ",
      "child_ranges": [
        "(line 874,col 9)-(line 874,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getNullString()",
      "begin_line": 887,
      "end_line": 889,
      "comment": "\n     * Gets the String to convert to and from {@code null}.\n     * \u003cul\u003e\n     * \u003cli\u003e\u003cstrong\u003eReading:\u003c/strong\u003e Converts strings equal to the given {@code nullString} to {@code null} when reading\n     * records.\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eWriting:\u003c/strong\u003e Writes {@code null} as the given {@code nullString} when writing records.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @return the String to convert to and from {@code null}. No substitution occurs if {@code null}\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getQuoteCharacter()",
      "begin_line": 896,
      "end_line": 898,
      "comment": "\n     * Returns the character used to encapsulate values containing special characters.\n     *\n     * @return the quoteChar character, may be {@code null}\n     ",
      "child_ranges": [
        "(line 897,col 9)-(line 897,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getQuoteMode()",
      "begin_line": 905,
      "end_line": 907,
      "comment": "\n     * Returns the quote policy output fields.\n     *\n     * @return the quote policy\n     ",
      "child_ranges": [
        "(line 906,col 9)-(line 906,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getRecordSeparator()",
      "begin_line": 914,
      "end_line": 916,
      "comment": "\n     * Returns the record separator delimiting output records.\n     *\n     * @return the record separator\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getSkipHeaderRecord()",
      "begin_line": 923,
      "end_line": 925,
      "comment": "\n     * Returns whether to skip the header record.\n     *\n     * @return whether to skip the header record.\n     ",
      "child_ranges": [
        "(line 924,col 9)-(line 924,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getTrailingDelimiter()",
      "begin_line": 933,
      "end_line": 935,
      "comment": "\n     * Returns whether to add a trailing delimiter.\n     *\n     * @return whether to add a trailing delimiter.\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 934,col 9)-(line 934,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getTrim()",
      "begin_line": 942,
      "end_line": 944,
      "comment": "\n     * Returns whether to trim leading and trailing blanks.\n     *\n     * @return whether to trim leading and trailing blanks.\n     ",
      "child_ranges": [
        "(line 943,col 9)-(line 943,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.hashCode()",
      "begin_line": 946,
      "end_line": 964,
      "comment": "",
      "child_ranges": [
        "(line 948,col 9)-(line 948,col 29)",
        "(line 949,col 9)-(line 949,col 23)",
        "(line 951,col 9)-(line 951,col 44)",
        "(line 952,col 9)-(line 952,col 83)",
        "(line 953,col 9)-(line 953,col 93)",
        "(line 954,col 9)-(line 954,col 91)",
        "(line 955,col 9)-(line 955,col 95)",
        "(line 956,col 9)-(line 956,col 85)",
        "(line 957,col 9)-(line 957,col 74)",
        "(line 958,col 9)-(line 958,col 67)",
        "(line 959,col 9)-(line 959,col 67)",
        "(line 960,col 9)-(line 960,col 67)",
        "(line 961,col 9)-(line 961,col 95)",
        "(line 962,col 9)-(line 962,col 58)",
        "(line 963,col 9)-(line 963,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isCommentMarkerSet()",
      "begin_line": 973,
      "end_line": 975,
      "comment": "\n     * Specifies whether comments are supported by this format.\n     *\n     * Note that the comment introducer character is only recognized at the start of a line.\n     *\n     * @return {@code true} is comments are supported, {@code false} otherwise\n     ",
      "child_ranges": [
        "(line 974,col 9)-(line 974,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isEscapeCharacterSet()",
      "begin_line": 982,
      "end_line": 984,
      "comment": "\n     * Returns whether escape are being processed.\n     *\n     * @return {@code true} if escapes are processed\n     ",
      "child_ranges": [
        "(line 983,col 9)-(line 983,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isNullStringSet()",
      "begin_line": 991,
      "end_line": 993,
      "comment": "\n     * Returns whether a nullString has been defined.\n     *\n     * @return {@code true} if a nullString is defined\n     ",
      "child_ranges": [
        "(line 992,col 9)-(line 992,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isQuoteCharacterSet()",
      "begin_line": 1000,
      "end_line": 1002,
      "comment": "\n     * Returns whether a quoteChar has been defined.\n     *\n     * @return {@code true} if a quoteChar is defined\n     ",
      "child_ranges": [
        "(line 1001,col 9)-(line 1001,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.parse(java.io.Reader)",
      "begin_line": 1017,
      "end_line": 1019,
      "comment": "\n     * Parses the specified content.\n     *\n     * \u003cp\u003e\n     * See also the various static parse methods on {@link CSVParser}.\n     * \u003c/p\u003e\n     *\n     * @param in\n     *            the input stream\n     * @return a parser over a stream of {@link CSVRecord}s.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1018,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.print(java.lang.Appendable)",
      "begin_line": 1034,
      "end_line": 1036,
      "comment": "\n     * Prints to the specified output.\n     *\n     * \u003cp\u003e\n     * See also {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param out\n     *            the output.\n     * @return a printer to an output.\n     * @throws IOException\n     *             thrown if the optional header cannot be printed.\n     ",
      "child_ranges": [
        "(line 1035,col 9)-(line 1035,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.print(java.io.File, java.nio.charset.Charset)",
      "begin_line": 1054,
      "end_line": 1058,
      "comment": "\n     * Prints to the specified output.\n     *\n     * \u003cp\u003e\n     * See also {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param out\n     *            the output.\n     * @param charset\n     *            A charset.\n     * @return a printer to an output.\n     * @throws IOException\n     *             thrown if the optional header cannot be printed.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.print(java.lang.Object, java.lang.Appendable, boolean)",
      "begin_line": 1074,
      "end_line": 1094,
      "comment": "\n     * Prints the {@code value} as the next value on the line to {@code out}. The value will be escaped or encapsulated\n     * as needed. Useful when one wants to avoid creating CSVPrinters.\n     *\n     * @param value\n     *            value to output.\n     * @param out\n     *            where to print the value.\n     * @param newRecord\n     *            if this a new record.\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 1077,col 9)-(line 1077,col 34)",
        "(line 1078,col 9)-(line 1091,col 9)",
        "(line 1092,col 9)-(line 1092,col 69)",
        "(line 1093,col 9)-(line 1093,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.print(java.lang.Object, java.lang.CharSequence, int, int, java.lang.Appendable, boolean)",
      "begin_line": 1096,
      "end_line": 1111,
      "comment": "",
      "child_ranges": [
        "(line 1098,col 9)-(line 1100,col 9)",
        "(line 1101,col 9)-(line 1110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.print(java.nio.file.Path, java.nio.charset.Charset)",
      "begin_line": 1129,
      "end_line": 1131,
      "comment": "\n     * Prints to the specified output.\n     *\n     * \u003cp\u003e\n     * See also {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param out\n     *            the output.\n     * @param charset\n     *            A charset.\n     * @return a printer to an output.\n     * @throws IOException\n     *             thrown if the optional header cannot be printed.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 1130,col 9)-(line 1130,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.printAndEscape(java.lang.CharSequence, int, int, java.lang.Appendable)",
      "begin_line": 1136,
      "end_line": 1171,
      "comment": "\n     * Note: must only be called if escaping is enabled, otherwise will generate NPE\n     ",
      "child_ranges": [
        "(line 1138,col 9)-(line 1138,col 27)",
        "(line 1139,col 9)-(line 1139,col 25)",
        "(line 1140,col 9)-(line 1140,col 37)",
        "(line 1142,col 9)-(line 1142,col 42)",
        "(line 1143,col 9)-(line 1143,col 61)",
        "(line 1145,col 9)-(line 1165,col 9)",
        "(line 1168,col 9)-(line 1170,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.printAndQuote(java.lang.Object, java.lang.CharSequence, int, int, java.lang.Appendable, boolean)",
      "begin_line": 1177,
      "end_line": 1280,
      "comment": " the original object is needed so can check for Number",
      "child_ranges": [
        "(line 1179,col 9)-(line 1179,col 30)",
        "(line 1180,col 9)-(line 1180,col 27)",
        "(line 1181,col 9)-(line 1181,col 25)",
        "(line 1182,col 9)-(line 1182,col 37)",
        "(line 1184,col 9)-(line 1184,col 46)",
        "(line 1185,col 9)-(line 1185,col 63)",
        "(line 1187,col 9)-(line 1187,col 51)",
        "(line 1188,col 9)-(line 1190,col 9)",
        "(line 1191,col 9)-(line 1250,col 9)",
        "(line 1252,col 9)-(line 1256,col 9)",
        "(line 1259,col 9)-(line 1259,col 30)",
        "(line 1263,col 9)-(line 1275,col 9)",
        "(line 1278,col 9)-(line 1278,col 38)",
        "(line 1279,col 9)-(line 1279,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.printer()",
      "begin_line": 1294,
      "end_line": 1296,
      "comment": "\n     * Prints to the {@link System#out}.\n     *\n     * \u003cp\u003e\n     * See also {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @return a printer to {@link System#out}.\n     * @throws IOException\n     *             thrown if the optional header cannot be printed.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 1295,col 9)-(line 1295,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.println(java.lang.Appendable)",
      "begin_line": 1307,
      "end_line": 1314,
      "comment": "\n     * Outputs the trailing delimiter (if set) followed by the record separator (if set).\n     *\n     * @param out\n     *            where to write\n     * @throws IOException\n     *             If an I/O error occurs\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 1308,col 9)-(line 1310,col 9)",
        "(line 1311,col 9)-(line 1313,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.printRecord(java.lang.Appendable, java.lang.Object...)",
      "begin_line": 1333,
      "end_line": 1338,
      "comment": "\n     * Prints the given {@code values} to {@code out} as a single record of delimiter separated values followed by the\n     * record separator.\n     *\n     * \u003cp\u003e\n     * The values will be quoted if needed. Quotes and new-line characters will be escaped. This method adds the record\n     * separator to the output after printing the record, so there is no need to call {@link #println(Appendable)}.\n     * \u003c/p\u003e\n     *\n     * @param out\n     *            where to write.\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 1334,col 9)-(line 1336,col 9)",
        "(line 1337,col 9)-(line 1337,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.toString()",
      "begin_line": 1340,
      "end_line": 1383,
      "comment": "",
      "child_ranges": [
        "(line 1342,col 9)-(line 1342,col 53)",
        "(line 1343,col 9)-(line 1343,col 63)",
        "(line 1344,col 9)-(line 1347,col 9)",
        "(line 1348,col 9)-(line 1351,col 9)",
        "(line 1352,col 9)-(line 1355,col 9)",
        "(line 1356,col 9)-(line 1359,col 9)",
        "(line 1360,col 9)-(line 1363,col 9)",
        "(line 1364,col 9)-(line 1366,col 9)",
        "(line 1367,col 9)-(line 1369,col 9)",
        "(line 1370,col 9)-(line 1372,col 9)",
        "(line 1373,col 9)-(line 1373,col 65)",
        "(line 1374,col 9)-(line 1377,col 9)",
        "(line 1378,col 9)-(line 1381,col 9)",
        "(line 1382,col 9)-(line 1382,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.toStringArray(java.lang.Object[])",
      "begin_line": 1385,
      "end_line": 1395,
      "comment": "",
      "child_ranges": [
        "(line 1386,col 9)-(line 1388,col 9)",
        "(line 1389,col 9)-(line 1389,col 59)",
        "(line 1390,col 9)-(line 1393,col 9)",
        "(line 1394,col 9)-(line 1394,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.trim(java.lang.CharSequence)",
      "begin_line": 1397,
      "end_line": 1412,
      "comment": "",
      "child_ranges": [
        "(line 1398,col 9)-(line 1400,col 9)",
        "(line 1401,col 9)-(line 1401,col 48)",
        "(line 1402,col 9)-(line 1402,col 24)",
        "(line 1403,col 9)-(line 1403,col 20)",
        "(line 1405,col 9)-(line 1407,col 9)",
        "(line 1408,col 9)-(line 1410,col 9)",
        "(line 1411,col 9)-(line 1411,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.validate()",
      "begin_line": 1419,
      "end_line": 1463,
      "comment": "\n     * Verifies the consistency of the parameters and throws an IllegalArgumentException if necessary.\n     *\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 1420,col 9)-(line 1422,col 9)",
        "(line 1424,col 9)-(line 1427,col 9)",
        "(line 1429,col 9)-(line 1432,col 9)",
        "(line 1434,col 9)-(line 1437,col 9)",
        "(line 1439,col 9)-(line 1442,col 9)",
        "(line 1444,col 9)-(line 1447,col 9)",
        "(line 1449,col 9)-(line 1451,col 9)",
        "(line 1454,col 9)-(line 1462,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withAllowMissingColumnNames()",
      "begin_line": 1472,
      "end_line": 1474,
      "comment": "\n     * Returns a new {@code CSVFormat} with the missing column names behavior of the format set to {@code true}\n     *\n     * @return A new CSVFormat that is equal to this but with the specified missing column names behavior.\n     * @see #withAllowMissingColumnNames(boolean)\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1473,col 9)-(line 1473,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withAllowMissingColumnNames(boolean)",
      "begin_line": 1484,
      "end_line": 1488,
      "comment": "\n     * Returns a new {@code CSVFormat} with the missing column names behavior of the format set to the given value.\n     *\n     * @param allowMissingColumnNames\n     *            the missing column names behavior, {@code true} to allow missing column names in the header line,\n     *            {@code false} to cause an {@link IllegalArgumentException} to be thrown.\n     * @return A new CSVFormat that is equal to this but with the specified missing column names behavior.\n     ",
      "child_ranges": [
        "(line 1485,col 9)-(line 1487,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withAutoFlush(boolean)",
      "begin_line": 1499,
      "end_line": 1503,
      "comment": "\n     * Returns a new {@code CSVFormat} with whether to flush on close.\n     *\n     * @param autoFlush\n     *            whether to flush on close.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified autoFlush setting.\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 1500,col 9)-(line 1502,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withCommentMarker(char)",
      "begin_line": 1516,
      "end_line": 1518,
      "comment": "\n     * Returns a new {@code CSVFormat} with the comment start marker of the format set to the specified character.\n     *\n     * Note that the comment start character is only recognized at the start of a line.\n     *\n     * @param commentMarker\n     *            the comment start marker\n     * @return A new CSVFormat that is equal to this one but with the specified character as the comment start marker\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 1517,col 9)-(line 1517,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withCommentMarker(java.lang.Character)",
      "begin_line": 1531,
      "end_line": 1538,
      "comment": "\n     * Returns a new {@code CSVFormat} with the comment start marker of the format set to the specified character.\n     *\n     * Note that the comment start character is only recognized at the start of a line.\n     *\n     * @param commentMarker\n     *            the comment start marker, use {@code null} to disable\n     * @return A new CSVFormat that is equal to this one but with the specified character as the comment start marker\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 1532,col 9)-(line 1534,col 9)",
        "(line 1535,col 9)-(line 1537,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withDelimiter(char)",
      "begin_line": 1549,
      "end_line": 1556,
      "comment": "\n     * Returns a new {@code CSVFormat} with the delimiter of the format set to the specified character.\n     *\n     * @param delimiter\n     *            the delimiter character\n     * @return A new CSVFormat that is equal to this with the specified character as delimiter\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 1550,col 9)-(line 1552,col 9)",
        "(line 1553,col 9)-(line 1555,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withEscape(char)",
      "begin_line": 1567,
      "end_line": 1569,
      "comment": "\n     * Returns a new {@code CSVFormat} with the escape character of the format set to the specified character.\n     *\n     * @param escape\n     *            the escape character\n     * @return A new CSVFormat that is equal to his but with the specified character as the escape character\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 1568,col 9)-(line 1568,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withEscape(java.lang.Character)",
      "begin_line": 1580,
      "end_line": 1587,
      "comment": "\n     * Returns a new {@code CSVFormat} with the escape character of the format set to the specified character.\n     *\n     * @param escape\n     *            the escape character, use {@code null} to disable\n     * @return A new CSVFormat that is equal to this but with the specified character as the escape character\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 1581,col 9)-(line 1583,col 9)",
        "(line 1584,col 9)-(line 1586,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withFirstRecordAsHeader()",
      "begin_line": 1605,
      "end_line": 1607,
      "comment": "\n     * Returns a new {@code CSVFormat} using the first record as header.\n     *\n     * \u003cp\u003e\n     * Calling this method is equivalent to calling:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aFormat.withHeader().withSkipHeaderRecord();\n     * \u003c/pre\u003e\n     *\n     * @return A new CSVFormat that is equal to this but using the first record as header.\n     * @see #withSkipHeaderRecord(boolean)\n     * @see #withHeader(String...)\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1606,col 9)-(line 1606,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeader(java.lang.Class\u003c? extends java.lang.Enum\u003c?\u003e\u003e)",
      "begin_line": 1635,
      "end_line": 1645,
      "comment": "\n     * Returns a new {@code CSVFormat} with the header of the format defined by the enum class.\n     *\n     * \u003cp\u003e\n     * Example:\n     * \u003c/p\u003e\n     * \u003cpre\u003e\n     * public enum Header {\n     *     Name, Email, Phone\n     * }\n     *\n     * CSVFormat format \u003d aformat.withHeader(Header.class);\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * The header is also used by the {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param headerEnum\n     *            the enum defining the header, {@code null} if disabled, empty if parsed automatically, user specified\n     *            otherwise.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @see #withHeader(String...)\n     * @see #withSkipHeaderRecord(boolean)\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1636,col 9)-(line 1636,col 31)",
        "(line 1637,col 9)-(line 1643,col 9)",
        "(line 1644,col 9)-(line 1644,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeader(java.sql.ResultSet)",
      "begin_line": 1673,
      "end_line": 1675,
      "comment": "\n     * Returns a new {@code CSVFormat} with the header of the format set from the result set metadata. The header can\n     * either be parsed automatically from the input file with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader();\n     * \u003c/pre\u003e\n     *\n     * or specified manually with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader(resultSet);\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * The header is also used by the {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param resultSet\n     *            the resultSet for the header, {@code null} if disabled, empty if parsed automatically, user specified\n     *            otherwise.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @throws SQLException\n     *             SQLException if a database access error occurs or this method is called on a closed result set.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1674,col 9)-(line 1674,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeader(java.sql.ResultSetMetaData)",
      "begin_line": 1703,
      "end_line": 1713,
      "comment": "\n     * Returns a new {@code CSVFormat} with the header of the format set from the result set metadata. The header can\n     * either be parsed automatically from the input file with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader();\n     * \u003c/pre\u003e\n     *\n     * or specified manually with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader(metaData);\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * The header is also used by the {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param metaData\n     *            the metaData for the header, {@code null} if disabled, empty if parsed automatically, user specified\n     *            otherwise.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @throws SQLException\n     *             SQLException if a database access error occurs or this method is called on a closed result set.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1704,col 9)-(line 1704,col 31)",
        "(line 1705,col 9)-(line 1711,col 9)",
        "(line 1712,col 9)-(line 1712,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeader(java.lang.String...)",
      "begin_line": 1738,
      "end_line": 1742,
      "comment": "\n     * Returns a new {@code CSVFormat} with the header of the format set to the given values. The header can either be\n     * parsed automatically from the input file with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader();\n     * \u003c/pre\u003e\n     *\n     * or specified manually with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader(\u0026quot;name\u0026quot;, \u0026quot;email\u0026quot;, \u0026quot;phone\u0026quot;);\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * The header is also used by the {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param header\n     *            the header, {@code null} if disabled, empty if parsed automatically, user specified otherwise.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @see #withSkipHeaderRecord(boolean)\n     ",
      "child_ranges": [
        "(line 1739,col 9)-(line 1741,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeaderComments(java.lang.Object...)",
      "begin_line": 1759,
      "end_line": 1763,
      "comment": "\n     * Returns a new {@code CSVFormat} with the header comments of the format set to the given values. The comments will\n     * be printed first, before the headers. This setting is ignored by the parser.\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeaderComments(\u0026quot;Generated by Apache Commons CSV 1.1.\u0026quot;, new Date());\n     * \u003c/pre\u003e\n     *\n     * @param headerComments\n     *            the headerComments which will be printed by the Printer before the actual CSV data.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @see #withSkipHeaderRecord(boolean)\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1760,col 9)-(line 1762,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreEmptyLines()",
      "begin_line": 1772,
      "end_line": 1774,
      "comment": "\n     * Returns a new {@code CSVFormat} with the empty line skipping behavior of the format set to {@code true}.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified empty line skipping behavior.\n     * @since {@link #withIgnoreEmptyLines(boolean)}\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1773,col 9)-(line 1773,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreEmptyLines(boolean)",
      "begin_line": 1784,
      "end_line": 1788,
      "comment": "\n     * Returns a new {@code CSVFormat} with the empty line skipping behavior of the format set to the given value.\n     *\n     * @param ignoreEmptyLines\n     *            the empty line skipping behavior, {@code true} to ignore the empty lines between the records,\n     *            {@code false} to translate empty lines to empty records.\n     * @return A new CSVFormat that is equal to this but with the specified empty line skipping behavior.\n     ",
      "child_ranges": [
        "(line 1785,col 9)-(line 1787,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreHeaderCase()",
      "begin_line": 1797,
      "end_line": 1799,
      "comment": "\n     * Returns a new {@code CSVFormat} with the header ignore case behavior set to {@code true}.\n     *\n     * @return A new CSVFormat that will ignore case header name.\n     * @see #withIgnoreHeaderCase(boolean)\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1798,col 9)-(line 1798,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreHeaderCase(boolean)",
      "begin_line": 1810,
      "end_line": 1814,
      "comment": "\n     * Returns a new {@code CSVFormat} with whether header names should be accessed ignoring case.\n     *\n     * @param ignoreHeaderCase\n     *            the case mapping behavior, {@code true} to access name/values, {@code false} to leave the mapping as\n     *            is.\n     * @return A new CSVFormat that will ignore case header name if specified as {@code true}\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1811,col 9)-(line 1813,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreSurroundingSpaces()",
      "begin_line": 1823,
      "end_line": 1825,
      "comment": "\n     * Returns a new {@code CSVFormat} with the trimming behavior of the format set to {@code true}.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified trimming behavior.\n     * @see #withIgnoreSurroundingSpaces(boolean)\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1824,col 9)-(line 1824,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreSurroundingSpaces(boolean)",
      "begin_line": 1835,
      "end_line": 1839,
      "comment": "\n     * Returns a new {@code CSVFormat} with the trimming behavior of the format set to the given value.\n     *\n     * @param ignoreSurroundingSpaces\n     *            the trimming behavior, {@code true} to remove the surrounding spaces, {@code false} to leave the\n     *            spaces as is.\n     * @return A new CSVFormat that is equal to this but with the specified trimming behavior.\n     ",
      "child_ranges": [
        "(line 1836,col 9)-(line 1838,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withNullString(java.lang.String)",
      "begin_line": 1854,
      "end_line": 1858,
      "comment": "\n     * Returns a new {@code CSVFormat} with conversions to and from null for strings on input and output.\n     * \u003cul\u003e\n     * \u003cli\u003e\u003cstrong\u003eReading:\u003c/strong\u003e Converts strings equal to the given {@code nullString} to {@code null} when reading\n     * records.\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eWriting:\u003c/strong\u003e Writes {@code null} as the given {@code nullString} when writing records.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param nullString\n     *            the String to convert to and from {@code null}. No substitution occurs if {@code null}\n     *\n     * @return A new CSVFormat that is equal to this but with the specified null conversion string.\n     ",
      "child_ranges": [
        "(line 1855,col 9)-(line 1857,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withQuote(char)",
      "begin_line": 1869,
      "end_line": 1871,
      "comment": "\n     * Returns a new {@code CSVFormat} with the quoteChar of the format set to the specified character.\n     *\n     * @param quoteChar\n     *            the quoteChar character\n     * @return A new CSVFormat that is equal to this but with the specified character as quoteChar\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 1870,col 9)-(line 1870,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withQuote(java.lang.Character)",
      "begin_line": 1882,
      "end_line": 1889,
      "comment": "\n     * Returns a new {@code CSVFormat} with the quoteChar of the format set to the specified character.\n     *\n     * @param quoteChar\n     *            the quoteChar character, use {@code null} to disable\n     * @return A new CSVFormat that is equal to this but with the specified character as quoteChar\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 1883,col 9)-(line 1885,col 9)",
        "(line 1886,col 9)-(line 1888,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withQuoteMode(org.apache.commons.csv.QuoteMode)",
      "begin_line": 1899,
      "end_line": 1903,
      "comment": "\n     * Returns a new {@code CSVFormat} with the output quote policy of the format set to the specified value.\n     *\n     * @param quoteModePolicy\n     *            the quote policy to use for output.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified quote policy\n     ",
      "child_ranges": [
        "(line 1900,col 9)-(line 1902,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withRecordSeparator(char)",
      "begin_line": 1918,
      "end_line": 1920,
      "comment": "\n     * Returns a new {@code CSVFormat} with the record separator of the format set to the specified character.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eNote:\u003c/strong\u003e This setting is only used during printing and does not affect parsing. Parsing currently\n     * only works for inputs with \u0027\\n\u0027, \u0027\\r\u0027 and \"\\r\\n\"\n     * \u003c/p\u003e\n     *\n     * @param recordSeparator\n     *            the record separator to use for output.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified output record separator\n     ",
      "child_ranges": [
        "(line 1919,col 9)-(line 1919,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withRecordSeparator(java.lang.String)",
      "begin_line": 1937,
      "end_line": 1941,
      "comment": "\n     * Returns a new {@code CSVFormat} with the record separator of the format set to the specified String.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eNote:\u003c/strong\u003e This setting is only used during printing and does not affect parsing. Parsing currently\n     * only works for inputs with \u0027\\n\u0027, \u0027\\r\u0027 and \"\\r\\n\"\n     * \u003c/p\u003e\n     *\n     * @param recordSeparator\n     *            the record separator to use for output.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified output record separator\n     * @throws IllegalArgumentException\n     *             if recordSeparator is none of CR, LF or CRLF\n     ",
      "child_ranges": [
        "(line 1938,col 9)-(line 1940,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withSkipHeaderRecord()",
      "begin_line": 1951,
      "end_line": 1953,
      "comment": "\n     * Returns a new {@code CSVFormat} with skipping the header record set to {@code true}.\n     *\n     * @return A new CSVFormat that is equal to this but with the the specified skipHeaderRecord setting.\n     * @see #withSkipHeaderRecord(boolean)\n     * @see #withHeader(String...)\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1952,col 9)-(line 1952,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withSkipHeaderRecord(boolean)",
      "begin_line": 1964,
      "end_line": 1968,
      "comment": "\n     * Returns a new {@code CSVFormat} with whether to skip the header record.\n     *\n     * @param skipHeaderRecord\n     *            whether to skip the header record.\n     *\n     * @return A new CSVFormat that is equal to this but with the the specified skipHeaderRecord setting.\n     * @see #withHeader(String...)\n     ",
      "child_ranges": [
        "(line 1965,col 9)-(line 1967,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withSystemRecordSeparator()",
      "begin_line": 1982,
      "end_line": 1984,
      "comment": "\n     * Returns a new {@code CSVFormat} with the record separator of the format set to the operating system\u0027s line\n     * separator string, typically CR+LF on Windows and LF on Linux.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eNote:\u003c/strong\u003e This setting is only used during printing and does not affect parsing. Parsing currently\n     * only works for inputs with \u0027\\n\u0027, \u0027\\r\u0027 and \"\\r\\n\"\n     * \u003c/p\u003e\n     *\n     * @return A new CSVFormat that is equal to this but with the operating system\u0027s line separator string.\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 1983,col 9)-(line 1983,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withTrailingDelimiter()",
      "begin_line": 1992,
      "end_line": 1994,
      "comment": "\n     * Returns a new {@code CSVFormat} to add a trailing delimiter.\n     *\n     * @return A new CSVFormat that is equal to this but with the trailing delimiter setting.\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1993,col 9)-(line 1993,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withTrailingDelimiter(boolean)",
      "begin_line": 2005,
      "end_line": 2009,
      "comment": "\n     * Returns a new {@code CSVFormat} with whether to add a trailing delimiter.\n     *\n     * @param trailingDelimiter\n     *            whether to add a trailing delimiter.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified trailing delimiter setting.\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 2006,col 9)-(line 2008,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withTrim()",
      "begin_line": 2017,
      "end_line": 2019,
      "comment": "\n     * Returns a new {@code CSVFormat} to trim leading and trailing blanks.\n     *\n     * @return A new CSVFormat that is equal to this but with the trim setting on.\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 2018,col 9)-(line 2018,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withTrim(boolean)",
      "begin_line": 2030,
      "end_line": 2034,
      "comment": "\n     * Returns a new {@code CSVFormat} with whether to trim leading and trailing blanks.\n     *\n     * @param trim\n     *            whether to trim leading and trailing blanks.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified trim setting.\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 2031,col 9)-(line 2033,col 113)"
      ]
    }
  ]
}