{
  "filepath": "/tmp/Lang-15b/src/test/java/org/apache/commons/lang3/builder/HashCodeBuilderAndEqualsBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeBuilderAndEqualsBuilderTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 140,
      "comment": "\n * Tests {@link org.apache.commons.lang3.builder.HashCodeBuilder} and\n * {@link org.apache.commons.lang3.builder.EqualsBuilderTest} to insure that equal\n * objects must have equal hash codes.\n * \n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testInteger(boolean)",
      "begin_line": 34,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 44)",
        "(line 36,col 9)-(line 36,col 44)",
        "(line 37,col 9)-(line 37,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testInteger()",
      "begin_line": 40,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testIntegerWithTransients()",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testFixture()",
      "begin_line": 50,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testFixtureWithTransients()",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testFixture(boolean)",
      "begin_line": 60,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 144)",
        "(line 62,col 9)-(line 65,col 28)",
        "(line 66,col 9)-(line 69,col 28)",
        "(line 70,col 9)-(line 73,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.assertEqualsAndHashCodeContract(java.lang.Object, java.lang.Object, boolean)",
      "begin_line": 84,
      "end_line": 91,
      "comment": "\n     * Asserts that if \u003ccode\u003elhs\u003c/code\u003e equals \u003ccode\u003erhs\u003c/code\u003e \n     * then their hash codes MUST be identical.\n     * \n     * @param lhs The Left-Hand-Side of the equals test\n     * @param rhs The Right-Hand-Side of the equals test\n     * @param testTransients wether to test transient fields\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 90,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 93,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "string"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "s"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.TestFixture.TestFixture(int, char, java.lang.String, short)",
      "begin_line": 99,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 100,col 13)-(line 100,col 23)",
        "(line 101,col 13)-(line 101,col 23)",
        "(line 102,col 13)-(line 102,col 33)",
        "(line 103,col 13)-(line 103,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SubTestFixture",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.TestFixture"
      ],
      "begin_line": 107,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tString"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.SubTestFixture.SubTestFixture(int, char, java.lang.String, short, java.lang.String)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 35)",
        "(line 112,col 13)-(line 112,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AllTransientFixture",
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
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.AllTransientFixture.AllTransientFixture(int, char, java.lang.String, short)",
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
      "name": "SubAllTransientFixture",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.AllTransientFixture"
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
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.SubAllTransientFixture.SubAllTransientFixture(int, char, java.lang.String, short, java.lang.String)",
      "begin_line": 133,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 134,col 13)-(line 134,col 35)",
        "(line 135,col 13)-(line 135,col 35)"
      ]
    }
  ]
}