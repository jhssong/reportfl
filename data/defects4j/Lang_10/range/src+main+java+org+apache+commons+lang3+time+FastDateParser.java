{
  "filepath": "/tmp/Lang-10b/src/main/java/org/apache/commons/lang3/time/FastDateParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateParser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.DateParser",
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 876,
      "comment": "\n * \u003cp\u003eFastDateParser is a fast and thread-safe version of\n * {@link java.text.SimpleDateFormat}.\u003c/p\u003e\n *\n * \u003cp\u003eThis class can be used as a direct replacement for\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e in most parsing situations.\n * This class is especially useful in multi-threaded server environments.\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e is not thread-safe in any JDK version,\n * nor will it be as Sun have closed the\n * \u003ca href\u003d\"http://bugs.sun.com/bugdatabase/view_bug.do?bug_id\u003d4228335\"\u003ebug\u003c/a\u003e/RFE.\n * \u003c/p\u003e\n *\n * \u003cp\u003eOnly parsing is supported, but all patterns are compatible with\n * SimpleDateFormat.\u003c/p\u003e\n *\n * \u003cp\u003eTiming tests indicate this class is as about as fast as SimpleDateFormat\n * in single thread applications and about 25% faster in multi-thread applications.\u003c/p\u003e\n *\n * \u003cp\u003eNote that the code only handles Gregorian calendars. The following non-Gregorian\n * calendars use SimpleDateFormat internally, and so will be slower:\n * \u003cul\u003e\n * \u003cli\u003eja_JP_TH - Japanese Imperial\u003c/li\u003e\n * \u003cli\u003eth_TH (any variant) - Thai Buddhist\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Required for serialization support.\n     *\n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tzsCache"
      ],
      "begin_line": 76,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "JAPANESE_IMPERIAL"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " defining fields"
    },
    {
      "type": "field",
      "varNames": [
        "timeZone"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parsePattern"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " derived fields"
    },
    {
      "type": "field",
      "varNames": [
        "strategies"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "thisYear"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameValues"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentFormatField"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " dynamic fields to communicate with Strategy"
    },
    {
      "type": "field",
      "varNames": [
        "nextStrategy"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.FastDateParser(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 104,
      "end_line": 109,
      "comment": "\n     * \u003cp\u003eConstructs a new FastDateParser.\u003c/p\u003e\n     *\n     * @param pattern non-null {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone non-null time zone to use\n     * @param locale non-null locale\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 31)",
        "(line 106,col 9)-(line 106,col 33)",
        "(line 107,col 9)-(line 107,col 29)",
        "(line 108,col 9)-(line 108,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.init()",
      "begin_line": 115,
      "end_line": 150,
      "comment": "\n     * Initialize derived fields from defining fields.\n     * This is called from constructor and from readObject (de-serialization)\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 76)",
        "(line 118,col 9)-(line 118,col 65)",
        "(line 120,col 9)-(line 120,col 49)",
        "(line 121,col 9)-(line 121,col 61)",
        "(line 123,col 9)-(line 123,col 63)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 128,col 9)-(line 128,col 51)",
        "(line 129,col 9)-(line 129,col 66)",
        "(line 130,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 33)",
        "(line 148,col 9)-(line 148,col 70)",
        "(line 149,col 9)-(line 149,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getPattern()",
      "begin_line": 157,
      "end_line": 160,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#getPattern()\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getTimeZone()",
      "begin_line": 165,
      "end_line": 168,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#getTimeZone()\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getLocale()",
      "begin_line": 173,
      "end_line": 176,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#getLocale()\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getParsePattern()",
      "begin_line": 179,
      "end_line": 181,
      "comment": " Give access to generated pattern for test code",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.equals(java.lang.Object)",
      "begin_line": 191,
      "end_line": 200,
      "comment": "\n     * \u003cp\u003eCompare another object for equality with this object.\u003c/p\u003e\n     *\n     * @param obj  the object to compare to\n     * @return \u003ccode\u003etrue\u003c/code\u003eif equal to this instance\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 52)",
        "(line 197,col 9)-(line 199,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.hashCode()",
      "begin_line": 207,
      "end_line": 210,
      "comment": "\n     * \u003cp\u003eReturn a hashcode compatible with equals.\u003c/p\u003e\n     *\n     * @return a hashcode compatible with equals\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.toString()",
      "begin_line": 217,
      "end_line": 220,
      "comment": "\n     * \u003cp\u003eGet a string version of this formatter.\u003c/p\u003e\n     *\n     * @return a debugging string\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.readObject(java.io.ObjectInputStream)",
      "begin_line": 232,
      "end_line": 235,
      "comment": "\n     * Create the object after serialization. This implementation reinitializes the\n     * transient properties.\n     *\n     * @param in ObjectInputStream from which the object is being deserialized.\n     * @throws IOException if there is an IO issue.\n     * @throws ClassNotFoundException if a class cannot be found.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 31)",
        "(line 234,col 9)-(line 234,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.parseObject(java.lang.String)",
      "begin_line": 240,
      "end_line": 243,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#parseObject(java.lang.String)\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.parse(java.lang.String)",
      "begin_line": 248,
      "end_line": 261,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#parse(java.lang.String)\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 55)",
        "(line 251,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 266,
      "end_line": 269,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#parseObject(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 274,
      "end_line": 291,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#parse(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 35)",
        "(line 277,col 9)-(line 277,col 72)",
        "(line 278,col 9)-(line 280,col 9)",
        "(line 282,col 9)-(line 282,col 61)",
        "(line 283,col 9)-(line 283,col 20)",
        "(line 285,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 43)",
        "(line 290,col 9)-(line 290,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.escapeRegex(java.lang.StringBuilder, java.lang.String, boolean)",
      "begin_line": 303,
      "end_line": 343,
      "comment": "\n     * Escape constant fields into regular expression\n     * @param regex The destination regex\n     * @param value The source field\n     * @param unquote If true, replace two success quotes (\u0027\u0027) with single quote (\u0027)\n     * @return The \u003ccode\u003eStringBuilder\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 32)",
        "(line 305,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 342,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeyValue",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 348,
      "end_line": 361,
      "comment": "\n     * A class to store Key / Value pairs\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 349,
      "end_line": 349,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.KeyValue.KeyValue(java.lang.String, int)",
      "begin_line": 357,
      "end_line": 360,
      "comment": "\n         * Construct a Key / Value pair\n         * @param key The key\n         * @param value The value\n         ",
      "child_ranges": [
        "(line 358,col 13)-(line 358,col 26)",
        "(line 359,col 13)-(line 359,col 30)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "IGNORE_CASE_COMPARATOR"
      ],
      "begin_line": 366,
      "end_line": 371,
      "comment": "\n     * ignore case comparison of keys\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Anonymous-23425b08-2a8e-4ac6-aee4-84a0d00a3c9d.compare(org.apache.commons.lang3.time.FastDateParser.KeyValue, org.apache.commons.lang3.time.FastDateParser.KeyValue)",
      "begin_line": 367,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 369,col 13)-(line 369,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getDisplayNames(int)",
      "begin_line": 378,
      "end_line": 412,
      "comment": "\n     * Get the short and long values displayed for a field\n     * @param field The field of interest\n     * @return A sorted array of the field key / value pairs\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 50)",
        "(line 380,col 9)-(line 380,col 60)",
        "(line 381,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.toArray(java.util.Map\u003cjava.lang.String, java.lang.Integer\u003e)",
      "begin_line": 414,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 47)",
        "(line 416,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.createKeyValues(java.lang.String[], java.lang.String[])",
      "begin_line": 433,
      "end_line": 438,
      "comment": "\n     * Create key / value pairs from keys\n     * @param longValues The allowable long names for a field\n     * @param shortValues The optional allowable short names for a field\n     * @return The sorted name / value pairs for the field\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 86)",
        "(line 435,col 9)-(line 435,col 79)",
        "(line 436,col 9)-(line 436,col 60)",
        "(line 437,col 9)-(line 437,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.count(java.lang.String[])",
      "begin_line": 445,
      "end_line": 455,
      "comment": "\n     * Get a count of valid values in array.  A valid value is of non-zero length.\n     * @param values The values to check.  This parameter may be null\n     * @return The number of valid values\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 21)",
        "(line 447,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 454,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.copy(org.apache.commons.lang3.time.FastDateParser.KeyValue[], int, java.lang.String[])",
      "begin_line": 464,
      "end_line": 474,
      "comment": "\n     * Create key / value pairs from values\n     * @param fieldKeyValues The destination array\n     * @param offset The offset into the destination array\n     * @param values The values to use to create key / value pairs.  This parameter may be null.\n     * @return The offset into the destination array\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.adjustYear(int)",
      "begin_line": 481,
      "end_line": 487,
      "comment": "\n     * Adjust dates to be within 80 years before and 20 years after instantiation\n     * @param twoDigitYear The year to adjust\n     * @return A value within -80 and +20 years from instantiation of this instance\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 58)",
        "(line 483,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.isNextNumber()",
      "begin_line": 493,
      "end_line": 495,
      "comment": "\n     * Is the next field a number?\n     * @return true, if next field will be a number\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getFieldWidth()",
      "begin_line": 501,
      "end_line": 503,
      "comment": "\n     * What is the width of the current field?\n     * @return The number of characters in the current format field\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Strategy",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 508,
      "end_line": 530,
      "comment": "\n     * A strategy to parse a single field from the parsing pattern\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Strategy.isNumber()",
      "begin_line": 513,
      "end_line": 513,
      "comment": "\n         * Is this field a number?\n         * @return true, if field is a number\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Strategy.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 520,
      "end_line": 520,
      "comment": "\n         * Set the Calendar with the parsed field\n         * @param parser The parser calling this strategy\n         * @param cal The \u003ccode\u003eCalendar\u003c/code\u003e to set\n         * @param value The parsed field to translate and set in cal\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Strategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 529,
      "end_line": 529,
      "comment": "\n         * Generate a \u003ccode\u003ePattern\u003c/code\u003e regular expression to the \u003ccode\u003eStringBuilder\u003c/code\u003e\n         * which will accept this field\n         * @param parser The parser calling this strategy\n         * @param regex The \u003ccode\u003eStringBuilder\u003c/code\u003e to append to\n         * @return true, if this field will set the calendar;\n         * false, if this field is a constant value\n         ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "formatPattern"
      ],
      "begin_line": 535,
      "end_line": 536,
      "comment": "\n     * A \u003ccode\u003ePattern\u003c/code\u003e to parse the user supplied SimpleDateFormat pattern\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getStrategy(java.lang.String)",
      "begin_line": 543,
      "end_line": 600,
      "comment": "\n     * Obtain a Strategy given a field from a SimpleDateFormat pattern\n     * @param formatField A sub-sequence of the SimpleDateFormat pattern\n     * @return The Strategy that will handle parsing for the field\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 591,col 51)",
        "(line 592,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 599,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CopyQuotedStrategy",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateParser.Strategy"
      ],
      "begin_line": 605,
      "end_line": 643,
      "comment": "\n     * A strategy that copies the static or quoted field in the parsing pattern\n     "
    },
    {
      "type": "field",
      "varNames": [
        "formatField"
      ],
      "begin_line": 606,
      "end_line": 606,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.CopyQuotedStrategy.CopyQuotedStrategy(java.lang.String)",
      "begin_line": 612,
      "end_line": 614,
      "comment": "\n         * Construct a Strategy that ensures the formatField has literal text\n         * @param formatField The literal text to match\n         ",
      "child_ranges": [
        "(line 613,col 13)-(line 613,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.CopyQuotedStrategy.isNumber()",
      "begin_line": 619,
      "end_line": 626,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 621,col 13)-(line 621,col 42)",
        "(line 622,col 13)-(line 624,col 13)",
        "(line 625,col 13)-(line 625,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.CopyQuotedStrategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 631,
      "end_line": 635,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 633,col 13)-(line 633,col 50)",
        "(line 634,col 13)-(line 634,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.CopyQuotedStrategy.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 640,
      "end_line": 642,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "TextStrategy",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateParser.Strategy"
      ],
      "begin_line": 648,
      "end_line": 698,
      "comment": "\n     * A strategy that handles a text field in the parsing pattern\n     "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 649,
      "end_line": 649,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TextStrategy.TextStrategy(int)",
      "begin_line": 655,
      "end_line": 657,
      "comment": "\n         * Construct a Strategy that parses a Text field\n         * @param field The Calendar field\n         ",
      "child_ranges": [
        "(line 656,col 13)-(line 656,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TextStrategy.isNumber()",
      "begin_line": 662,
      "end_line": 665,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 664,col 13)-(line 664,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TextStrategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 670,
      "end_line": 678,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 672,col 13)-(line 672,col 30)",
        "(line 673,col 13)-(line 675,col 13)",
        "(line 676,col 13)-(line 676,col 51)",
        "(line 677,col 13)-(line 677,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TextStrategy.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 683,
      "end_line": 697,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 685,col 13)-(line 685,col 68)",
        "(line 686,col 13)-(line 686,col 105)",
        "(line 687,col 13)-(line 695,col 13)",
        "(line 696,col 13)-(line 696,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NumberStrategy",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateParser.Strategy"
      ],
      "begin_line": 703,
      "end_line": 752,
      "comment": "\n     * A strategy that handles a number field in the parsing pattern\n     "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 704,
      "end_line": 704,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.NumberStrategy(int)",
      "begin_line": 710,
      "end_line": 712,
      "comment": "\n         * Construct a Strategy that parses a Number field\n         * @param field The Calendar field\n         ",
      "child_ranges": [
        "(line 711,col 14)-(line 711,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.isNumber()",
      "begin_line": 717,
      "end_line": 720,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 719,col 13)-(line 719,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 725,
      "end_line": 734,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 727,col 13)-(line 732,col 13)",
        "(line 733,col 13)-(line 733,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 739,
      "end_line": 742,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 741,col 13)-(line 741,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.modify(int)",
      "begin_line": 749,
      "end_line": 751,
      "comment": "\n         * Make any modifications to parsed integer\n         * @param iValue The parsed integer\n         * @return The modified value\n         ",
      "child_ranges": [
        "(line 750,col 13)-(line 750,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ABBREVIATED_YEAR_STRATEGY"
      ],
      "begin_line": 754,
      "end_line": 766,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Anonymous-7ef0148c-364f-4517-9eaf-af3d3f4873d6.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 758,
      "end_line": 765,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 760,col 13)-(line 760,col 48)",
        "(line 761,col 13)-(line 763,col 13)",
        "(line 764,col 13)-(line 764,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneStrategy",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateParser.Strategy"
      ],
      "begin_line": 771,
      "end_line": 839,
      "comment": "\n     * A strategy that handles a timezone field in the parsing pattern\n     "
    },
    {
      "type": "field",
      "varNames": [
        "validTimeZoneChars"
      ],
      "begin_line": 773,
      "end_line": 773,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tzNames"
      ],
      "begin_line": 774,
      "end_line": 774,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy.TimeZoneStrategy(java.util.Locale)",
      "begin_line": 780,
      "end_line": 800,
      "comment": "\n         * Construct a Strategy that parses a TimeZone\n         * @param locale The Locale\n         ",
      "child_ranges": [
        "(line 781,col 13)-(line 792,col 13)",
        "(line 793,col 13)-(line 793,col 50)",
        "(line 794,col 13)-(line 794,col 72)",
        "(line 795,col 13)-(line 797,col 13)",
        "(line 798,col 13)-(line 798,col 45)",
        "(line 799,col 13)-(line 799,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy.isNumber()",
      "begin_line": 805,
      "end_line": 808,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 807,col 13)-(line 807,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 813,
      "end_line": 817,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 815,col 13)-(line 815,col 45)",
        "(line 816,col 13)-(line 816,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 822,
      "end_line": 838,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 824,col 13)-(line 824,col 24)",
        "(line 825,col 13)-(line 836,col 13)",
        "(line 837,col 13)-(line 837,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ERA_STRATEGY"
      ],
      "begin_line": 842,
      "end_line": 842,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DAY_OF_WEEK_STRATEGY"
      ],
      "begin_line": 843,
      "end_line": 843,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AM_PM_STRATEGY"
      ],
      "begin_line": 844,
      "end_line": 844,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TEXT_MONTH_STRATEGY"
      ],
      "begin_line": 845,
      "end_line": 845,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_MONTH_STRATEGY"
      ],
      "begin_line": 847,
      "end_line": 852,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Anonymous-ea11ad57-8f9a-4e81-bdaa-cfb86b3e6620.modify(int)",
      "begin_line": 848,
      "end_line": 851,
      "comment": "",
      "child_ranges": [
        "(line 850,col 13)-(line 850,col 28)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LITERAL_YEAR_STRATEGY"
      ],
      "begin_line": 853,
      "end_line": 853,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WEEK_OF_YEAR_STRATEGY"
      ],
      "begin_line": 854,
      "end_line": 854,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WEEK_OF_MONTH_STRATEGY"
      ],
      "begin_line": 855,
      "end_line": 855,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DAY_OF_YEAR_STRATEGY"
      ],
      "begin_line": 856,
      "end_line": 856,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DAY_OF_MONTH_STRATEGY"
      ],
      "begin_line": 857,
      "end_line": 857,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DAY_OF_WEEK_IN_MONTH_STRATEGY"
      ],
      "begin_line": 858,
      "end_line": 858,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HOUR_OF_DAY_STRATEGY"
      ],
      "begin_line": 859,
      "end_line": 859,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MODULO_HOUR_OF_DAY_STRATEGY"
      ],
      "begin_line": 860,
      "end_line": 865,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Anonymous-57b29940-979e-47a1-99f9-40127691e71e.modify(int)",
      "begin_line": 861,
      "end_line": 864,
      "comment": "",
      "child_ranges": [
        "(line 863,col 13)-(line 863,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MODULO_HOUR_STRATEGY"
      ],
      "begin_line": 866,
      "end_line": 871,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Anonymous-b2a4516f-122c-485d-ac57-bcec1fa6a0c4.modify(int)",
      "begin_line": 867,
      "end_line": 870,
      "comment": "",
      "child_ranges": [
        "(line 869,col 13)-(line 869,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "HOUR_STRATEGY"
      ],
      "begin_line": 872,
      "end_line": 872,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MINUTE_STRATEGY"
      ],
      "begin_line": 873,
      "end_line": 873,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SECOND_STRATEGY"
      ],
      "begin_line": 874,
      "end_line": 874,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MILLISECOND_STRATEGY"
      ],
      "begin_line": 875,
      "end_line": 875,
      "comment": ""
    }
  ]
}