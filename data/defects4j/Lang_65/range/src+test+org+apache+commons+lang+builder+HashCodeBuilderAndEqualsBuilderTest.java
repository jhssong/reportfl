{
  "filepath": "/tmp/Lang-65b/src/test/org/apache/commons/lang/builder/HashCodeBuilderAndEqualsBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeBuilderAndEqualsBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 163,
      "comment": "\n * Tests {@link org.apache.commons.lang.builder.HashCodeBuilder} and\n * {@link org.apache.commons.lang.builder.EqualsBuilderTest} to insure that equal\n * objects must have equal hash codes.\n * \n * @author Gary Gregory\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.HashCodeBuilderAndEqualsBuilderTest(java.lang.String)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "\n     * Constructor for HashCodeBuilderAndEqualsBuilderTest.\n     * @param name\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.main(java.lang.String[])",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.suite()",
      "begin_line": 45,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 83)",
        "(line 47,col 9)-(line 47,col 63)",
        "(line 48,col 9)-(line 48,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.setUp()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.tearDown()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.testInteger(boolean)",
      "begin_line": 61,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 40)",
        "(line 63,col 9)-(line 63,col 40)",
        "(line 64,col 9)-(line 64,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.testInteger()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.testIntegerWithTransients()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.testFixture()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.testFixtureWithTransients()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.testFixture(boolean)",
      "begin_line": 83,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 144)",
        "(line 85,col 9)-(line 88,col 28)",
        "(line 89,col 9)-(line 92,col 28)",
        "(line 93,col 9)-(line 96,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.assertEqualsAndHashCodeContract(java.lang.Object, java.lang.Object, boolean)",
      "begin_line": 107,
      "end_line": 114,
      "comment": "\n     * Asserts that if \u003ccode\u003elhs\u003c/code\u003e equals \u003ccode\u003erhs\u003c/code\u003e \n     * then their hash codes MUST be identical.\n     * \n     * @param lhs The Left-Hand-Side of the equals test\n     * @param rhs The Right-Hand-Side of the equals test\n     * @param testTransients wether to test transient fields\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 116,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "string"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "s"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.TestFixture.TestFixture(int, char, java.lang.String, short)",
      "begin_line": 122,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 123,col 13)-(line 123,col 23)",
        "(line 124,col 13)-(line 124,col 23)",
        "(line 125,col 13)-(line 125,col 33)",
        "(line 126,col 13)-(line 126,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SubTestFixture",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.TestFixture"
      ],
      "begin_line": 130,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tString"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.SubTestFixture.SubTestFixture(int, char, java.lang.String, short, java.lang.String)",
      "begin_line": 133,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 134,col 13)-(line 134,col 35)",
        "(line 135,col 13)-(line 135,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AllTransientFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 139,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "string"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "s"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.AllTransientFixture.AllTransientFixture(int, char, java.lang.String, short)",
      "begin_line": 145,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 146,col 13)-(line 146,col 23)",
        "(line 147,col 13)-(line 147,col 23)",
        "(line 148,col 13)-(line 148,col 33)",
        "(line 149,col 13)-(line 149,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SubAllTransientFixture",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.AllTransientFixture"
      ],
      "begin_line": 153,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tString"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderAndEqualsBuilderTest.SubAllTransientFixture.SubAllTransientFixture(int, char, java.lang.String, short, java.lang.String)",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 157,col 13)-(line 157,col 35)",
        "(line 158,col 13)-(line 158,col 35)"
      ]
    }
  ]
}