{
  "filepath": "/tmp/Lang-65b/src/test/org/apache/commons/lang/text/VariableFormatterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VariableFormatterTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 351,
      "comment": "\n * Test class for VariableFormatter.\n * \n * @author Oliver Heger\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "KEY_ANIMAL"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "KEY_TARGET"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REPLACE_TEMPLATE"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REPLACE_TEMPLATE_EMPTY_KEYS"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REPLACE_TEMPLATE_NO_ESCAPE"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REPLACE_TEMPLATE_NO_MARKERS"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REPLACE_TEMPLATE_NO_PREFIX"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REPLACE_TEMPLATE_NO_SUFFIX"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.getFormat()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.getMapVariableResolver()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.getValueMap()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.getValues()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.setFormat(org.apache.commons.lang.text.VariableFormatter)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.setUp()",
      "begin_line": 74,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 22)",
        "(line 76,col 9)-(line 76,col 32)",
        "(line 77,col 9)-(line 77,col 47)",
        "(line 78,col 9)-(line 78,col 40)",
        "(line 79,col 9)-(line 79,col 23)",
        "(line 80,col 9)-(line 80,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.setValueMap(java.util.Map)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.setValues(java.util.Map)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testCyclicReplacement()",
      "begin_line": 94,
      "end_line": 111,
      "comment": "\n     * Tests a cyclic replace operation. The cycle should be detected and cause an exception to be thrown.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 38)",
        "(line 96,col 9)-(line 96,col 48)",
        "(line 97,col 9)-(line 97,col 44)",
        "(line 98,col 9)-(line 98,col 57)",
        "(line 99,col 9)-(line 99,col 51)",
        "(line 100,col 9)-(line 100,col 83)",
        "(line 101,col 9)-(line 101,col 47)",
        "(line 102,col 9)-(line 102,col 47)",
        "(line 103,col 9)-(line 103,col 50)",
        "(line 104,col 9)-(line 104,col 36)",
        "(line 105,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testEscape()",
      "begin_line": 116,
      "end_line": 122,
      "comment": "\n     * Tests escaping variable references.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 60)",
        "(line 118,col 9)-(line 118,col 74)",
        "(line 119,col 9)-(line 119,col 48)",
        "(line 120,col 9)-(line 120,col 98)",
        "(line 121,col 9)-(line 121,col 120)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testInitialize()",
      "begin_line": 127,
      "end_line": 160,
      "comment": "\n     * Tests creating new \u003ccode\u003eVariableFormat\u003c/code\u003e objects.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 62)",
        "(line 129,col 9)-(line 129,col 93)",
        "(line 130,col 9)-(line 130,col 93)",
        "(line 131,col 9)-(line 131,col 94)",
        "(line 133,col 9)-(line 133,col 65)",
        "(line 134,col 9)-(line 134,col 65)",
        "(line 135,col 9)-(line 135,col 65)",
        "(line 136,col 9)-(line 136,col 66)",
        "(line 147,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testNonDefaultTokens()",
      "begin_line": 165,
      "end_line": 171,
      "comment": "\n     * Tests chaning variable prefix and suffix and the escaping character.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 65)",
        "(line 167,col 9)-(line 168,col 71)",
        "(line 169,col 9)-(line 170,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testNonInstanceMethods()",
      "begin_line": 176,
      "end_line": 183,
      "comment": "\n     * Tests invoking the static convenience methods.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 178,col 52)",
        "(line 179,col 9)-(line 179,col 38)",
        "(line 180,col 9)-(line 180,col 39)",
        "(line 181,col 9)-(line 182,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testNoResolver()",
      "begin_line": 185,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 53)",
        "(line 187,col 9)-(line 187,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testNoResolver(org.apache.commons.lang.text.VariableFormatter)",
      "begin_line": 190,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 44)",
        "(line 192,col 9)-(line 192,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testNullMap()",
      "begin_line": 195,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 66)",
        "(line 197,col 9)-(line 197,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testRecursiveReplacement()",
      "begin_line": 203,
      "end_line": 215,
      "comment": "\n     * Tests recursive replacements.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 38)",
        "(line 205,col 9)-(line 205,col 48)",
        "(line 206,col 9)-(line 206,col 44)",
        "(line 207,col 9)-(line 207,col 57)",
        "(line 208,col 9)-(line 208,col 51)",
        "(line 209,col 9)-(line 209,col 83)",
        "(line 210,col 9)-(line 210,col 47)",
        "(line 211,col 9)-(line 211,col 47)",
        "(line 212,col 9)-(line 212,col 44)",
        "(line 213,col 9)-(line 213,col 36)",
        "(line 214,col 9)-(line 214,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testReplace()",
      "begin_line": 220,
      "end_line": 228,
      "comment": "\n     * Tests typical replace operations.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 119)",
        "(line 222,col 9)-(line 222,col 37)",
        "(line 223,col 9)-(line 223,col 35)",
        "(line 224,col 9)-(line 224,col 36)",
        "(line 225,col 9)-(line 225,col 97)",
        "(line 227,col 9)-(line 227,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testReplaceEmptyKeys()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * Tests a replace template with missing empty marker strings.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testReplaceNoElement(java.lang.String)",
      "begin_line": 237,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 93)",
        "(line 239,col 9)-(line 239,col 37)",
        "(line 240,col 9)-(line 240,col 35)",
        "(line 241,col 9)-(line 241,col 36)",
        "(line 242,col 9)-(line 242,col 97)",
        "(line 243,col 9)-(line 243,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testReplaceNoEscape()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * Tests a replace template with missing escape strings.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testReplaceNoMarkers()",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * Tests a replace template with missing marker strings.\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testReplaceNoPrefix()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n     * Tests a replace template with missing prefix strings.\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testReplaceNoSuffix()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\n     * Tests a replace template with missing postfix strings.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testReplaceNothing()",
      "begin_line": 277,
      "end_line": 282,
      "comment": "\n     * Tests source texts with nothing to replace.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 51)",
        "(line 279,col 9)-(line 279,col 59)",
        "(line 280,col 9)-(line 280,col 93)",
        "(line 281,col 9)-(line 281,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testReplaceObject()",
      "begin_line": 287,
      "end_line": 291,
      "comment": "\n     * Tests operating on objects.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 57)",
        "(line 289,col 9)-(line 289,col 82)",
        "(line 290,col 9)-(line 290,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testReplaceSystemProperties()",
      "begin_line": 296,
      "end_line": 306,
      "comment": "\n     * Tests interpolation with system properties.\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 46)",
        "(line 298,col 9)-(line 298,col 66)",
        "(line 299,col 9)-(line 299,col 46)",
        "(line 300,col 9)-(line 300,col 50)",
        "(line 301,col 9)-(line 301,col 48)",
        "(line 302,col 9)-(line 302,col 64)",
        "(line 303,col 9)-(line 305,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testReplaceWeirdPattens()",
      "begin_line": 311,
      "end_line": 329,
      "comment": "\n     * Tests interpolation with weird boundary patterns.\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 33)",
        "(line 313,col 9)-(line 313,col 36)",
        "(line 314,col 9)-(line 314,col 37)",
        "(line 315,col 9)-(line 315,col 38)",
        "(line 316,col 9)-(line 316,col 38)",
        "(line 317,col 9)-(line 317,col 38)",
        "(line 318,col 9)-(line 318,col 35)",
        "(line 319,col 9)-(line 319,col 35)",
        "(line 320,col 9)-(line 320,col 34)",
        "(line 321,col 9)-(line 321,col 37)",
        "(line 322,col 9)-(line 322,col 37)",
        "(line 323,col 9)-(line 323,col 39)",
        "(line 324,col 9)-(line 324,col 40)",
        "(line 325,col 9)-(line 325,col 41)",
        "(line 326,col 9)-(line 326,col 42)",
        "(line 327,col 9)-(line 327,col 39)",
        "(line 328,col 9)-(line 328,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.testReplaceCharArray()",
      "begin_line": 334,
      "end_line": 344,
      "comment": "\n     * Tests replace operations on char arrays.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 68)",
        "(line 336,col 9)-(line 336,col 64)",
        "(line 337,col 9)-(line 337,col 85)",
        "(line 338,col 9)-(line 338,col 53)",
        "(line 339,col 9)-(line 339,col 101)",
        "(line 340,col 9)-(line 340,col 83)",
        "(line 341,col 9)-(line 341,col 63)",
        "(line 342,col 9)-(line 342,col 35)",
        "(line 343,col 9)-(line 343,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.VariableFormatterTest.validateNoReplace(org.apache.commons.lang.text.VariableFormatter)",
      "begin_line": 346,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 48)",
        "(line 348,col 9)-(line 348,col 57)",
        "(line 349,col 9)-(line 349,col 44)"
      ]
    }
  ]
}