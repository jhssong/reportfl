{
  "filepath": "/tmp/Compress-19b/src/main/java/org/apache/commons/compress/archivers/arj/ArjArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArjArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 41,
      "end_line": 321,
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
      "comment": "\n     * Constructs the ArjInputStream, taking ownership of the inputStream that is passed in.\n     * @param inputStream the underlying stream, whose ownership is taken\n     * @param charset the charset used for file names and comments\n     *   in the archive\n     * @throws IOException\n     ",
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
      "comment": "\n     * Constructs the ArjInputStream, taking ownership of the inputStream that is passed in,\n     * and using the CP437 character encoding.\n     * @param inputStream the underlying stream, whose ownership is taken\n     * @throws IOException\n     ",
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
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.read16(java.io.DataInputStream)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 49)",
        "(line 102,col 9)-(line 102,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readString(java.io.DataInputStream)",
      "begin_line": 105,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 73)",
        "(line 107,col 9)-(line 107,col 21)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readHeader()",
      "begin_line": 114,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 30)",
        "(line 116,col 9)-(line 116,col 39)",
        "(line 117,col 9)-(line 139,col 25)",
        "(line 140,col 9)-(line 140,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readMainHeader()",
      "begin_line": 143,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 53)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 149,col 60)",
        "(line 151,col 9)-(line 151,col 67)",
        "(line 152,col 9)-(line 152,col 70)",
        "(line 153,col 9)-(line 153,col 48)",
        "(line 154,col 9)-(line 155,col 60)",
        "(line 157,col 9)-(line 157,col 55)",
        "(line 158,col 9)-(line 158,col 74)",
        "(line 159,col 9)-(line 159,col 72)",
        "(line 160,col 9)-(line 160,col 59)",
        "(line 161,col 9)-(line 161,col 61)",
        "(line 162,col 9)-(line 162,col 68)",
        "(line 163,col 9)-(line 163,col 61)",
        "(line 164,col 9)-(line 164,col 61)",
        "(line 165,col 9)-(line 165,col 81)",
        "(line 166,col 9)-(line 166,col 82)",
        "(line 167,col 9)-(line 167,col 91)",
        "(line 168,col 9)-(line 168,col 94)",
        "(line 169,col 9)-(line 169,col 58)",
        "(line 170,col 9)-(line 170,col 64)",
        "(line 171,col 9)-(line 171,col 70)",
        "(line 172,col 9)-(line 172,col 64)",
        "(line 174,col 9)-(line 180,col 9)",
        "(line 182,col 9)-(line 182,col 50)",
        "(line 183,col 9)-(line 183,col 53)",
        "(line 185,col 9)-(line 185,col 51)",
        "(line 186,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 37)",
        "(line 199,col 9)-(line 199,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readLocalFileHeader()",
      "begin_line": 202,
      "end_line": 262,
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
        "(line 259,col 9)-(line 259,col 42)",
        "(line 261,col 9)-(line 261,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byte[], int)",
      "begin_line": 264,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 267,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.getArchiveName()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.getArchiveComment()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.getNextEntry()",
      "begin_line": 278,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 285,col 9)",
        "(line 287,col 9)-(line 287,col 55)",
        "(line 288,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 301,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.read()",
      "begin_line": 306,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.read(byte[], int, int)",
      "begin_line": 314,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 52)"
      ]
    }
  ]
}