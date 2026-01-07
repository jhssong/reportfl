{
  "filepath": "/tmp/Compress-43b/src/main/java/org/apache/commons/compress/archivers/arj/ArjArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArjArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 42,
      "end_line": 353,
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
      "comment": "\n     * Constructs the ArjInputStream, taking ownership of the inputStream that is passed in.\n     * @param inputStream the underlying stream, whose ownership is taken\n     * @param charsetName the charset used for file names and comments\n     *   in the archive. May be {@code null} to use the platform default.\n     * @throws ArchiveException if an exception occurs while reading\n     ",
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
      "comment": "\n     * Constructs the ArjInputStream, taking ownership of the inputStream that is passed in,\n     * and using the CP437 character encoding.\n     * @param inputStream the underlying stream, whose ownership is taken\n     * @throws ArchiveException if an exception occurs while reading\n     ",
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
        "(line 92,col 9)-(line 92,col 52)",
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
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 73)",
        "(line 111,col 9)-(line 111,col 21)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 119,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readFully(java.io.DataInputStream, byte[])",
      "begin_line": 122,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 28)",
        "(line 125,col 9)-(line 125,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readHeader()",
      "begin_line": 128,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 30)",
        "(line 130,col 9)-(line 130,col 39)",
        "(line 131,col 9)-(line 153,col 25)",
        "(line 154,col 9)-(line 154,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readMainHeader()",
      "begin_line": 157,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 53)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 163,col 60)",
        "(line 165,col 9)-(line 165,col 67)",
        "(line 166,col 9)-(line 166,col 70)",
        "(line 167,col 9)-(line 167,col 48)",
        "(line 168,col 9)-(line 169,col 60)",
        "(line 171,col 9)-(line 171,col 48)",
        "(line 172,col 9)-(line 172,col 67)",
        "(line 173,col 9)-(line 173,col 65)",
        "(line 174,col 9)-(line 174,col 52)",
        "(line 175,col 9)-(line 175,col 54)",
        "(line 176,col 9)-(line 176,col 61)",
        "(line 177,col 9)-(line 177,col 54)",
        "(line 178,col 9)-(line 178,col 54)",
        "(line 179,col 9)-(line 179,col 50)",
        "(line 180,col 9)-(line 180,col 51)",
        "(line 181,col 9)-(line 181,col 60)",
        "(line 182,col 9)-(line 182,col 63)",
        "(line 183,col 9)-(line 183,col 51)",
        "(line 184,col 9)-(line 184,col 57)",
        "(line 185,col 9)-(line 185,col 28)",
        "(line 186,col 9)-(line 186,col 63)",
        "(line 187,col 9)-(line 187,col 57)",
        "(line 189,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 196,col 43)",
        "(line 197,col 9)-(line 197,col 46)",
        "(line 199,col 9)-(line 199,col 51)",
        "(line 200,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readLocalFileHeader()",
      "begin_line": 214,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 53)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.readExtraData(int, java.io.DataInputStream, org.apache.commons.compress.archivers.arj.LocalFileHeader)",
      "begin_line": 269,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 271,col 9)-(line 280,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byte[], int)",
      "begin_line": 292,
      "end_line": 296,
      "comment": "\n     * Checks if the signature matches what is expected for an arj file.\n     *\n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is an arj archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 295,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.getArchiveName()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * Gets the archive\u0027s recorded name.\n     * @return the archive\u0027s name\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.getArchiveComment()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\n     * Gets the archive\u0027s comment.\n     * @return the archive\u0027s comment\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.getNextEntry()",
      "begin_line": 314,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 322,col 9)",
        "(line 324,col 9)-(line 324,col 55)",
        "(line 325,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 34)",
        "(line 334,col 9)-(line 334,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 337,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 340,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.read(byte[], int, int)",
      "begin_line": 343,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 52)"
      ]
    }
  ]
}