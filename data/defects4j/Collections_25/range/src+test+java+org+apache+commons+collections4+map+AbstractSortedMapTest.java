{
  "filepath": "/tmp/Collections-25b/src/test/java/org/apache/commons/collections4/map/AbstractSortedMapTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractSortedMapTest",
      "is_interface": false,
      "parent_types": [
        "AbstractMapTest\u003cK,V\u003e"
      ],
      "begin_line": 34,
      "end_line": 397,
      "comment": "\n * Abstract test class for {@link java.util.SortedMap} methods and contracts.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.AbstractSortedMapTest(java.lang.String)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * JUnit constructor.\n     *\n     * @param testName  the test name\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.isAllowNullKey()",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Can\u0027t sort null keys.\n     *\n     * @return false\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.makeConfirmedMap()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * SortedMap uses TreeMap as its known comparison.\n     *\n     * @return a map that is known to be valid\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.testComparator()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.makeObject()",
      "begin_line": 75,
      "end_line": 76,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.makeFullMap()",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.testFirstKey()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 49)",
        "(line 88,col 9)-(line 88,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.testLastKey()",
      "begin_line": 91,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 49)",
        "(line 93,col 9)-(line 93,col 21)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.bulkTestHeadMap()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.bulkTestTailMap()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.bulkTestSubMap()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestViewMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractSortedMapTest\u003cK, V\u003e"
      ],
      "begin_line": 113,
      "end_line": 210,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "main"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subSortedKeys"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subSortedValues"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subSortedNewValues"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "TestViewMap(String, AbstractMapTest)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027AbstractMapTest\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 119,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 120,col 13)-(line 120,col 24)",
        "(line 121,col 13)-(line 121,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestViewMap.resetEmpty()",
      "begin_line": 123,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 126,col 13)-(line 126,col 30)",
        "(line 127,col 13)-(line 127,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestViewMap.resetFull()",
      "begin_line": 129,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 132,col 13)-(line 132,col 29)",
        "(line 133,col 13)-(line 133,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestViewMap.verify()",
      "begin_line": 135,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 138,col 13)-(line 138,col 27)",
        "(line 139,col 13)-(line 139,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestViewMap.bulkTestHeadMap()",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 13)-(line 143,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestViewMap.bulkTestTailMap()",
      "begin_line": 145,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 13)-(line 147,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestViewMap.bulkTestSubMap()",
      "begin_line": 149,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 13)-(line 151,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestViewMap.getSampleKeys()",
      "begin_line": 154,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 13)-(line 157,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestViewMap.getSampleValues()",
      "begin_line": 159,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 13)-(line 162,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestViewMap.getNewSampleValues()",
      "begin_line": 164,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 13)-(line 167,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestViewMap.isAllowNullKey()",
      "begin_line": 170,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 172,col 13)-(line 172,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestViewMap.isAllowNullValue()",
      "begin_line": 174,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 176,col 13)-(line 176,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestViewMap.isPutAddSupported()",
      "begin_line": 178,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 180,col 13)-(line 180,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestViewMap.isPutChangeSupported()",
      "begin_line": 182,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 184,col 13)-(line 184,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestViewMap.isRemoveSupported()",
      "begin_line": 186,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 188,col 13)-(line 188,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestViewMap.isTestSerialization()",
      "begin_line": 190,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 13)-(line 192,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestHeadMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractSortedMapTest.TestViewMap\u003cK, V\u003e"
      ],
      "begin_line": 212,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SUBSIZE"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "toKey"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "TestHeadMap(AbstractMapTest)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027AbstractMapTest\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 216,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 217,col 13)-(line 217,col 45)",
        "(line 218,col 13)-(line 218,col 52)",
        "(line 219,col 13)-(line 222,col 13)",
        "(line 223,col 13)-(line 223,col 57)",
        "(line 224,col 13)-(line 224,col 83)",
        "(line 225,col 13)-(line 225,col 87)",
        "(line 226,col 13)-(line 226,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestHeadMap.makeObject()",
      "begin_line": 228,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 13)-(line 231,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestHeadMap.makeFullMap()",
      "begin_line": 233,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 235,col 13)-(line 235,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestHeadMap.testHeadMapOutOfRange()",
      "begin_line": 237,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 238,col 13)-(line 240,col 13)",
        "(line 241,col 13)-(line 241,col 25)",
        "(line 242,col 13)-(line 245,col 58)",
        "(line 246,col 13)-(line 246,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestHeadMap.getCompatibilityVersion()",
      "begin_line": 248,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 250,col 13)-(line 250,col 67)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTailMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractSortedMapTest.TestViewMap\u003cK, V\u003e"
      ],
      "begin_line": 265,
      "end_line": 318,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SUBSIZE"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fromKey"
      ],
      "begin_line": 267,
      "end_line": 267,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invalidKey"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "TestTailMap(AbstractMapTest)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027AbstractMapTest\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 270,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 271,col 13)-(line 271,col 45)",
        "(line 272,col 13)-(line 272,col 52)",
        "(line 273,col 13)-(line 276,col 13)",
        "(line 277,col 13)-(line 277,col 87)",
        "(line 278,col 13)-(line 278,col 94)",
        "(line 279,col 13)-(line 279,col 87)",
        "(line 280,col 13)-(line 280,col 91)",
        "(line 281,col 13)-(line 281,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestTailMap.makeObject()",
      "begin_line": 283,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 286,col 13)-(line 286,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestTailMap.makeFullMap()",
      "begin_line": 288,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 290,col 13)-(line 290,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestTailMap.testTailMapOutOfRange()",
      "begin_line": 292,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 293,col 13)-(line 295,col 13)",
        "(line 296,col 13)-(line 296,col 25)",
        "(line 297,col 13)-(line 300,col 58)",
        "(line 301,col 13)-(line 301,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestTailMap.getCompatibilityVersion()",
      "begin_line": 303,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 305,col 13)-(line 305,col 67)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractSortedMapTest.TestViewMap\u003cK, V\u003e"
      ],
      "begin_line": 320,
      "end_line": 380,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SUBSIZE"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fromKey"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "toKey"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "TestSubMap(AbstractMapTest)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027AbstractMapTest\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 325,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 326,col 13)-(line 326,col 44)",
        "(line 327,col 13)-(line 327,col 52)",
        "(line 328,col 13)-(line 331,col 13)",
        "(line 332,col 13)-(line 332,col 59)",
        "(line 333,col 13)-(line 333,col 85)",
        "(line 335,col 13)-(line 335,col 59)",
        "(line 336,col 13)-(line 336,col 111)",
        "(line 338,col 13)-(line 338,col 61)",
        "(line 339,col 13)-(line 339,col 117)",
        "(line 341,col 13)-(line 342,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestSubMap.makeObject()",
      "begin_line": 345,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 348,col 13)-(line 348,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestSubMap.makeFullMap()",
      "begin_line": 350,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 352,col 13)-(line 352,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestSubMap.testSubMapOutOfRange()",
      "begin_line": 354,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 355,col 13)-(line 357,col 13)",
        "(line 358,col 13)-(line 358,col 25)",
        "(line 359,col 13)-(line 362,col 58)",
        "(line 363,col 13)-(line 363,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.TestSubMap.getCompatibilityVersion()",
      "begin_line": 365,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 367,col 13)-(line 367,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.getMap()",
      "begin_line": 385,
      "end_line": 388,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapTest.getConfirmed()",
      "begin_line": 393,
      "end_line": 396,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 54)"
      ]
    }
  ]
}