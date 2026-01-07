{
  "filepath": "/tmp/Compress-21b/src/main/java/org/apache/commons/compress/archivers/arj/ArjArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArjArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 41,
      "end_line": 347,
      "comment": "\n * Implements the \"arj\" archive format as an InputStream.\n * \u003cp\u003e\n * \u003ca href\u003d\"http://farmanager.com/svn/trunk/plugins/multiarc/arc.doc/arj.txt\"\u003eReference\u003c/a\u003e\n * @NotThreadSafe\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "ARJ_MAGIC_1"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ARJ_MAGIC_2"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charsetName"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mainHeader"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentLocalFileHeader"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentInputStream"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.ArjArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 57,
      "end_line": 72,
      "comment": "\n     * Constructs the ArjInputStream, taking ownership of the inputStream that is passed in.\n     * @param inputStream the underlying stream, whose ownership is taken\n     * @param charsetName the charset used for file names and comments\n     *   in the archive\n     * @throws ArchiveException\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 46)",
        "(line 60,col 9)-(line 60,col 39)",
        "(line 61,col 9)-(line 71,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.ArjArchiveInputStream(java.io.InputStream)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Constructs the ArjInputStream, taking ownership of the inputStream that is passed in,\n     * and using the CP437 character encoding.\n     * @param inputStream the underlying stream, whose ownership is taken\n     * @throws ArchiveException\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.close()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.read8(java.io.DataInputStream)",
      "begin_line": 90,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 42)",
        "(line 92,col 9)-(line 92,col 17)",
        "(line 93,col 9)-(line 93,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.read16(java.io.DataInputStream)",
      "begin_line": 96,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 49)",
        "(line 98,col 9)-(line 98,col 17)",
        "(line 99,col 9)-(line 99,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.read32(java.io.DataInputStream)",
      "begin_line": 102,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 39)",
        "(line 104,col 9)-(line 104,col 17)",
        "(line 105,col 9)-(line 105,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readString(java.io.DataInputStream)",
      "begin_line": 108,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 73)",
        "(line 110,col 9)-(line 110,col 21)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readFully(java.io.DataInputStream, byte[])",
      "begin_line": 121,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 24)",
        "(line 124,col 9)-(line 124,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readHeader()",
      "begin_line": 127,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 30)",
        "(line 129,col 9)-(line 129,col 39)",
        "(line 130,col 9)-(line 152,col 25)",
        "(line 153,col 9)-(line 153,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readMainHeader()",
      "begin_line": 156,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 53)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 162,col 60)",
        "(line 164,col 9)-(line 164,col 67)",
        "(line 165,col 9)-(line 165,col 70)",
        "(line 166,col 9)-(line 166,col 48)",
        "(line 167,col 9)-(line 168,col 60)",
        "(line 170,col 9)-(line 170,col 55)",
        "(line 171,col 9)-(line 171,col 74)",
        "(line 172,col 9)-(line 172,col 72)",
        "(line 173,col 9)-(line 173,col 59)",
        "(line 174,col 9)-(line 174,col 61)",
        "(line 175,col 9)-(line 175,col 68)",
        "(line 176,col 9)-(line 176,col 61)",
        "(line 177,col 9)-(line 177,col 61)",
        "(line 178,col 9)-(line 178,col 57)",
        "(line 179,col 9)-(line 179,col 58)",
        "(line 180,col 9)-(line 180,col 67)",
        "(line 181,col 9)-(line 181,col 70)",
        "(line 182,col 9)-(line 182,col 58)",
        "(line 183,col 9)-(line 183,col 64)",
        "(line 184,col 9)-(line 184,col 28)",
        "(line 185,col 9)-(line 185,col 70)",
        "(line 186,col 9)-(line 186,col 64)",
        "(line 188,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 195,col 50)",
        "(line 196,col 9)-(line 196,col 53)",
        "(line 198,col 9)-(line 198,col 51)",
        "(line 199,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readLocalFileHeader()",
      "begin_line": 213,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 53)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 219,col 60)",
        "(line 221,col 9)-(line 221,col 67)",
        "(line 222,col 9)-(line 222,col 70)",
        "(line 223,col 9)-(line 223,col 48)",
        "(line 224,col 9)-(line 225,col 60)",
        "(line 227,col 9)-(line 227,col 70)",
        "(line 228,col 9)-(line 228,col 79)",
        "(line 229,col 9)-(line 229,col 77)",
        "(line 230,col 9)-(line 230,col 64)",
        "(line 231,col 9)-(line 231,col 66)",
        "(line 232,col 9)-(line 232,col 64)",
        "(line 233,col 9)-(line 233,col 66)",
        "(line 234,col 9)-(line 234,col 66)",
        "(line 235,col 9)-(line 235,col 63)",
        "(line 236,col 9)-(line 236,col 75)",
        "(line 237,col 9)-(line 237,col 73)",
        "(line 238,col 9)-(line 238,col 74)",
        "(line 239,col 9)-(line 239,col 63)",
        "(line 240,col 9)-(line 240,col 61)",
        "(line 241,col 9)-(line 241,col 28)",
        "(line 242,col 9)-(line 242,col 70)",
        "(line 243,col 9)-(line 243,col 69)",
        "(line 245,col 9)-(line 245,col 69)",
        "(line 247,col 9)-(line 247,col 55)",
        "(line 248,col 9)-(line 248,col 58)",
        "(line 250,col 9)-(line 250,col 68)",
        "(line 251,col 9)-(line 251,col 31)",
        "(line 252,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 102)",
        "(line 265,col 9)-(line 265,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readExtraData(int, java.io.DataInputStream, org.apache.commons.compress.archivers.arj.LocalFileHeader)",
      "begin_line": 268,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 279,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byte[], int)",
      "begin_line": 291,
      "end_line": 295,
      "comment": "\n     * Checks if the signature matches what is expected for an arj file.\n     *\n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is an arj archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 294,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.getArchiveName()",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n     * Gets the archive\u0027s recorded name.\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.getArchiveComment()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * Gets the archive\u0027s comment.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.getNextEntry()",
      "begin_line": 311,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 313,col 9)-(line 319,col 9)",
        "(line 321,col 9)-(line 321,col 55)",
        "(line 322,col 9)-(line 332,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 335,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.read(byte[], int, int)",
      "begin_line": 340,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 52)"
      ]
    }
  ]
}