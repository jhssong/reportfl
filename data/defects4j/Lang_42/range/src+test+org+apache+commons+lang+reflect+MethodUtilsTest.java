{
  "filepath": "/tmp/Lang-42b/src/test/org/apache/commons/lang/reflect/MethodUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MethodUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 38,
      "end_line": 334,
      "comment": "\n * Unit tests MethodUtils\n * @author mbenson\n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "TestBean",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.TestBean.bar()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 13)-(line 42,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.TestBean.bar(int)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 13)-(line 46,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.TestBean.bar(java.lang.Integer)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 13)-(line 50,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.TestBean.bar(double)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 13)-(line 54,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.TestBean.bar(java.lang.String)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 13)-(line 58,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.TestBean.bar(java.lang.Object)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 13)-(line 62,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.TestBean.foo()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 13)-(line 66,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.TestBean.foo(int)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 13)-(line 70,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.TestBean.foo(java.lang.Integer)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 13)-(line 74,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.TestBean.foo(double)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 13)-(line 78,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.TestBean.foo(java.lang.String)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 13)-(line 82,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.TestBean.foo(java.lang.Object)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 13)-(line 86,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMutable",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.mutable.Mutable"
      ],
      "begin_line": 90,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.TestMutable.getValue()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 13)-(line 92,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.TestMutable.setValue(java.lang.Object)",
      "begin_line": 95,
      "end_line": 96,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "testBean"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "classCache"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.MethodUtilsTest(java.lang.String)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 20)",
        "(line 104,col 9)-(line 104,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.suite()",
      "begin_line": 111,
      "end_line": 115,
      "comment": "\n     * Run the test cases as a suite.\n     * @return the Test\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 63)",
        "(line 113,col 9)-(line 113,col 43)",
        "(line 114,col 9)-(line 114,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.setUp()",
      "begin_line": 117,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 22)",
        "(line 119,col 9)-(line 119,col 34)",
        "(line 120,col 9)-(line 120,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.testConstructor()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.testInvokeMethod()",
      "begin_line": 127,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 129,col 47)",
        "(line 130,col 9)-(line 131,col 33)",
        "(line 132,col 9)-(line 133,col 21)",
        "(line 134,col 9)-(line 135,col 31)",
        "(line 136,col 9)-(line 137,col 31)",
        "(line 138,col 9)-(line 139,col 42)",
        "(line 140,col 9)-(line 141,col 39)",
        "(line 142,col 9)-(line 143,col 39)",
        "(line 144,col 9)-(line 145,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.testInvokeExactMethod()",
      "begin_line": 148,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 150,col 47)",
        "(line 151,col 9)-(line 152,col 33)",
        "(line 153,col 9)-(line 154,col 28)",
        "(line 155,col 9)-(line 156,col 38)",
        "(line 157,col 9)-(line 158,col 49)",
        "(line 159,col 9)-(line 161,col 46)",
        "(line 163,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.testInvokeStaticMethod()",
      "begin_line": 182,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 184,col 54)",
        "(line 185,col 9)-(line 186,col 40)",
        "(line 187,col 9)-(line 188,col 44)",
        "(line 189,col 9)-(line 190,col 54)",
        "(line 191,col 9)-(line 192,col 54)",
        "(line 193,col 9)-(line 194,col 65)",
        "(line 195,col 9)-(line 196,col 46)",
        "(line 197,col 9)-(line 198,col 62)",
        "(line 199,col 9)-(line 200,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.testInvokeExactStaticMethod()",
      "begin_line": 203,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 205,col 54)",
        "(line 206,col 9)-(line 207,col 40)",
        "(line 208,col 9)-(line 209,col 44)",
        "(line 210,col 9)-(line 211,col 54)",
        "(line 212,col 9)-(line 213,col 65)",
        "(line 214,col 9)-(line 216,col 46)",
        "(line 218,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.testGetAccessibleInterfaceMethod()",
      "begin_line": 238,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 61)",
        "(line 241,col 9)-(line 246,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.testGetAccessibleInterfaceMethodFromDescription()",
      "begin_line": 249,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 61)",
        "(line 252,col 9)-(line 256,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.testGetAccessiblePublicMethod()",
      "begin_line": 259,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 260,col 9)-(line 262,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.testGetAccessiblePublicMethodFromDescription()",
      "begin_line": 265,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 268,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.testGetMatchingAccessibleMethod()",
      "begin_line": 271,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 272,col 9)-(line 273,col 76)",
        "(line 274,col 9)-(line 275,col 52)",
        "(line 276,col 9)-(line 277,col 76)",
        "(line 278,col 9)-(line 279,col 76)",
        "(line 280,col 9)-(line 281,col 77)",
        "(line 282,col 9)-(line 283,col 74)",
        "(line 284,col 9)-(line 285,col 73)",
        "(line 286,col 9)-(line 287,col 75)",
        "(line 288,col 9)-(line 289,col 74)",
        "(line 290,col 9)-(line 291,col 79)",
        "(line 292,col 9)-(line 293,col 78)",
        "(line 294,col 9)-(line 295,col 78)",
        "(line 296,col 9)-(line 297,col 76)",
        "(line 298,col 9)-(line 299,col 73)",
        "(line 300,col 9)-(line 301,col 72)",
        "(line 302,col 9)-(line 303,col 74)",
        "(line 304,col 9)-(line 305,col 73)",
        "(line 306,col 9)-(line 307,col 75)",
        "(line 308,col 9)-(line 309,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.expectMatchingAccessibleMethodParameterTypes(java.lang.Class, java.lang.String, java.lang.Class[], java.lang.Class[])",
      "begin_line": 312,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 314,col 9)-(line 315,col 30)",
        "(line 316,col 9)-(line 318,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.toString(java.lang.Class[])",
      "begin_line": 321,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.reflect.MethodUtilsTest.singletonArray(java.lang.Class)",
      "begin_line": 325,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 53)",
        "(line 327,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 22)"
      ]
    }
  ]
}