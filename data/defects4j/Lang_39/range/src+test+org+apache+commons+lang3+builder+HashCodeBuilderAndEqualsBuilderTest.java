{
  "filepath": "/tmp/Lang-39b/src/test/org/apache/commons/lang3/builder/HashCodeBuilderAndEqualsBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeBuilderAndEqualsBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 166,
      "comment": "\n * Tests {@link org.apache.commons.lang3.builder.HashCodeBuilder} and\n * {@link org.apache.commons.lang3.builder.EqualsBuilderTest} to insure that equal\n * objects must have equal hash codes.\n * \n * @author Gary Gregory\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.HashCodeBuilderAndEqualsBuilderTest(java.lang.String)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Constructor for HashCodeBuilderAndEqualsBuilderTest.\n     * @param name\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.main(java.lang.String[])",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.suite()",
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
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.setUp()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.tearDown()",
      "begin_line": 57,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testInteger(boolean)",
      "begin_line": 64,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 40)",
        "(line 66,col 9)-(line 66,col 40)",
        "(line 67,col 9)-(line 67,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testInteger()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testIntegerWithTransients()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testFixture()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testFixtureWithTransients()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testFixture(boolean)",
      "begin_line": 86,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 144)",
        "(line 88,col 9)-(line 91,col 28)",
        "(line 92,col 9)-(line 95,col 28)",
        "(line 96,col 9)-(line 99,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.assertEqualsAndHashCodeContract(java.lang.Object, java.lang.Object, boolean)",
      "begin_line": 110,
      "end_line": 117,
      "comment": "\n     * Asserts that if \u003ccode\u003elhs\u003c/code\u003e equals \u003ccode\u003erhs\u003c/code\u003e \n     * then their hash codes MUST be identical.\n     * \n     * @param lhs The Left-Hand-Side of the equals test\n     * @param rhs The Right-Hand-Side of the equals test\n     * @param testTransients wether to test transient fields\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 119,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "string"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "s"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.TestFixture.TestFixture(int, char, java.lang.String, short)",
      "begin_line": 125,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 126,col 13)-(line 126,col 23)",
        "(line 127,col 13)-(line 127,col 23)",
        "(line 128,col 13)-(line 128,col 33)",
        "(line 129,col 13)-(line 129,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SubTestFixture",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.TestFixture"
      ],
      "begin_line": 133,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tString"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.SubTestFixture.SubTestFixture(int, char, java.lang.String, short, java.lang.String)",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 137,col 13)-(line 137,col 35)",
        "(line 138,col 13)-(line 138,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AllTransientFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 142,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "string"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "s"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.AllTransientFixture.AllTransientFixture(int, char, java.lang.String, short)",
      "begin_line": 148,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 149,col 13)-(line 149,col 23)",
        "(line 150,col 13)-(line 150,col 23)",
        "(line 151,col 13)-(line 151,col 33)",
        "(line 152,col 13)-(line 152,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SubAllTransientFixture",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.AllTransientFixture"
      ],
      "begin_line": 156,
      "end_line": 163,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tString"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.SubAllTransientFixture.SubAllTransientFixture(int, char, java.lang.String, short, java.lang.String)",
      "begin_line": 159,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 160,col 13)-(line 160,col 35)",
        "(line 161,col 13)-(line 161,col 35)"
      ]
    }
  ]
}