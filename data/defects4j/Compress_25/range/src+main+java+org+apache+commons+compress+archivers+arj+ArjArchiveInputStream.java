{
  "filepath": "/tmp/Compress-25b/src/main/java/org/apache/commons/compress/archivers/arj/ArjArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArjArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 42,
      "end_line": 349,
      "comment": "\n * Implements the \"arj\" archive format as an InputStream.\n * \u003cp\u003e\n * \u003ca href\u003d\"http://farmanager.com/svn/trunk/plugins/multiarc/arc.doc/arj.txt\"\u003eReference\u003c/a\u003e\n * @NotThreadSafe\n * @since 1.6\n "
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
        "charsetName"
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
      "comment": "\n     * Constructs the ArjInputStream, taking ownership of the inputStream that is passed in.\n     * @param inputStream the underlying stream, whose ownership is taken\n     * @param charsetName the charset used for file names and comments\n     *   in the archive\n     * @throws ArchiveException\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 46)",
        "(line 61,col 9)-(line 61,col 39)",
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
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.read8(java.io.DataInputStream)",
      "begin_line": 91,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 46)",
        "(line 93,col 9)-(line 93,col 17)",
        "(line 94,col 9)-(line 94,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.read16(java.io.DataInputStream)",
      "begin_line": 97,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 53)",
        "(line 99,col 9)-(line 99,col 17)",
        "(line 100,col 9)-(line 100,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.read32(java.io.DataInputStream)",
      "begin_line": 103,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 43)",
        "(line 105,col 9)-(line 105,col 17)",
        "(line 106,col 9)-(line 106,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readString(java.io.DataInputStream)",
      "begin_line": 109,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 73)",
        "(line 111,col 9)-(line 111,col 21)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readFully(java.io.DataInputStream, byte[])",
      "begin_line": 123,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 28)",
        "(line 126,col 9)-(line 126,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readHeader()",
      "begin_line": 129,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 30)",
        "(line 131,col 9)-(line 131,col 39)",
        "(line 132,col 9)-(line 154,col 25)",
        "(line 155,col 9)-(line 155,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readMainHeader()",
      "begin_line": 158,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 53)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 164,col 60)",
        "(line 166,col 9)-(line 166,col 67)",
        "(line 167,col 9)-(line 167,col 70)",
        "(line 168,col 9)-(line 168,col 48)",
        "(line 169,col 9)-(line 170,col 60)",
        "(line 172,col 9)-(line 172,col 48)",
        "(line 173,col 9)-(line 173,col 67)",
        "(line 174,col 9)-(line 174,col 65)",
        "(line 175,col 9)-(line 175,col 52)",
        "(line 176,col 9)-(line 176,col 54)",
        "(line 177,col 9)-(line 177,col 61)",
        "(line 178,col 9)-(line 178,col 54)",
        "(line 179,col 9)-(line 179,col 54)",
        "(line 180,col 9)-(line 180,col 50)",
        "(line 181,col 9)-(line 181,col 51)",
        "(line 182,col 9)-(line 182,col 60)",
        "(line 183,col 9)-(line 183,col 63)",
        "(line 184,col 9)-(line 184,col 51)",
        "(line 185,col 9)-(line 185,col 57)",
        "(line 186,col 9)-(line 186,col 28)",
        "(line 187,col 9)-(line 187,col 63)",
        "(line 188,col 9)-(line 188,col 57)",
        "(line 190,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 43)",
        "(line 198,col 9)-(line 198,col 46)",
        "(line 200,col 9)-(line 200,col 51)",
        "(line 201,col 9)-(line 210,col 9)",
        "(line 212,col 9)-(line 212,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readLocalFileHeader()",
      "begin_line": 215,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 53)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 221,col 60)",
        "(line 223,col 9)-(line 223,col 67)",
        "(line 224,col 9)-(line 224,col 70)",
        "(line 225,col 9)-(line 225,col 48)",
        "(line 226,col 9)-(line 227,col 60)",
        "(line 229,col 9)-(line 229,col 70)",
        "(line 230,col 9)-(line 230,col 79)",
        "(line 231,col 9)-(line 231,col 77)",
        "(line 232,col 9)-(line 232,col 64)",
        "(line 233,col 9)-(line 233,col 66)",
        "(line 234,col 9)-(line 234,col 64)",
        "(line 235,col 9)-(line 235,col 66)",
        "(line 236,col 9)-(line 236,col 66)",
        "(line 237,col 9)-(line 237,col 63)",
        "(line 238,col 9)-(line 238,col 75)",
        "(line 239,col 9)-(line 239,col 73)",
        "(line 240,col 9)-(line 240,col 74)",
        "(line 241,col 9)-(line 241,col 63)",
        "(line 242,col 9)-(line 242,col 61)",
        "(line 243,col 9)-(line 243,col 28)",
        "(line 244,col 9)-(line 244,col 70)",
        "(line 245,col 9)-(line 245,col 69)",
        "(line 247,col 9)-(line 247,col 69)",
        "(line 249,col 9)-(line 249,col 55)",
        "(line 250,col 9)-(line 250,col 58)",
        "(line 252,col 9)-(line 252,col 68)",
        "(line 253,col 9)-(line 253,col 31)",
        "(line 254,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 102)",
        "(line 267,col 9)-(line 267,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readExtraData(int, java.io.DataInputStream, org.apache.commons.compress.archivers.arj.LocalFileHeader)",
      "begin_line": 270,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 272,col 9)-(line 281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byte[], int)",
      "begin_line": 293,
      "end_line": 297,
      "comment": "\n     * Checks if the signature matches what is expected for an arj file.\n     *\n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is an arj archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 296,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.getArchiveName()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * Gets the archive\u0027s recorded name.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.getArchiveComment()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * Gets the archive\u0027s comment.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.getNextEntry()",
      "begin_line": 313,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 321,col 9)",
        "(line 323,col 9)-(line 323,col 55)",
        "(line 324,col 9)-(line 334,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 337,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.read(byte[], int, int)",
      "begin_line": 342,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 52)"
      ]
    }
  ]
}