{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/Entities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Entities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 938,
      "comment": "\n * \u003cp\u003eProvides HTML and XML entity utilities.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://hotwired.lycos.com/webmonkey/reference/special_characters/\"\u003eISO Entities\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html32#latin1\"\u003eHTML 3.2 Character Entities for ISO Latin-1\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.w3.org/TR/REC-html40/sgml/entities.html\"\u003eHTML 4.0 Character entity references\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#h-5.3\"\u003eHTML 4.01 Character References\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.w3.org/TR/html401/charset.html#code-position\"\u003eHTML 4.01 Code positions\u003c/a\u003e\n *\n * @author \u003ca href\u003d\"mailto:alex@purpletech.com\"\u003eAlexander Day Chaffee\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "BASIC_ARRAY"
      ],
      "begin_line": 40,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "APOS_ARRAY"
      ],
      "begin_line": 47,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ISO8859_1_ARRAY"
      ],
      "begin_line": 52,
      "end_line": 149,
      "comment": " package scoped for testing"
    },
    {
      "type": "field",
      "varNames": [
        "HTML40_ARRAY"
      ],
      "begin_line": 153,
      "end_line": 347,
      "comment": " package scoped for testing"
    },
    {
      "type": "field",
      "varNames": [
        "XML"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": "\n     * \u003cp\u003eThe set of entities supported by standard XML.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "HTML32"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": "\n     * \u003cp\u003eThe set of entities supported by HTML 3.2.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "HTML40"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": "\n     * \u003cp\u003eThe set of entities supported by HTML 4.0.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.fillWithHtml40Entities(org.apache.commons.lang.Entities)",
      "begin_line": 386,
      "end_line": 390,
      "comment": "\n     * \u003cp\u003eFills the specified entities instance with HTML 40 entities.\u003c/p\u003e\n     * \n     * @param entities the instance to be filled.\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 42)",
        "(line 388,col 9)-(line 388,col 46)",
        "(line 389,col 9)-(line 389,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntityMap",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 392,
      "end_line": 416,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.EntityMap.add(java.lang.String, int)",
      "begin_line": 399,
      "end_line": 399,
      "comment": "\n         * \u003cp\u003eAdd an entry to this entity map.\u003c/p\u003e\n         * \n         * @param name the entity name\n         * @param value the entity value\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.EntityMap.name(int)",
      "begin_line": 407,
      "end_line": 407,
      "comment": "\n         * \u003cp\u003eReturns the name of the entity identified by the specified value.\u003c/p\u003e\n         * \n         * @param value the value to locate\n         * @return entity name associated with the specified value\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.EntityMap.value(java.lang.String)",
      "begin_line": 415,
      "end_line": 415,
      "comment": "\n         * \u003cp\u003eReturns the value of the entity identified by the specified name.\u003c/p\u003e\n         * \n         * @param name the name to locate\n         * @return entity value associated with the specified name\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "PrimitiveEntityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.EntityMap"
      ],
      "begin_line": 418,
      "end_line": 447,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mapNameToValue"
      ],
      "begin_line": 419,
      "end_line": 419,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mapValueToName"
      ],
      "begin_line": 420,
      "end_line": 420,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.PrimitiveEntityMap.add(java.lang.String, int)",
      "begin_line": 425,
      "end_line": 428,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 426,col 13)-(line 426,col 57)",
        "(line 427,col 13)-(line 427,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.PrimitiveEntityMap.name(int)",
      "begin_line": 433,
      "end_line": 435,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 434,col 13)-(line 434,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.PrimitiveEntityMap.value(java.lang.String)",
      "begin_line": 440,
      "end_line": 446,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 441,col 13)-(line 441,col 52)",
        "(line 442,col 13)-(line 444,col 13)",
        "(line 445,col 13)-(line 445,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MapIntMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.EntityMap"
      ],
      "begin_line": 450,
      "end_line": 479,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mapNameToValue"
      ],
      "begin_line": 451,
      "end_line": 451,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mapValueToName"
      ],
      "begin_line": 452,
      "end_line": 452,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.MapIntMap.add(java.lang.String, int)",
      "begin_line": 457,
      "end_line": 460,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 458,col 13)-(line 458,col 57)",
        "(line 459,col 13)-(line 459,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.MapIntMap.name(int)",
      "begin_line": 465,
      "end_line": 467,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 466,col 13)-(line 466,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.MapIntMap.value(java.lang.String)",
      "begin_line": 472,
      "end_line": 478,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 473,col 13)-(line 473,col 52)",
        "(line 474,col 13)-(line 476,col 13)",
        "(line 477,col 13)-(line 477,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HashEntityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.MapIntMap"
      ],
      "begin_line": 481,
      "end_line": 489,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.Entities.HashEntityMap.HashEntityMap()",
      "begin_line": 485,
      "end_line": 488,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eHashEntityMap\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 486,col 13)-(line 486,col 43)",
        "(line 487,col 13)-(line 487,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TreeEntityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.MapIntMap"
      ],
      "begin_line": 491,
      "end_line": 499,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.Entities.TreeEntityMap.TreeEntityMap()",
      "begin_line": 495,
      "end_line": 498,
      "comment": "\n       * Constructs a new instance of \u003ccode\u003eTreeEntityMap\u003c/code\u003e.\n       ",
      "child_ranges": [
        "(line 496,col 13)-(line 496,col 43)",
        "(line 497,col 13)-(line 497,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LookupEntityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.PrimitiveEntityMap"
      ],
      "begin_line": 501,
      "end_line": 537,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lookupTable"
      ],
      "begin_line": 502,
      "end_line": 502,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOOKUP_TABLE_SIZE"
      ],
      "begin_line": 503,
      "end_line": 503,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.LookupEntityMap.name(int)",
      "begin_line": 508,
      "end_line": 513,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 509,col 13)-(line 511,col 13)",
        "(line 512,col 13)-(line 512,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.LookupEntityMap.lookupTable()",
      "begin_line": 521,
      "end_line": 526,
      "comment": "\n         * \u003cp\u003eReturns the lookup table for this entity map. The lookup table is created if it has not been \n         * previously.\u003c/p\u003e\n         * \n         * @return the lookup table\n         ",
      "child_ranges": [
        "(line 522,col 13)-(line 524,col 13)",
        "(line 525,col 13)-(line 525,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.LookupEntityMap.createLookupTable()",
      "begin_line": 531,
      "end_line": 536,
      "comment": "\n         * \u003cp\u003eCreates an entity lookup table of LOOKUP_TABLE_SIZE elements, initialized with entity names.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 532,col 13)-(line 532,col 56)",
        "(line 533,col 13)-(line 535,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ArrayEntityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.EntityMap"
      ],
      "begin_line": 539,
      "end_line": 615,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "growBy"
      ],
      "begin_line": 540,
      "end_line": 540,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 541,
      "end_line": 541,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 542,
      "end_line": 542,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 543,
      "end_line": 543,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.Entities.ArrayEntityMap.ArrayEntityMap()",
      "begin_line": 548,
      "end_line": 551,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eArrayEntityMap\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 549,col 13)-(line 549,col 39)",
        "(line 550,col 13)-(line 550,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.Entities.ArrayEntityMap.ArrayEntityMap(int)",
      "begin_line": 559,
      "end_line": 563,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eArrayEntityMap\u003c/code\u003e\n         * specifying the size by which the array should grow.\n         * \n         * @param growBy array will be initialized to and will grow by this amount\n         ",
      "child_ranges": [
        "(line 560,col 13)-(line 560,col 33)",
        "(line 561,col 13)-(line 561,col 39)",
        "(line 562,col 13)-(line 562,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.ArrayEntityMap.add(java.lang.String, int)",
      "begin_line": 568,
      "end_line": 573,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 569,col 13)-(line 569,col 37)",
        "(line 570,col 13)-(line 570,col 31)",
        "(line 571,col 13)-(line 571,col 33)",
        "(line 572,col 13)-(line 572,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.ArrayEntityMap.ensureCapacity(int)",
      "begin_line": 580,
      "end_line": 590,
      "comment": "\n         * Verifies the capacity of the entity array, adjusting the size if necessary.\n         * \n         * @param capacity size the array should be\n         ",
      "child_ranges": [
        "(line 581,col 13)-(line 589,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.ArrayEntityMap.name(int)",
      "begin_line": 595,
      "end_line": 602,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 596,col 13)-(line 600,col 13)",
        "(line 601,col 13)-(line 601,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.ArrayEntityMap.value(java.lang.String)",
      "begin_line": 607,
      "end_line": 614,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 608,col 13)-(line 612,col 13)",
        "(line 613,col 13)-(line 613,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BinaryEntityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.Entities.ArrayEntityMap"
      ],
      "begin_line": 617,
      "end_line": 689,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.Entities.BinaryEntityMap.BinaryEntityMap()",
      "begin_line": 622,
      "end_line": 624,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eBinaryEntityMap\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 623,col 11)-(line 623,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.Entities.BinaryEntityMap.BinaryEntityMap(int)",
      "begin_line": 632,
      "end_line": 634,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eArrayEntityMap\u003c/code\u003e\n         * specifying the size by which the underlying array should grow.\n         * \n         * @param growBy array will be initialized to and will grow by this amount\n         ",
      "child_ranges": [
        "(line 633,col 13)-(line 633,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.BinaryEntityMap.binarySearch(int)",
      "begin_line": 643,
      "end_line": 660,
      "comment": "\n         * Performs a binary search of the entity array for the specified key.\n         * This method is based on code in {@link java.util.Arrays}.\n         * \n         * @param key the key to be found\n         * @return the index of the entity array matching the specified key\n         ",
      "child_ranges": [
        "(line 644,col 13)-(line 644,col 24)",
        "(line 645,col 13)-(line 645,col 32)",
        "(line 647,col 13)-(line 658,col 13)",
        "(line 659,col 13)-(line 659,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.BinaryEntityMap.add(java.lang.String, int)",
      "begin_line": 665,
      "end_line": 677,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 666,col 13)-(line 666,col 37)",
        "(line 667,col 13)-(line 667,col 47)",
        "(line 668,col 13)-(line 670,col 13)",
        "(line 671,col 13)-(line 671,col 39)",
        "(line 672,col 13)-(line 672,col 86)",
        "(line 673,col 13)-(line 673,col 37)",
        "(line 674,col 13)-(line 674,col 84)",
        "(line 675,col 13)-(line 675,col 35)",
        "(line 676,col 13)-(line 676,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.BinaryEntityMap.name(int)",
      "begin_line": 682,
      "end_line": 688,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 683,col 13)-(line 683,col 44)",
        "(line 684,col 13)-(line 686,col 13)",
        "(line 687,col 13)-(line 687,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 692,
      "end_line": 692,
      "comment": " package scoped for testing"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.addEntities(java.lang.String[][])",
      "begin_line": 699,
      "end_line": 703,
      "comment": "\n     * \u003cp\u003eAdds entities to this entity.\u003c/p\u003e\n     * \n     * @param entityArray array of entities to be added\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 702,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.addEntity(java.lang.String, int)",
      "begin_line": 711,
      "end_line": 713,
      "comment": "\n     * \u003cp\u003eAdd an entity to this entity.\u003c/p\u003e\n     * \n     * @param name name of the entity\n     * @param value vale of the entity\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.entityName(int)",
      "begin_line": 721,
      "end_line": 723,
      "comment": "\n     * \u003cp\u003eReturns the name of the entity identified by the specified value.\u003c/p\u003e\n     * \n     * @param value the value to locate\n     * @return entity name associated with the specified value\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.entityValue(java.lang.String)",
      "begin_line": 731,
      "end_line": 733,
      "comment": "\n     * \u003cp\u003eReturns the value of the entity identified by the specified name.\u003c/p\u003e\n     * \n     * @param name the name to locate\n     * @return entity value associated with the specified name\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.escape(java.lang.String)",
      "begin_line": 744,
      "end_line": 767,
      "comment": "\n     * \u003cp\u003eEscapes the characters in a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you have called addEntity(\u0026quot;foo\u0026quot;, 0xA1),\n     * escape(\u0026quot;\\u00A1\u0026quot;) will return \u0026quot;\u0026amp;foo;\u0026quot;\u003c/p\u003e\n     *\n     * @param str The \u003ccode\u003eString\u003c/code\u003e to escape.\n     * @return A new escaped \u003ccode\u003eString\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 62)",
        "(line 747,col 9)-(line 747,col 14)",
        "(line 748,col 9)-(line 765,col 9)",
        "(line 766,col 9)-(line 766,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.escape(java.io.Writer, java.lang.String)",
      "begin_line": 782,
      "end_line": 801,
      "comment": "\n     * \u003cp\u003eEscapes the characters in the \u003ccode\u003eString\u003c/code\u003e passed and writes the result\n     * to the \u003ccode\u003eWriter\u003c/code\u003e passed. \u003c/p\u003e\n     * \n     * @param writer The \u003ccode\u003eWriter\u003c/code\u003e to write the results of the escaping to.\n     *                            Assumed to be a non-null value.\n     * @param str The \u003ccode\u003eString\u003c/code\u003e to escape. Assumed to be a non-null value.\n     * @throws IOException when \u003ccode\u003eWriter\u003c/code\u003e passed throws the exception from\n     *                                       calls to the {@link Writer#write(int)} methods.\n     *                                       \n     * @see #escape(String)\n     * @see Writer\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 31)",
        "(line 784,col 9)-(line 800,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.unescape(java.lang.String)",
      "begin_line": 812,
      "end_line": 864,
      "comment": "\n     * \u003cp\u003eUnescapes the entities in a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you have called addEntity(\u0026quot;foo\u0026quot;, 0xA1),\n     * unescape(\u0026quot;\u0026amp;foo;\u0026quot;) will return \u0026quot;\\u00A1\u0026quot;\u003c/p\u003e\n     *\n     * @param str The \u003ccode\u003eString\u003c/code\u003e to escape.\n     * @return A new escaped \u003ccode\u003eString\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 813,col 58)",
        "(line 814,col 9)-(line 814,col 14)",
        "(line 815,col 9)-(line 862,col 9)",
        "(line 863,col 9)-(line 863,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Entities.unescape(java.io.Writer, java.lang.String)",
      "begin_line": 878,
      "end_line": 936,
      "comment": "\n     * \u003cp\u003eUnescapes the escaped entities in the \u003ccode\u003eString\u003c/code\u003e passed and\n     * writes the result to the \u003ccode\u003eWriter\u003c/code\u003e passed.\u003c/p\u003e\n     * \n     * @param writer The \u003ccode\u003eWriter\u003c/code\u003e to write the results to; assumed to be non-null.\n     * @param string The \u003ccode\u003eString\u003c/code\u003e to write the results to; assumed to be non-null.\n     * @throws IOException when \u003ccode\u003eWriter\u003c/code\u003e passed throws the exception from\n     *                                       calls to the {@link Writer#write(int)} methods.\n     *                                       \n     * @see #escape(String)\n     * @see Writer\n     ",
      "child_ranges": [
        "(line 879,col 9)-(line 879,col 34)",
        "(line 880,col 9)-(line 882,col 9)",
        "(line 883,col 9)-(line 935,col 9)"
      ]
    }
  ]
}