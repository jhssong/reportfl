{
  "filepath": "/tmp/Lang-20b/src/test/java/org/apache/commons/lang3/builder/HashCodeBuilderAndEqualsBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeBuilderAndEqualsBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 28,
      "end_line": 142,
      "comment": "\n * Tests {@link org.apache.commons.lang3.builder.HashCodeBuilder} and\n * {@link org.apache.commons.lang3.builder.EqualsBuilderTest} to insure that equal\n * objects must have equal hash codes.\n * \n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.HashCodeBuilderAndEqualsBuilderTest(java.lang.String)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "\n     * Constructor for HashCodeBuilderAndEqualsBuilderTest.\n     * @param name\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testInteger(boolean)",
      "begin_line": 40,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 40)",
        "(line 42,col 9)-(line 42,col 40)",
        "(line 43,col 9)-(line 43,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testInteger()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testIntegerWithTransients()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testFixture()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testFixtureWithTransients()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testFixture(boolean)",
      "begin_line": 62,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 144)",
        "(line 64,col 9)-(line 67,col 28)",
        "(line 68,col 9)-(line 71,col 28)",
        "(line 72,col 9)-(line 75,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.assertEqualsAndHashCodeContract(java.lang.Object, java.lang.Object, boolean)",
      "begin_line": 86,
      "end_line": 93,
      "comment": "\n     * Asserts that if \u003ccode\u003elhs\u003c/code\u003e equals \u003ccode\u003erhs\u003c/code\u003e \n     * then their hash codes MUST be identical.\n     * \n     * @param lhs The Left-Hand-Side of the equals test\n     * @param rhs The Right-Hand-Side of the equals test\n     * @param testTransients wether to test transient fields\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 95,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "string"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "s"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.TestFixture.TestFixture(int, char, java.lang.String, short)",
      "begin_line": 101,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 102,col 13)-(line 102,col 23)",
        "(line 103,col 13)-(line 103,col 23)",
        "(line 104,col 13)-(line 104,col 33)",
        "(line 105,col 13)-(line 105,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SubTestFixture",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.TestFixture"
      ],
      "begin_line": 109,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tString"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.SubTestFixture.SubTestFixture(int, char, java.lang.String, short, java.lang.String)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 113,col 13)-(line 113,col 35)",
        "(line 114,col 13)-(line 114,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AllTransientFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 118,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "string"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "s"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.AllTransientFixture.AllTransientFixture(int, char, java.lang.String, short)",
      "begin_line": 124,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 125,col 13)-(line 125,col 23)",
        "(line 126,col 13)-(line 126,col 23)",
        "(line 127,col 13)-(line 127,col 33)",
        "(line 128,col 13)-(line 128,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SubAllTransientFixture",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.AllTransientFixture"
      ],
      "begin_line": 132,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tString"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.SubAllTransientFixture.SubAllTransientFixture(int, char, java.lang.String, short, java.lang.String)",
      "begin_line": 135,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 136,col 13)-(line 136,col 35)",
        "(line 137,col 13)-(line 137,col 35)"
      ]
    }
  ]
}