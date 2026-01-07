{
  "filepath": "/tmp/Lang-57b/src/test/org/apache/commons/lang/builder/HashCodeBuilderAndEqualsBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeBuilderAndEqualsBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 164,
      "comment": "\n * Tests {@link org.apache.commons.lang.builder.HashCodeBuilder} and\n * {@link org.apache.commons.lang.builder.EqualsBuilderTest} to insure that equal\n * objects must have equal hash codes.\n * \n * @author Gary Gregory\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.HashCodeBuilderAndEqualsBuilderTest(java.lang.String)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Constructor for HashCodeBuilderAndEqualsBuilderTest.\n     * @param name\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.main(java.lang.String[])",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.suite()",
      "begin_line": 46,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 83)",
        "(line 48,col 9)-(line 48,col 63)",
        "(line 49,col 9)-(line 49,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.setUp()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.tearDown()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.testInteger(boolean)",
      "begin_line": 62,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 40)",
        "(line 64,col 9)-(line 64,col 40)",
        "(line 65,col 9)-(line 65,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.testInteger()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.testIntegerWithTransients()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.testFixture()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.testFixtureWithTransients()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.testFixture(boolean)",
      "begin_line": 84,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 144)",
        "(line 86,col 9)-(line 89,col 28)",
        "(line 90,col 9)-(line 93,col 28)",
        "(line 94,col 9)-(line 97,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.assertEqualsAndHashCodeContract(java.lang.Object, java.lang.Object, boolean)",
      "begin_line": 108,
      "end_line": 115,
      "comment": "\n     * Asserts that if \u003ccode\u003elhs\u003c/code\u003e equals \u003ccode\u003erhs\u003c/code\u003e \n     * then their hash codes MUST be identical.\n     * \n     * @param lhs The Left-Hand-Side of the equals test\n     * @param rhs The Right-Hand-Side of the equals test\n     * @param testTransients wether to test transient fields\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 117,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "string"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "s"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.TestFixture.TestFixture(int, char, java.lang.String, short)",
      "begin_line": 123,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 124,col 13)-(line 124,col 23)",
        "(line 125,col 13)-(line 125,col 23)",
        "(line 126,col 13)-(line 126,col 33)",
        "(line 127,col 13)-(line 127,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SubTestFixture",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.TestFixture"
      ],
      "begin_line": 131,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tString"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.SubTestFixture.SubTestFixture(int, char, java.lang.String, short, java.lang.String)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 135,col 13)-(line 135,col 35)",
        "(line 136,col 13)-(line 136,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AllTransientFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 140,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "string"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "s"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.AllTransientFixture.AllTransientFixture(int, char, java.lang.String, short)",
      "begin_line": 146,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 147,col 13)-(line 147,col 23)",
        "(line 148,col 13)-(line 148,col 23)",
        "(line 149,col 13)-(line 149,col 33)",
        "(line 150,col 13)-(line 150,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SubAllTransientFixture",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.AllTransientFixture"
      ],
      "begin_line": 154,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tString"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.SubAllTransientFixture.SubAllTransientFixture(int, char, java.lang.String, short, java.lang.String)",
      "begin_line": 157,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 158,col 13)-(line 158,col 35)",
        "(line 159,col 13)-(line 159,col 35)"
      ]
    }
  ]
}