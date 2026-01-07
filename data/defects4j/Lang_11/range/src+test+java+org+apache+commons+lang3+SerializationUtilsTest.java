{
  "filepath": "/tmp/Lang-11b/src/test/java/org/apache/commons/lang3/SerializationUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SerializationUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 416,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.SerializationUtils}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CLASS_NOT_FOUND_MESSAGE"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SERIALIZE_IO_EXCEPTION_MESSAGE"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iString"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iInteger"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iMap"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.setUp()",
      "begin_line": 56,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 24)",
        "(line 59,col 9)-(line 59,col 38)",
        "(line 60,col 9)-(line 60,col 45)",
        "(line 61,col 9)-(line 61,col 33)",
        "(line 62,col 9)-(line 62,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testConstructor()",
      "begin_line": 67,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 48)",
        "(line 70,col 9)-(line 70,col 83)",
        "(line 71,col 9)-(line 71,col 37)",
        "(line 72,col 9)-(line 72,col 70)",
        "(line 73,col 9)-(line 73,col 87)",
        "(line 74,col 9)-(line 74,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testException()",
      "begin_line": 77,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 37)",
        "(line 80,col 9)-(line 80,col 39)",
        "(line 82,col 9)-(line 82,col 45)",
        "(line 83,col 9)-(line 83,col 45)",
        "(line 84,col 9)-(line 84,col 43)",
        "(line 86,col 9)-(line 86,col 54)",
        "(line 87,col 9)-(line 87,col 50)",
        "(line 88,col 9)-(line 88,col 43)",
        "(line 90,col 9)-(line 90,col 47)",
        "(line 91,col 9)-(line 91,col 64)",
        "(line 92,col 9)-(line 92,col 41)",
        "(line 94,col 9)-(line 94,col 58)",
        "(line 95,col 9)-(line 95,col 50)",
        "(line 96,col 9)-(line 96,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeStream()",
      "begin_line": 101,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 71)",
        "(line 104,col 9)-(line 104,col 55)",
        "(line 106,col 9)-(line 106,col 71)",
        "(line 107,col 9)-(line 107,col 68)",
        "(line 108,col 9)-(line 108,col 30)",
        "(line 109,col 9)-(line 109,col 20)",
        "(line 110,col 9)-(line 110,col 20)",
        "(line 112,col 9)-(line 112,col 52)",
        "(line 113,col 9)-(line 113,col 52)",
        "(line 114,col 9)-(line 114,col 57)",
        "(line 115,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamUnserializable()",
      "begin_line": 120,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 71)",
        "(line 123,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamNullObj()",
      "begin_line": 132,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 71)",
        "(line 135,col 9)-(line 135,col 55)",
        "(line 137,col 9)-(line 137,col 71)",
        "(line 138,col 9)-(line 138,col 68)",
        "(line 139,col 9)-(line 139,col 30)",
        "(line 140,col 9)-(line 140,col 20)",
        "(line 141,col 9)-(line 141,col 20)",
        "(line 143,col 9)-(line 143,col 52)",
        "(line 144,col 9)-(line 144,col 52)",
        "(line 145,col 9)-(line 145,col 57)",
        "(line 146,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamObjNull()",
      "begin_line": 151,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamNullNull()",
      "begin_line": 161,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeIOException()",
      "begin_line": 171,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 180,col 10)",
        "(line 181,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.Anonymous-3f021024-b76d-4547-b323-92e10f80e620.write(int)",
      "begin_line": 176,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 178,col 17)-(line 178,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStream()",
      "begin_line": 191,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 71)",
        "(line 194,col 9)-(line 194,col 68)",
        "(line 195,col 9)-(line 195,col 30)",
        "(line 196,col 9)-(line 196,col 20)",
        "(line 197,col 9)-(line 197,col 20)",
        "(line 199,col 9)-(line 199,col 89)",
        "(line 200,col 9)-(line 200,col 61)",
        "(line 201,col 9)-(line 201,col 28)",
        "(line 202,col 9)-(line 202,col 50)",
        "(line 203,col 9)-(line 203,col 33)",
        "(line 204,col 9)-(line 204,col 53)",
        "(line 205,col 9)-(line 205,col 50)",
        "(line 206,col 9)-(line 206,col 50)",
        "(line 207,col 9)-(line 207,col 51)",
        "(line 208,col 9)-(line 208,col 51)",
        "(line 209,col 9)-(line 209,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeClassCastException()",
      "begin_line": 212,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 37)",
        "(line 215,col 9)-(line 215,col 64)",
        "(line 216,col 9)-(line 216,col 79)",
        "(line 218,col 9)-(line 218,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamOfNull()",
      "begin_line": 221,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 71)",
        "(line 224,col 9)-(line 224,col 68)",
        "(line 225,col 9)-(line 225,col 30)",
        "(line 226,col 9)-(line 226,col 20)",
        "(line 227,col 9)-(line 227,col 20)",
        "(line 229,col 9)-(line 229,col 89)",
        "(line 230,col 9)-(line 230,col 61)",
        "(line 231,col 9)-(line 231,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamNull()",
      "begin_line": 234,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 236,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamBadStream()",
      "begin_line": 244,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamClassNotFound()",
      "begin_line": 254,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 71)",
        "(line 257,col 9)-(line 257,col 68)",
        "(line 258,col 9)-(line 258,col 58)",
        "(line 259,col 9)-(line 259,col 20)",
        "(line 260,col 9)-(line 260,col 20)",
        "(line 262,col 9)-(line 262,col 89)",
        "(line 263,col 9)-(line 268,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytes()",
      "begin_line": 273,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 62)",
        "(line 277,col 9)-(line 277,col 71)",
        "(line 278,col 9)-(line 278,col 68)",
        "(line 279,col 9)-(line 279,col 30)",
        "(line 280,col 9)-(line 280,col 20)",
        "(line 281,col 9)-(line 281,col 20)",
        "(line 283,col 9)-(line 283,col 52)",
        "(line 284,col 9)-(line 284,col 57)",
        "(line 285,col 9)-(line 287,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytesUnserializable()",
      "begin_line": 290,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 292,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytesNull()",
      "begin_line": 301,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 62)",
        "(line 305,col 9)-(line 305,col 71)",
        "(line 306,col 9)-(line 306,col 68)",
        "(line 307,col 9)-(line 307,col 30)",
        "(line 308,col 9)-(line 308,col 20)",
        "(line 309,col 9)-(line 309,col 20)",
        "(line 311,col 9)-(line 311,col 52)",
        "(line 312,col 9)-(line 312,col 57)",
        "(line 313,col 9)-(line 315,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytes()",
      "begin_line": 320,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 71)",
        "(line 323,col 9)-(line 323,col 68)",
        "(line 324,col 9)-(line 324,col 30)",
        "(line 325,col 9)-(line 325,col 20)",
        "(line 326,col 9)-(line 326,col 20)",
        "(line 328,col 9)-(line 328,col 79)",
        "(line 329,col 9)-(line 329,col 28)",
        "(line 330,col 9)-(line 330,col 50)",
        "(line 331,col 9)-(line 331,col 33)",
        "(line 332,col 9)-(line 332,col 53)",
        "(line 333,col 9)-(line 333,col 50)",
        "(line 334,col 9)-(line 334,col 50)",
        "(line 335,col 9)-(line 335,col 51)",
        "(line 336,col 9)-(line 336,col 51)",
        "(line 337,col 9)-(line 337,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesOfNull()",
      "begin_line": 340,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 71)",
        "(line 343,col 9)-(line 343,col 68)",
        "(line 344,col 9)-(line 344,col 30)",
        "(line 345,col 9)-(line 345,col 20)",
        "(line 346,col 9)-(line 346,col 20)",
        "(line 348,col 9)-(line 348,col 79)",
        "(line 349,col 9)-(line 349,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesNull()",
      "begin_line": 352,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 354,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesBadStream()",
      "begin_line": 362,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 364,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testClone()",
      "begin_line": 374,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 53)",
        "(line 377,col 9)-(line 377,col 28)",
        "(line 378,col 9)-(line 378,col 49)",
        "(line 379,col 9)-(line 379,col 33)",
        "(line 380,col 9)-(line 380,col 53)",
        "(line 381,col 9)-(line 381,col 50)",
        "(line 382,col 9)-(line 382,col 50)",
        "(line 383,col 9)-(line 383,col 51)",
        "(line 384,col 9)-(line 384,col 51)",
        "(line 385,col 9)-(line 385,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testCloneNull()",
      "begin_line": 388,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 53)",
        "(line 391,col 9)-(line 391,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testCloneUnserializable()",
      "begin_line": 394,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 396,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 402,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testPrimitiveTypeClassSerialization()",
      "begin_line": 405,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 407,col 9)-(line 408,col 56)",
        "(line 410,col 9)-(line 413,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassNotFoundSerialization",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 418,
      "end_line": 425,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassNotFoundSerialization.readObject(java.io.ObjectInputStream)",
      "begin_line": 422,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 89)"
      ]
    }
  ]
}