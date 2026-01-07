{
  "filepath": "/tmp/Collections-25b/src/test/java/org/apache/commons/collections4/set/AbstractSortedSetTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractSortedSetTest",
      "is_interface": false,
      "parent_types": [
        "AbstractSetTest\u003cE\u003e"
      ],
      "begin_line": 36,
      "end_line": 344,
      "comment": "\n * Abstract test class for {@link SortedSet} methods and contracts.\n * \u003cp\u003e\n * To use, subclass and override the {@link #makeObject()}\n * method.  You may have to override other protected methods if your\n * set is not modifiable, or if your set restricts what kinds of\n * elements may be added; see {@link AbstractSetTest} for more details.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.AbstractSortedSetTest(java.lang.String)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * JUnit constructor.\n     *\n     * @param name  name for test\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.verify()",
      "begin_line": 52,
      "end_line": 77,
      "comment": "\n     * Verification extension, will check the order of elements,\n     * the sets should already be verified equal.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 23)",
        "(line 58,col 9)-(line 58,col 64)",
        "(line 59,col 9)-(line 59,col 63)",
        "(line 60,col 9)-(line 60,col 23)",
        "(line 61,col 9)-(line 61,col 22)",
        "(line 62,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 76,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.isNullSupported()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Overridden because SortedSets don\u0027t allow null elements (normally).\n     * @return false\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.makeObject()",
      "begin_line": 92,
      "end_line": 93,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.makeFullCollection()",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.makeConfirmedCollection()",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * Returns an empty {@link TreeSet} for use in modification testing.\n     *\n     * @return a confirmed empty collection\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.getFullNonNullElements()",
      "begin_line": 120,
      "end_line": 129,
      "comment": "\n     * Override to return comparable objects.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 49)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.getOtherNonNullElements()",
      "begin_line": 134,
      "end_line": 142,
      "comment": "\n     * Override to return comparable objects.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 49)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.bulkTestSortedSetSubSet()",
      "begin_line": 153,
      "end_line": 160,
      "comment": "\n     * Bulk test {@link SortedSet#subSet(Object, Object)}.  This method runs through all of\n     * the tests in {@link AbstractSortedSetTest}.\n     * After modification operations, {@link #verify()} is invoked to ensure\n     * that the set and the other collection views are still valid.\n     *\n     * @return a {@link AbstractSetTest} instance for testing a subset.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 52)",
        "(line 156,col 9)-(line 156,col 39)",
        "(line 157,col 9)-(line 157,col 40)",
        "(line 158,col 9)-(line 158,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.bulkTestSortedSetHeadSet()",
      "begin_line": 170,
      "end_line": 176,
      "comment": "\n     * Bulk test {@link SortedSet#headSet(Object)}.  This method runs through all of\n     * the tests in {@link AbstractSortedSetTest}.\n     * After modification operations, {@link #verify()} is invoked to ensure\n     * that the set and the other collection views are still valid.\n     *\n     * @return a {@link AbstractSetTest} instance for testing a headset.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 52)",
        "(line 173,col 9)-(line 173,col 39)",
        "(line 174,col 9)-(line 174,col 40)",
        "(line 175,col 9)-(line 175,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.bulkTestSortedSetTailSet()",
      "begin_line": 186,
      "end_line": 190,
      "comment": "\n     * Bulk test {@link SortedSet#tailSet(Object)}.  This method runs through all of\n     * the tests in {@link AbstractSortedSetTest}.\n     * After modification operations, {@link #verify()} is invoked to ensure\n     * that the set and the other collection views are still valid.\n     *\n     * @return a {@link AbstractSetTest} instance for testing a tailset.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 52)",
        "(line 188,col 9)-(line 188,col 39)",
        "(line 189,col 9)-(line 189,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSortedSetSubSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.set.AbstractSortedSetTest\u003cE\u003e"
      ],
      "begin_line": 192,
      "end_line": 327,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m_Type"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m_LowBound"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m_HighBound"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m_FullElements"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m_OtherElements"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.TestSortedSetSubSet.TestSortedSetSubSet(int, boolean)",
      "begin_line": 200,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 202,col 13)-(line 202,col 41)",
        "(line 203,col 13)-(line 231,col 13)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.TestSortedSetSubSet.TestSortedSetSubSet(int, int)",
      "begin_line": 235,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 237,col 13)-(line 237,col 41)",
        "(line 239,col 13)-(line 239,col 33)",
        "(line 240,col 13)-(line 240,col 33)",
        "(line 241,col 13)-(line 241,col 34)",
        "(line 242,col 13)-(line 242,col 49)",
        "(line 244,col 13)-(line 244,col 54)",
        "(line 245,col 13)-(line 245,col 111)",
        "(line 246,col 13)-(line 246,col 59)",
        "(line 247,col 13)-(line 248,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.TestSortedSetSubSet.isNullSupported()",
      "begin_line": 255,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 257,col 13)-(line 257,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.TestSortedSetSubSet.isAddSupported()",
      "begin_line": 259,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 261,col 13)-(line 261,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.TestSortedSetSubSet.isRemoveSupported()",
      "begin_line": 263,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 265,col 13)-(line 265,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.TestSortedSetSubSet.isFailFastSupported()",
      "begin_line": 267,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 269,col 13)-(line 269,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.TestSortedSetSubSet.getFullElements()",
      "begin_line": 272,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 274,col 13)-(line 274,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.TestSortedSetSubSet.getOtherElements()",
      "begin_line": 276,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 278,col 13)-(line 278,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.TestSortedSetSubSet.getSubSet(java.util.SortedSet\u003cE\u003e)",
      "begin_line": 281,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 282,col 13)-(line 282,col 78)",
        "(line 283,col 13)-(line 292,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.TestSortedSetSubSet.makeObject()",
      "begin_line": 295,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 297,col 13)-(line 297,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.TestSortedSetSubSet.makeFullCollection()",
      "begin_line": 300,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 302,col 13)-(line 302,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.TestSortedSetSubSet.isTestSerialization()",
      "begin_line": 305,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 307,col 13)-(line 307,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.TestSortedSetSubSet.bulkTestSortedSetSubSet()",
      "begin_line": 310,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 312,col 13)-(line 312,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.TestSortedSetSubSet.bulkTestSortedSetHeadSet()",
      "begin_line": 314,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 316,col 13)-(line 316,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.TestSortedSetSubSet.bulkTestSortedSetTailSet()",
      "begin_line": 318,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 320,col 13)-(line 320,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_SUBSET"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_TAILSET"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_HEADSET"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.getCollection()",
      "begin_line": 332,
      "end_line": 335,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSortedSetTest.getConfirmed()",
      "begin_line": 340,
      "end_line": 343,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 51)"
      ]
    }
  ]
}