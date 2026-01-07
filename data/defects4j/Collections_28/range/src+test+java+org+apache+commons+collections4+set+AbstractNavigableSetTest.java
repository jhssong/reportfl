{
  "filepath": "/tmp/Collections-28b/src/test/java/org/apache/commons/collections4/set/AbstractNavigableSetTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractNavigableSetTest",
      "is_interface": false,
      "parent_types": [
        "AbstractSortedSetTest\u003cE\u003e"
      ],
      "begin_line": 36,
      "end_line": 339,
      "comment": "\n * Abstract test class for {@link NavigableSet} methods and contracts.\n * \u003cp\u003e\n * To use, subclass and override the {@link #makeObject()}\n * method.  You may have to override other protected methods if your\n * set is not modifiable, or if your set restricts what kinds of\n * elements may be added; see {@link AbstractSetTest} for more details.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.AbstractNavigableSetTest(java.lang.String)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * JUnit constructor.\n     *\n     * @param name  name for test\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.makeObject()",
      "begin_line": 51,
      "end_line": 52,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.makeFullCollection()",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.makeConfirmedCollection()",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Returns an empty {@link TreeSet} for use in modification testing.\n     *\n     * @return a confirmed empty collection\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.verify()",
      "begin_line": 79,
      "end_line": 104,
      "comment": "\n     * Verification extension, will check the order of elements,\n     * the sets should already be verified equal.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 23)",
        "(line 85,col 9)-(line 85,col 74)",
        "(line 86,col 9)-(line 86,col 73)",
        "(line 87,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.getFullNonNullElements()",
      "begin_line": 110,
      "end_line": 119,
      "comment": "\n     * Override to return comparable objects.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 49)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.getOtherNonNullElements()",
      "begin_line": 124,
      "end_line": 132,
      "comment": "\n     * Override to return comparable objects.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 49)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.bulkTestNavigableSetSubSet()",
      "begin_line": 143,
      "end_line": 149,
      "comment": "\n     * Bulk test {@link NavigableSet#subSet(Object, boolean, Object, boolean)}.\n     * This method runs through all of the tests in {@link AbstractNavigableSetTest}.\n     * After modification operations, {@link #verify()} is invoked to ensure\n     * that the set and the other collection views are still valid.\n     *\n     * @return a {@link AbstractNavigableSetTest} instance for testing a subset.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 52)",
        "(line 146,col 9)-(line 146,col 39)",
        "(line 147,col 9)-(line 147,col 40)",
        "(line 148,col 9)-(line 148,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.bulkTestNavigableSetHeadSet()",
      "begin_line": 159,
      "end_line": 165,
      "comment": "\n     * Bulk test {@link NavigableSet#headSet(Object, boolean)}.\n     * This method runs through all of the tests in {@link AbstractNavigableSetTest}.\n     * After modification operations, {@link #verify()} is invoked to ensure\n     * that the set and the other collection views are still valid.\n     *\n     * @return a {@link AbstractNavigableSetTest} instance for testing a headset.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 52)",
        "(line 162,col 9)-(line 162,col 39)",
        "(line 163,col 9)-(line 163,col 40)",
        "(line 164,col 9)-(line 164,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.bulkTestNavigableSetTailSet()",
      "begin_line": 175,
      "end_line": 179,
      "comment": "\n     * Bulk test {@link NavigableSet#tailSet(Object, boolean)}.\n     * This method runs through all of the tests in {@link AbstractNavigableSetTest}.\n     * After modification operations, {@link #verify()} is invoked to ensure\n     * that the set and the other collection views are still valid.\n     *\n     * @return a {@link AbstractNavigableSetTest} instance for testing a tailset.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 52)",
        "(line 177,col 9)-(line 177,col 39)",
        "(line 178,col 9)-(line 178,col 65)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestNavigableSetSubSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.set.AbstractNavigableSetTest\u003cE\u003e"
      ],
      "begin_line": 181,
      "end_line": 321,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m_Type"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m_LowBound"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m_HighBound"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m_FullElements"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m_OtherElements"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m_Inclusive"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.TestNavigableSetSubSet.TestNavigableSetSubSet(int, boolean, boolean)",
      "begin_line": 190,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 192,col 13)-(line 192,col 44)",
        "(line 193,col 13)-(line 215,col 13)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.TestNavigableSetSubSet.TestNavigableSetSubSet(int, int, boolean)",
      "begin_line": 219,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 221,col 13)-(line 221,col 44)",
        "(line 222,col 13)-(line 222,col 33)",
        "(line 223,col 13)-(line 223,col 33)",
        "(line 224,col 13)-(line 224,col 34)",
        "(line 225,col 13)-(line 225,col 36)",
        "(line 227,col 13)-(line 227,col 70)",
        "(line 228,col 13)-(line 228,col 75)",
        "(line 229,col 13)-(line 229,col 54)",
        "(line 230,col 13)-(line 230,col 118)",
        "(line 231,col 13)-(line 231,col 54)",
        "(line 232,col 13)-(line 232,col 64)",
        "(line 233,col 13)-(line 234,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.TestNavigableSetSubSet.isNullSupported()",
      "begin_line": 237,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 239,col 13)-(line 239,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.TestNavigableSetSubSet.isAddSupported()",
      "begin_line": 241,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 243,col 13)-(line 243,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.TestNavigableSetSubSet.isRemoveSupported()",
      "begin_line": 245,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.TestNavigableSetSubSet.isFailFastSupported()",
      "begin_line": 249,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 13)-(line 251,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.TestNavigableSetSubSet.getFullElements()",
      "begin_line": 254,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 256,col 13)-(line 256,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.TestNavigableSetSubSet.getOtherElements()",
      "begin_line": 258,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 260,col 13)-(line 260,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.TestNavigableSetSubSet.getSubSet(java.util.NavigableSet\u003cE\u003e)",
      "begin_line": 263,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 264,col 13)-(line 264,col 81)",
        "(line 265,col 13)-(line 274,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.TestNavigableSetSubSet.makeObject()",
      "begin_line": 277,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 279,col 13)-(line 279,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.TestNavigableSetSubSet.makeFullCollection()",
      "begin_line": 282,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 284,col 13)-(line 284,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.TestNavigableSetSubSet.isTestSerialization()",
      "begin_line": 287,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 289,col 13)-(line 289,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.TestNavigableSetSubSet.bulkTestSortedSetSubSet()",
      "begin_line": 292,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 294,col 13)-(line 294,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.TestNavigableSetSubSet.bulkTestSortedSetHeadSet()",
      "begin_line": 296,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 298,col 13)-(line 298,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.TestNavigableSetSubSet.bulkTestSortedSetTailSet()",
      "begin_line": 300,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 302,col 13)-(line 302,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.TestNavigableSetSubSet.bulkTestNavigableSetSubSet()",
      "begin_line": 304,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 306,col 13)-(line 306,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.TestNavigableSetSubSet.bulkTestNavigableSetHeadSet()",
      "begin_line": 308,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 310,col 13)-(line 310,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.TestNavigableSetSubSet.bulkTestNavigableSetTailSet()",
      "begin_line": 312,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 314,col 13)-(line 314,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_SUBSET"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_TAILSET"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_HEADSET"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.getCollection()",
      "begin_line": 326,
      "end_line": 329,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractNavigableSetTest.getConfirmed()",
      "begin_line": 334,
      "end_line": 337,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 54)"
      ]
    }
  ]
}