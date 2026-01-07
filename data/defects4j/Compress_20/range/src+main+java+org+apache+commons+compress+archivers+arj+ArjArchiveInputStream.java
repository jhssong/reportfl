{
  "filepath": "/tmp/Compress-20b/src/main/java/org/apache/commons/compress/archivers/arj/ArjArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArjArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 41,
      "end_line": 323,
      "comment": "\n * Implements the \"arj\" archive format as an InputStream.\n * \u003cp\u003e\n * \u003ca href\u003d\"http://farmanager.com/svn/trunk/plugins/multiarc/arc.doc/arj.txt\"\u003eReference\u003c/a\u003e\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEBUG"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ARJ_MAGIC_1"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ARJ_MAGIC_2"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mainHeader"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentLocalFileHeader"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentInputStream"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.ArjArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 58,
      "end_line": 73,
      "comment": "\n     * Constructs the ArjInputStream, taking ownership of the inputStream that is passed in.\n     * @param inputStream the underlying stream, whose ownership is taken\n     * @param charset the charset used for file names and comments\n     *   in the archive\n     * @throws ArchiveException\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 46)",
        "(line 61,col 9)-(line 61,col 31)",
        "(line 62,col 9)-(line 72,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.ArjArchiveInputStream(java.io.InputStream)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Constructs the ArjInputStream, taking ownership of the inputStream that is passed in,\n     * and using the CP437 character encoding.\n     * @param inputStream the underlying stream, whose ownership is taken\n     * @throws ArchiveException\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.close()",
      "begin_line": 86,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.debug(java.lang.String)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.read16(java.io.DataInputStream)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 49)",
        "(line 100,col 9)-(line 100,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readString(java.io.DataInputStream)",
      "begin_line": 103,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 73)",
        "(line 105,col 9)-(line 105,col 21)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readHeader()",
      "begin_line": 112,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 30)",
        "(line 114,col 9)-(line 114,col 39)",
        "(line 115,col 9)-(line 137,col 25)",
        "(line 138,col 9)-(line 138,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readMainHeader()",
      "begin_line": 141,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 53)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 147,col 60)",
        "(line 149,col 9)-(line 149,col 67)",
        "(line 150,col 9)-(line 150,col 70)",
        "(line 151,col 9)-(line 151,col 48)",
        "(line 152,col 9)-(line 153,col 60)",
        "(line 155,col 9)-(line 155,col 55)",
        "(line 156,col 9)-(line 156,col 74)",
        "(line 157,col 9)-(line 157,col 72)",
        "(line 158,col 9)-(line 158,col 59)",
        "(line 159,col 9)-(line 159,col 61)",
        "(line 160,col 9)-(line 160,col 68)",
        "(line 161,col 9)-(line 161,col 61)",
        "(line 162,col 9)-(line 162,col 61)",
        "(line 163,col 9)-(line 163,col 81)",
        "(line 164,col 9)-(line 164,col 82)",
        "(line 165,col 9)-(line 165,col 91)",
        "(line 166,col 9)-(line 166,col 94)",
        "(line 167,col 9)-(line 167,col 58)",
        "(line 168,col 9)-(line 168,col 64)",
        "(line 169,col 9)-(line 169,col 70)",
        "(line 170,col 9)-(line 170,col 64)",
        "(line 172,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 180,col 50)",
        "(line 181,col 9)-(line 181,col 53)",
        "(line 183,col 9)-(line 183,col 51)",
        "(line 184,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readLocalFileHeader()",
      "begin_line": 202,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 53)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 208,col 60)",
        "(line 210,col 9)-(line 210,col 67)",
        "(line 211,col 9)-(line 211,col 70)",
        "(line 212,col 9)-(line 212,col 48)",
        "(line 213,col 9)-(line 214,col 60)",
        "(line 216,col 9)-(line 216,col 70)",
        "(line 217,col 9)-(line 217,col 79)",
        "(line 218,col 9)-(line 218,col 77)",
        "(line 219,col 9)-(line 219,col 64)",
        "(line 220,col 9)-(line 220,col 66)",
        "(line 221,col 9)-(line 221,col 64)",
        "(line 222,col 9)-(line 222,col 66)",
        "(line 223,col 9)-(line 223,col 66)",
        "(line 224,col 9)-(line 224,col 87)",
        "(line 225,col 9)-(line 225,col 99)",
        "(line 226,col 9)-(line 226,col 97)",
        "(line 227,col 9)-(line 227,col 84)",
        "(line 228,col 9)-(line 228,col 63)",
        "(line 229,col 9)-(line 229,col 61)",
        "(line 230,col 9)-(line 230,col 70)",
        "(line 231,col 9)-(line 231,col 69)",
        "(line 233,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 55)",
        "(line 242,col 9)-(line 242,col 58)",
        "(line 244,col 9)-(line 244,col 68)",
        "(line 245,col 9)-(line 245,col 31)",
        "(line 246,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 102)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 263,col 9)-(line 263,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byte[], int)",
      "begin_line": 266,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 269,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.getArchiveName()",
      "begin_line": 272,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.getArchiveComment()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.getNextEntry()",
      "begin_line": 280,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 289,col 55)",
        "(line 290,col 9)-(line 300,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 303,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.read()",
      "begin_line": 308,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.read(byte[], int, int)",
      "begin_line": 316,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 321,col 52)"
      ]
    }
  ]
}