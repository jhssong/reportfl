{
  "filepath": "/tmp/Compress-20b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZOutputFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZOutputFile",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 525,
      "comment": "\n * Writes a 7z file.\n "
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "files"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numNonEmptyStreams"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc32"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileBytesWritten"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.SevenZOutputFile(java.io.File)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 52)",
        "(line 47,col 9)-(line 47,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.close()",
      "begin_line": 50,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 57,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 60,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 66)",
        "(line 63,col 9)-(line 63,col 52)",
        "(line 64,col 9)-(line 64,col 33)",
        "(line 65,col 9)-(line 65,col 43)",
        "(line 66,col 9)-(line 66,col 70)",
        "(line 67,col 9)-(line 67,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 75)",
        "(line 72,col 9)-(line 72,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry()",
      "begin_line": 75,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 69)",
        "(line 77,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 22)",
        "(line 89,col 9)-(line 89,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(int)",
      "begin_line": 92,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 22)",
        "(line 94,col 9)-(line 94,col 24)",
        "(line 95,col 9)-(line 95,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(byte[])",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(byte[], int, int)",
      "begin_line": 102,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 32)",
        "(line 104,col 9)-(line 104,col 34)",
        "(line 105,col 9)-(line 105,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.finish()",
      "begin_line": 108,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 24)",
        "(line 114,col 9)-(line 114,col 58)",
        "(line 116,col 9)-(line 116,col 77)",
        "(line 117,col 9)-(line 117,col 73)",
        "(line 119,col 9)-(line 119,col 28)",
        "(line 120,col 9)-(line 120,col 23)",
        "(line 121,col 9)-(line 121,col 60)",
        "(line 122,col 9)-(line 122,col 32)",
        "(line 124,col 9)-(line 124,col 40)",
        "(line 127,col 9)-(line 127,col 21)",
        "(line 128,col 9)-(line 128,col 47)",
        "(line 130,col 9)-(line 130,col 22)",
        "(line 131,col 9)-(line 131,col 22)",
        "(line 134,col 9)-(line 134,col 82)",
        "(line 135,col 9)-(line 135,col 89)",
        "(line 136,col 9)-(line 136,col 106)",
        "(line 137,col 9)-(line 137,col 89)",
        "(line 138,col 9)-(line 138,col 22)",
        "(line 139,col 9)-(line 139,col 34)",
        "(line 140,col 9)-(line 140,col 80)",
        "(line 141,col 9)-(line 141,col 34)",
        "(line 142,col 9)-(line 142,col 70)",
        "(line 143,col 9)-(line 143,col 22)",
        "(line 144,col 9)-(line 144,col 39)",
        "(line 145,col 9)-(line 145,col 67)",
        "(line 146,col 9)-(line 146,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader(java.io.DataOutput)",
      "begin_line": 149,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 34)",
        "(line 152,col 9)-(line 152,col 43)",
        "(line 153,col 9)-(line 153,col 33)",
        "(line 154,col 9)-(line 154,col 31)",
        "(line 155,col 9)-(line 155,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(java.io.DataOutput)",
      "begin_line": 158,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 162,col 9)",
        "(line 164,col 9)-(line 164,col 36)",
        "(line 166,col 9)-(line 166,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(java.io.DataOutput)",
      "begin_line": 169,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 36)",
        "(line 173,col 9)-(line 173,col 31)",
        "(line 174,col 9)-(line 174,col 62)",
        "(line 176,col 9)-(line 176,col 32)",
        "(line 177,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 31)",
        "(line 184,col 9)-(line 184,col 24)",
        "(line 185,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 191,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo(java.io.DataOutput)",
      "begin_line": 194,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 38)",
        "(line 197,col 9)-(line 197,col 34)",
        "(line 199,col 9)-(line 199,col 48)",
        "(line 200,col 9)-(line 200,col 24)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 44)",
        "(line 206,col 9)-(line 210,col 9)",
        "(line 212,col 9)-(line 212,col 31)",
        "(line 213,col 9)-(line 213,col 24)",
        "(line 214,col 9)-(line 218,col 9)",
        "(line 220,col 9)-(line 220,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder(java.io.DataOutput)",
      "begin_line": 223,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 31)",
        "(line 225,col 9)-(line 225,col 24)",
        "(line 226,col 9)-(line 226,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo(java.io.DataOutput)",
      "begin_line": 229,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 42)",
        "(line 240,col 9)-(line 240,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo(java.io.DataOutput)",
      "begin_line": 243,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 37)",
        "(line 246,col 9)-(line 246,col 42)",
        "(line 248,col 9)-(line 248,col 38)",
        "(line 249,col 9)-(line 249,col 36)",
        "(line 250,col 9)-(line 250,col 35)",
        "(line 251,col 9)-(line 251,col 31)",
        "(line 252,col 9)-(line 252,col 32)",
        "(line 253,col 9)-(line 253,col 32)",
        "(line 254,col 9)-(line 254,col 32)",
        "(line 255,col 9)-(line 255,col 43)",
        "(line 256,col 9)-(line 256,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams(java.io.DataOutput)",
      "begin_line": 259,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 40)",
        "(line 261,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 280,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyFiles(java.io.DataOutput)",
      "begin_line": 283,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 38)",
        "(line 285,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 304,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileAntiItems(java.io.DataOutput)",
      "begin_line": 307,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 37)",
        "(line 309,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 328,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileNames(java.io.DataOutput)",
      "begin_line": 331,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 32)",
        "(line 334,col 9)-(line 334,col 71)",
        "(line 335,col 9)-(line 335,col 64)",
        "(line 336,col 9)-(line 336,col 21)",
        "(line 337,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 341,col 20)",
        "(line 342,col 9)-(line 342,col 51)",
        "(line 343,col 9)-(line 343,col 45)",
        "(line 344,col 9)-(line 344,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes(java.io.DataOutput)",
      "begin_line": 347,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 33)",
        "(line 349,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 380,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes(java.io.DataOutput)",
      "begin_line": 383,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 31)",
        "(line 385,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 416,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes(java.io.DataOutput)",
      "begin_line": 419,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 37)",
        "(line 421,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 452,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes(java.io.DataOutput)",
      "begin_line": 455,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 37)",
        "(line 457,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 487,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(java.io.DataOutput, long)",
      "begin_line": 490,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 26)",
        "(line 492,col 9)-(line 492,col 24)",
        "(line 493,col 9)-(line 493,col 14)",
        "(line 494,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 502,col 32)",
        "(line 503,col 9)-(line 506,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits(java.io.DataOutput, java.util.BitSet, int)",
      "begin_line": 509,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 22)",
        "(line 511,col 9)-(line 511,col 22)",
        "(line 512,col 9)-(line 520,col 9)",
        "(line 521,col 9)-(line 523,col 9)"
      ]
    }
  ]
}