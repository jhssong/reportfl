{
  "filepath": "/tmp/Lang-11b/src/main/java/org/apache/commons/lang3/time/FastDateParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateParser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.DateParser",
        "java.io.Serializable"
      ],
      "begin_line": 60,
      "end_line": 832,
      "comment": "\n * \u003cp\u003eFastDateParser is a fast and thread-safe version of\n * {@link java.text.SimpleDateFormat}.\u003c/p\u003e\n * \n * \u003cp\u003eThis class can be used as a direct replacement to\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e in most parsing situations.\n * This class is especially useful in multi-threaded server environments.\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e is not thread-safe in any JDK version,\n * nor will it be as Sun have closed the \n * \u003ca href\u003d\"http://bugs.sun.com/bugdatabase/view_bug.do?bug_id\u003d4228335\"\u003ebug\u003c/a\u003e/RFE.\n * \u003c/p\u003e\n *\n * \u003cp\u003eOnly parsing is supported, but all patterns are compatible with\n * SimpleDateFormat.\u003c/p\u003e\n * \n * \u003cp\u003eTiming tests indicate this class is as about as fast as SimpleDateFormat\n * in single thread applications and about 25% faster in multi-thread applications.\u003c/p\u003e\n *\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tzsCache"
      ],
      "begin_line": 68,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " defining fields"
    },
    {
      "type": "field",
      "varNames": [
        "timeZone"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parsePattern"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " derived fields"
    },
    {
      "type": "field",
      "varNames": [
        "strategies"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "thisYear"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameValues"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentFormatField"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " dynamic fields to communicate with Strategy"
    },
    {
      "type": "field",
      "varNames": [
        "nextStrategy"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.FastDateParser(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 94,
      "end_line": 99,
      "comment": "\n     * \u003cp\u003eConstructs a new FastDateParser.\u003c/p\u003e\n     * \n     * @param pattern non-null {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone non-null time zone to use\n     * @param locale non-null locale\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 31)",
        "(line 96,col 9)-(line 96,col 33)",
        "(line 97,col 9)-(line 97,col 29)",
        "(line 98,col 9)-(line 98,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.init()",
      "begin_line": 105,
      "end_line": 140,
      "comment": "\n     * Initialize derived fields from defining fields.\n     * This is called from constructor and from readObject (de-serialization)   \n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 76)",
        "(line 108,col 9)-(line 108,col 65)",
        "(line 110,col 9)-(line 110,col 49)",
        "(line 111,col 9)-(line 111,col 61)",
        "(line 113,col 9)-(line 113,col 63)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 118,col 51)",
        "(line 119,col 9)-(line 119,col 66)",
        "(line 120,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 33)",
        "(line 138,col 9)-(line 138,col 70)",
        "(line 139,col 9)-(line 139,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getPattern()",
      "begin_line": 147,
      "end_line": 150,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#getPattern()\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getTimeZone()",
      "begin_line": 155,
      "end_line": 158,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#getTimeZone()\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getLocale()",
      "begin_line": 163,
      "end_line": 166,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#getLocale()\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.equals(java.lang.Object)",
      "begin_line": 176,
      "end_line": 185,
      "comment": "\n     * \u003cp\u003eCompare another object for equality with this object.\u003c/p\u003e\n     * \n     * @param obj  the object to compare to\n     * @return \u003ccode\u003etrue\u003c/code\u003eif equal to this instance\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 52)",
        "(line 182,col 9)-(line 184,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.hashCode()",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * \u003cp\u003eReturn a hashcode compatible with equals.\u003c/p\u003e\n     * \n     * @return a hashcode compatible with equals\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.toString()",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\n     * \u003cp\u003eGet a string version of this formatter.\u003c/p\u003e\n     * \n     * @return a debugging string\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.readObject(java.io.ObjectInputStream)",
      "begin_line": 217,
      "end_line": 220,
      "comment": "\n     * Create the object after serialization. This implementation reinitializes the \n     * transient properties.\n     *\n     * @param in ObjectInputStream from which the object is being deserialized.\n     * @throws IOException if there is an IO issue.\n     * @throws ClassNotFoundException if a class cannot be found.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 31)",
        "(line 219,col 9)-(line 219,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.parseObject(java.lang.String)",
      "begin_line": 225,
      "end_line": 228,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#parseObject(java.lang.String)\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.parse(java.lang.String)",
      "begin_line": 233,
      "end_line": 240,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#parse(java.lang.String)\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 55)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 245,
      "end_line": 248,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#parseObject(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 253,
      "end_line": 270,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#parse(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 35)",
        "(line 256,col 9)-(line 256,col 72)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 261,col 9)-(line 261,col 61)",
        "(line 262,col 9)-(line 262,col 20)",
        "(line 264,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 43)",
        "(line 269,col 9)-(line 269,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.escapeRegex(java.lang.StringBuilder, java.lang.String, boolean)",
      "begin_line": 282,
      "end_line": 322,
      "comment": "\n     * Escape constant fields into regular expression\n     * @param regex The destination regex\n     * @param value The source field\n     * @param unquote If true, replace two success quotes (\u0027\u0027) with single quote (\u0027)\n     * @return The \u003ccode\u003eStringBuilder\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 32)",
        "(line 284,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 321,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeyValue",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 327,
      "end_line": 340,
      "comment": "\n     * A class to store Key / Value pairs\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 329,
      "end_line": 329,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.KeyValue.KeyValue(java.lang.String, int)",
      "begin_line": 336,
      "end_line": 339,
      "comment": "\n         * Construct a Key / Value pair \n         * @param key The key\n         * @param value The value\n         ",
      "child_ranges": [
        "(line 337,col 13)-(line 337,col 26)",
        "(line 338,col 13)-(line 338,col 30)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "IGNORE_CASE_COMPARATOR"
      ],
      "begin_line": 345,
      "end_line": 350,
      "comment": "\n     * ignore case comparison of keys\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Anonymous-a913ae3e-caa7-4c76-b02f-bcceb6f7a300.compare(org.apache.commons.lang3.time.FastDateParser.KeyValue, org.apache.commons.lang3.time.FastDateParser.KeyValue)",
      "begin_line": 346,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 348,col 13)-(line 348,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getDisplayNames(int)",
      "begin_line": 357,
      "end_line": 383,
      "comment": "\n     * Get the short and long values displayed for a field\n     * @param field The field of interest\n     * @return A sorted array of the field key / value pairs\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 57)",
        "(line 359,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.createKeyValues(java.lang.String[], java.lang.String[])",
      "begin_line": 391,
      "end_line": 396,
      "comment": "\n     * Create key / value pairs from keys \n     * @param longValues The allowable long names for a field\n     * @param shortValues The optional allowable short names for a field\n     * @return The sorted name / value pairs for the field\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 86)",
        "(line 393,col 9)-(line 393,col 79)",
        "(line 394,col 9)-(line 394,col 60)",
        "(line 395,col 9)-(line 395,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.count(java.lang.String[])",
      "begin_line": 403,
      "end_line": 413,
      "comment": "\n     * Get a count of valid values in array.  A valid value is of non-zero length. \n     * @param values The values to check.  This parameter may be null\n     * @return The number of valid values\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 21)",
        "(line 405,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.copy(org.apache.commons.lang3.time.FastDateParser.KeyValue[], int, java.lang.String[])",
      "begin_line": 422,
      "end_line": 432,
      "comment": "\n     * Create key / value pairs from values \n     * @param fieldKeyValues The destination array\n     * @param offset The offset into the destination array \n     * @param values The values to use to create key / value pairs.  This parameter may be null.\n     * @return The offset into the destination array\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.adjustYear(int)",
      "begin_line": 439,
      "end_line": 445,
      "comment": "\n     * Adjust dates to be within 80 years before and 20 years after instantiation\n     * @param twoDigitYear The year to adjust\n     * @return A value within -80 and +20 years from instantiation of this instance\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 58)",
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 444,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.isNextNumber()",
      "begin_line": 451,
      "end_line": 453,
      "comment": "\n     * Is the next field a number?\n     * @return true, if next field will be a number \n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getFieldWidth()",
      "begin_line": 459,
      "end_line": 461,
      "comment": "\n     * What is the width of the current field?\n     * @return The number of characters in the current format field\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Strategy",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 466,
      "end_line": 488,
      "comment": "\n     * A strategy to parse a single field from the parsing pattern\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Strategy.isNumber()",
      "begin_line": 471,
      "end_line": 471,
      "comment": "\n         * Is this field a number?\n         * @return true, if field is a number\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Strategy.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 478,
      "end_line": 478,
      "comment": "\n         * Set the Calendar with the parsed field\n         * @param parser The parser calling this strategy\n         * @param cal The \u003ccode\u003eCalendar\u003c/code\u003e to set\n         * @param value The parsed field to translate and set in cal\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Strategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 487,
      "end_line": 487,
      "comment": "\n         * Generate a \u003ccode\u003ePattern\u003c/code\u003e regular expression to the \u003ccode\u003eStringBuilder\u003c/code\u003e \n         * which will accept this field\n         * @param parser The parser calling this strategy\n         * @param regex The \u003ccode\u003eStringBuilder\u003c/code\u003e to append to\n         * @return true, if this field will set the calendar; \n         * false, if this field is a constant value  \n         ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "formatPattern"
      ],
      "begin_line": 493,
      "end_line": 494,
      "comment": "\n     * A \u003ccode\u003ePattern\u003c/code\u003e to parse the user supplied SimpleDateFormat pattern\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getStrategy(java.lang.String)",
      "begin_line": 501,
      "end_line": 557,
      "comment": "\n     * Obtain a Strategy given a field from a SimpleDateFormat pattern\n     * @param formatField A sub-sequence of the SimpleDateFormat pattern\n     * @return The Strategy that will handle parsing for the field\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 548,col 51)",
        "(line 549,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 556,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CopyQuotedStrategy",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateParser.Strategy"
      ],
      "begin_line": 562,
      "end_line": 600,
      "comment": "\n     * A strategy that copies the static or quoted field in the parsing pattern\n     "
    },
    {
      "type": "field",
      "varNames": [
        "formatField"
      ],
      "begin_line": 563,
      "end_line": 563,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.CopyQuotedStrategy.CopyQuotedStrategy(java.lang.String)",
      "begin_line": 569,
      "end_line": 571,
      "comment": "\n         * Construct a Strategy that ensures the formatField has literal text\n         * @param formatField The literal text to match\n         ",
      "child_ranges": [
        "(line 570,col 13)-(line 570,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.CopyQuotedStrategy.isNumber()",
      "begin_line": 576,
      "end_line": 583,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 578,col 13)-(line 578,col 42)",
        "(line 579,col 13)-(line 581,col 13)",
        "(line 582,col 13)-(line 582,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.CopyQuotedStrategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 588,
      "end_line": 592,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 590,col 13)-(line 590,col 50)",
        "(line 591,col 13)-(line 591,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.CopyQuotedStrategy.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 597,
      "end_line": 599,
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
      "begin_line": 605,
      "end_line": 655,
      "comment": "\n     * A strategy that handles a text field in the parsing pattern\n     "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 606,
      "end_line": 606,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TextStrategy.TextStrategy(int)",
      "begin_line": 612,
      "end_line": 614,
      "comment": "\n         * Construct a Strategy that parses a Text field\n         * @param field The Calendar field\n         ",
      "child_ranges": [
        "(line 613,col 13)-(line 613,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TextStrategy.isNumber()",
      "begin_line": 619,
      "end_line": 622,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 621,col 13)-(line 621,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TextStrategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 627,
      "end_line": 635,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 629,col 13)-(line 629,col 30)",
        "(line 630,col 13)-(line 632,col 13)",
        "(line 633,col 13)-(line 633,col 51)",
        "(line 634,col 13)-(line 634,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TextStrategy.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 640,
      "end_line": 654,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 642,col 13)-(line 642,col 68)",
        "(line 643,col 13)-(line 643,col 105)",
        "(line 644,col 13)-(line 652,col 13)",
        "(line 653,col 13)-(line 653,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NumberStrategy",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateParser.Strategy"
      ],
      "begin_line": 660,
      "end_line": 709,
      "comment": "\n     * A strategy that handles a number field in the parsing pattern\n     "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 661,
      "end_line": 661,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.NumberStrategy(int)",
      "begin_line": 667,
      "end_line": 669,
      "comment": "\n         * Construct a Strategy that parses a Number field\n         * @param field The Calendar field\n         ",
      "child_ranges": [
        "(line 668,col 14)-(line 668,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.isNumber()",
      "begin_line": 674,
      "end_line": 677,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 676,col 13)-(line 676,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 682,
      "end_line": 691,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 684,col 13)-(line 689,col 13)",
        "(line 690,col 13)-(line 690,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 696,
      "end_line": 699,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 698,col 13)-(line 698,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.modify(int)",
      "begin_line": 706,
      "end_line": 708,
      "comment": "\n         * Make any modifications to parsed integer \n         * @param iValue The parsed integer\n         * @return The modified value\n         ",
      "child_ranges": [
        "(line 707,col 13)-(line 707,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ABBREVIATED_YEAR_STRATEGY"
      ],
      "begin_line": 711,
      "end_line": 723,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Anonymous-799fd403-98f5-4921-a85f-05f271a78c1d.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 715,
      "end_line": 722,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 717,col 13)-(line 717,col 48)",
        "(line 718,col 13)-(line 720,col 13)",
        "(line 721,col 13)-(line 721,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneStrategy",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateParser.Strategy"
      ],
      "begin_line": 728,
      "end_line": 796,
      "comment": "\n     * A strategy that handles a timezone field in the parsing pattern\n     "
    },
    {
      "type": "field",
      "varNames": [
        "validTimeZoneChars"
      ],
      "begin_line": 730,
      "end_line": 730,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tzNames"
      ],
      "begin_line": 731,
      "end_line": 731,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy.TimeZoneStrategy(java.util.Locale)",
      "begin_line": 737,
      "end_line": 757,
      "comment": "\n         * Construct a Strategy that parses a TimeZone\n         * @param locale The Locale\n         ",
      "child_ranges": [
        "(line 738,col 13)-(line 749,col 13)",
        "(line 750,col 13)-(line 750,col 50)",
        "(line 751,col 13)-(line 751,col 72)",
        "(line 752,col 13)-(line 754,col 13)",
        "(line 755,col 13)-(line 755,col 45)",
        "(line 756,col 13)-(line 756,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy.isNumber()",
      "begin_line": 762,
      "end_line": 765,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 764,col 13)-(line 764,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 770,
      "end_line": 774,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 772,col 13)-(line 772,col 45)",
        "(line 773,col 13)-(line 773,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 779,
      "end_line": 795,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 781,col 13)-(line 781,col 24)",
        "(line 782,col 13)-(line 793,col 13)",
        "(line 794,col 13)-(line 794,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ERA_STRATEGY"
      ],
      "begin_line": 798,
      "end_line": 798,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DAY_OF_WEEK_STRATEGY"
      ],
      "begin_line": 799,
      "end_line": 799,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AM_PM_STRATEGY"
      ],
      "begin_line": 800,
      "end_line": 800,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TEXT_MONTH_STRATEGY"
      ],
      "begin_line": 801,
      "end_line": 801,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_MONTH_STRATEGY"
      ],
      "begin_line": 803,
      "end_line": 808,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Anonymous-04646199-0f2b-4c72-87a5-67cd69f2a495.modify(int)",
      "begin_line": 804,
      "end_line": 807,
      "comment": "",
      "child_ranges": [
        "(line 806,col 13)-(line 806,col 28)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LITERAL_YEAR_STRATEGY"
      ],
      "begin_line": 809,
      "end_line": 809,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WEEK_OF_YEAR_STRATEGY"
      ],
      "begin_line": 810,
      "end_line": 810,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WEEK_OF_MONTH_STRATEGY"
      ],
      "begin_line": 811,
      "end_line": 811,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DAY_OF_YEAR_STRATEGY"
      ],
      "begin_line": 812,
      "end_line": 812,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DAY_OF_MONTH_STRATEGY"
      ],
      "begin_line": 813,
      "end_line": 813,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DAY_OF_WEEK_IN_MONTH_STRATEGY"
      ],
      "begin_line": 814,
      "end_line": 814,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HOUR_OF_DAY_STRATEGY"
      ],
      "begin_line": 815,
      "end_line": 815,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MODULO_HOUR_OF_DAY_STRATEGY"
      ],
      "begin_line": 816,
      "end_line": 821,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Anonymous-04185852-01ff-4760-b4be-dd3f64524ae2.modify(int)",
      "begin_line": 817,
      "end_line": 820,
      "comment": "",
      "child_ranges": [
        "(line 819,col 13)-(line 819,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MODULO_HOUR_STRATEGY"
      ],
      "begin_line": 822,
      "end_line": 827,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Anonymous-2e8b89e2-f1e2-4a83-bf7d-14eb914e57e6.modify(int)",
      "begin_line": 823,
      "end_line": 826,
      "comment": "",
      "child_ranges": [
        "(line 825,col 13)-(line 825,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "HOUR_STRATEGY"
      ],
      "begin_line": 828,
      "end_line": 828,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MINUTE_STRATEGY"
      ],
      "begin_line": 829,
      "end_line": 829,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SECOND_STRATEGY"
      ],
      "begin_line": 830,
      "end_line": 830,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MILLISECOND_STRATEGY"
      ],
      "begin_line": 831,
      "end_line": 831,
      "comment": ""
    }
  ]
}