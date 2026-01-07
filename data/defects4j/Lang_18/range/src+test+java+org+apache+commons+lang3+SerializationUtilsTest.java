{
  "filepath": "/tmp/Lang-18b/src/test/java/org/apache/commons/lang3/SerializationUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SerializationUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 38,
      "end_line": 368,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.SerializationUtils}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CLASS_NOT_FOUND_MESSAGE"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SERIALIZE_IO_EXCEPTION_MESSAGE"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iString"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iInteger"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iMap"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.SerializationUtilsTest(java.lang.String)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.setUp()",
      "begin_line": 51,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 22)",
        "(line 55,col 9)-(line 55,col 24)",
        "(line 56,col 9)-(line 56,col 34)",
        "(line 57,col 9)-(line 57,col 45)",
        "(line 58,col 9)-(line 58,col 33)",
        "(line 59,col 9)-(line 59,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testConstructor()",
      "begin_line": 63,
      "end_line": 70,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 48)",
        "(line 65,col 9)-(line 65,col 83)",
        "(line 66,col 9)-(line 66,col 37)",
        "(line 67,col 9)-(line 67,col 70)",
        "(line 68,col 9)-(line 68,col 87)",
        "(line 69,col 9)-(line 69,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testException()",
      "begin_line": 72,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 37)",
        "(line 74,col 9)-(line 74,col 39)",
        "(line 76,col 9)-(line 76,col 45)",
        "(line 77,col 9)-(line 77,col 45)",
        "(line 78,col 9)-(line 78,col 43)",
        "(line 80,col 9)-(line 80,col 54)",
        "(line 81,col 9)-(line 81,col 50)",
        "(line 82,col 9)-(line 82,col 43)",
        "(line 84,col 9)-(line 84,col 47)",
        "(line 85,col 9)-(line 85,col 64)",
        "(line 86,col 9)-(line 86,col 41)",
        "(line 88,col 9)-(line 88,col 58)",
        "(line 89,col 9)-(line 89,col 50)",
        "(line 90,col 9)-(line 90,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeStream()",
      "begin_line": 94,
      "end_line": 110,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 71)",
        "(line 96,col 9)-(line 96,col 55)",
        "(line 98,col 9)-(line 98,col 71)",
        "(line 99,col 9)-(line 99,col 68)",
        "(line 100,col 9)-(line 100,col 30)",
        "(line 101,col 9)-(line 101,col 20)",
        "(line 102,col 9)-(line 102,col 20)",
        "(line 104,col 9)-(line 104,col 52)",
        "(line 105,col 9)-(line 105,col 52)",
        "(line 106,col 9)-(line 106,col 57)",
        "(line 107,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamUnserializable()",
      "begin_line": 112,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 71)",
        "(line 114,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamNullObj()",
      "begin_line": 123,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 71)",
        "(line 125,col 9)-(line 125,col 55)",
        "(line 127,col 9)-(line 127,col 71)",
        "(line 128,col 9)-(line 128,col 68)",
        "(line 129,col 9)-(line 129,col 30)",
        "(line 130,col 9)-(line 130,col 20)",
        "(line 131,col 9)-(line 131,col 20)",
        "(line 133,col 9)-(line 133,col 52)",
        "(line 134,col 9)-(line 134,col 52)",
        "(line 135,col 9)-(line 135,col 57)",
        "(line 136,col 9)-(line 138,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamObjNull()",
      "begin_line": 141,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamNullNull()",
      "begin_line": 150,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeIOException()",
      "begin_line": 159,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 167,col 10)",
        "(line 168,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.Anonymous-e0cf6c0b-53d3-4227-86ba-a4f8aea3cb5e.write(int)",
      "begin_line": 163,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 17)-(line 165,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStream()",
      "begin_line": 178,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 71)",
        "(line 180,col 9)-(line 180,col 68)",
        "(line 181,col 9)-(line 181,col 30)",
        "(line 182,col 9)-(line 182,col 20)",
        "(line 183,col 9)-(line 183,col 20)",
        "(line 185,col 9)-(line 185,col 89)",
        "(line 186,col 9)-(line 186,col 61)",
        "(line 187,col 9)-(line 187,col 28)",
        "(line 188,col 9)-(line 188,col 50)",
        "(line 189,col 9)-(line 189,col 33)",
        "(line 190,col 9)-(line 190,col 53)",
        "(line 191,col 9)-(line 191,col 50)",
        "(line 192,col 9)-(line 192,col 50)",
        "(line 193,col 9)-(line 193,col 51)",
        "(line 194,col 9)-(line 194,col 51)",
        "(line 195,col 9)-(line 195,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamOfNull()",
      "begin_line": 198,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 71)",
        "(line 200,col 9)-(line 200,col 68)",
        "(line 201,col 9)-(line 201,col 30)",
        "(line 202,col 9)-(line 202,col 20)",
        "(line 203,col 9)-(line 203,col 20)",
        "(line 205,col 9)-(line 205,col 89)",
        "(line 206,col 9)-(line 206,col 61)",
        "(line 207,col 9)-(line 207,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamNull()",
      "begin_line": 210,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamBadStream()",
      "begin_line": 219,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamClassNotFound()",
      "begin_line": 228,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 71)",
        "(line 230,col 9)-(line 230,col 68)",
        "(line 231,col 9)-(line 231,col 58)",
        "(line 232,col 9)-(line 232,col 20)",
        "(line 233,col 9)-(line 233,col 20)",
        "(line 235,col 9)-(line 235,col 89)",
        "(line 236,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytes()",
      "begin_line": 246,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 62)",
        "(line 249,col 9)-(line 249,col 71)",
        "(line 250,col 9)-(line 250,col 68)",
        "(line 251,col 9)-(line 251,col 30)",
        "(line 252,col 9)-(line 252,col 20)",
        "(line 253,col 9)-(line 253,col 20)",
        "(line 255,col 9)-(line 255,col 52)",
        "(line 256,col 9)-(line 256,col 57)",
        "(line 257,col 9)-(line 259,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytesUnserializable()",
      "begin_line": 262,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 263,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytesNull()",
      "begin_line": 272,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 62)",
        "(line 275,col 9)-(line 275,col 71)",
        "(line 276,col 9)-(line 276,col 68)",
        "(line 277,col 9)-(line 277,col 30)",
        "(line 278,col 9)-(line 278,col 20)",
        "(line 279,col 9)-(line 279,col 20)",
        "(line 281,col 9)-(line 281,col 52)",
        "(line 282,col 9)-(line 282,col 57)",
        "(line 283,col 9)-(line 285,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytes()",
      "begin_line": 290,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 71)",
        "(line 292,col 9)-(line 292,col 68)",
        "(line 293,col 9)-(line 293,col 30)",
        "(line 294,col 9)-(line 294,col 20)",
        "(line 295,col 9)-(line 295,col 20)",
        "(line 297,col 9)-(line 297,col 79)",
        "(line 298,col 9)-(line 298,col 28)",
        "(line 299,col 9)-(line 299,col 50)",
        "(line 300,col 9)-(line 300,col 33)",
        "(line 301,col 9)-(line 301,col 53)",
        "(line 302,col 9)-(line 302,col 50)",
        "(line 303,col 9)-(line 303,col 50)",
        "(line 304,col 9)-(line 304,col 51)",
        "(line 305,col 9)-(line 305,col 51)",
        "(line 306,col 9)-(line 306,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesOfNull()",
      "begin_line": 309,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 71)",
        "(line 311,col 9)-(line 311,col 68)",
        "(line 312,col 9)-(line 312,col 30)",
        "(line 313,col 9)-(line 313,col 20)",
        "(line 314,col 9)-(line 314,col 20)",
        "(line 316,col 9)-(line 316,col 79)",
        "(line 317,col 9)-(line 317,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesNull()",
      "begin_line": 320,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 326,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesBadStream()",
      "begin_line": 329,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 330,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testClone()",
      "begin_line": 340,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 53)",
        "(line 342,col 9)-(line 342,col 28)",
        "(line 343,col 9)-(line 343,col 49)",
        "(line 344,col 9)-(line 344,col 33)",
        "(line 345,col 9)-(line 345,col 53)",
        "(line 346,col 9)-(line 346,col 50)",
        "(line 347,col 9)-(line 347,col 50)",
        "(line 348,col 9)-(line 348,col 51)",
        "(line 349,col 9)-(line 349,col 51)",
        "(line 350,col 9)-(line 350,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testCloneNull()",
      "begin_line": 353,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 53)",
        "(line 355,col 9)-(line 355,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testCloneUnserializable()",
      "begin_line": 358,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 359,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassNotFoundSerialization",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 370,
      "end_line": 377,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassNotFoundSerialization.readObject(java.io.ObjectInputStream)",
      "begin_line": 374,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 89)"
      ]
    }
  ]
}