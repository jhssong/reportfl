{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 36,
      "end_line": 405,
      "comment": "\n * Implements the \"ar\" archive format as an input stream.\n * \n * @NotThreadSafe\n * \n "
    },
    {
      "type": "field",
      "varNames": [
        "input"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentEntry"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * If getNextEnxtry has been called, the entry metadata is stored in\n     * currentEntry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "namebuffer"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Storage area for extra long names (GNU ar)"
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * The offset where the current entry started. -1 if no entry has been\n     * called\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NAME_BUF"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " cached buffers - must only be used locally in the class (COMPRESS-172 - reduce garbage collection)"
    },
    {
      "type": "field",
      "varNames": [
        "LAST_MODIFIED_BUF"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ID_BUF"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FILE_MODE_BUF"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LENGTH_BUF"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.ArArchiveInputStream(java.io.InputStream)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Constructs an Ar input stream with the referenced stream\n     * \n     * @param pInput\n     *            the ar input stream\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 23)",
        "(line 72,col 9)-(line 72,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextArEntry()",
      "begin_line": 82,
      "end_line": 166,
      "comment": "\n     * Returns the next AR entry in this stream.\n     * \n     * @return the next AR entry.\n     * @throws IOException\n     *             if the entry could not be read\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 112,col 42)",
        "(line 113,col 9)-(line 113,col 51)",
        "(line 114,col 9)-(line 114,col 40)",
        "(line 115,col 9)-(line 115,col 41)",
        "(line 116,col 9)-(line 116,col 40)",
        "(line 117,col 9)-(line 117,col 47)",
        "(line 118,col 9)-(line 118,col 44)",
        "(line 120,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 29)",
        "(line 139,col 9)-(line 139,col 66)",
        "(line 140,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 38)",
        "(line 146,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 164,col 69)",
        "(line 165,col 9)-(line 165,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getExtendedName(int)",
      "begin_line": 175,
      "end_line": 188,
      "comment": "\n     * Get an extended name from the GNU extended name buffer.\n     * \n     * @param offset pointer to entry within the buffer\n     * @return the extended file name; without trailing \"/\" if present.\n     * @throws IOException if name not found or buffer not set up\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asLong(byte[])",
      "begin_line": 189,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[])",
      "begin_line": 193,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[], boolean)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[], int)",
      "begin_line": 201,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[], int, boolean)",
      "begin_line": 205,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 65)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextEntry()",
      "begin_line": 219,
      "end_line": 222,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see\n     * org.apache.commons.compress.archivers.ArchiveInputStream#getNextEntry()\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.close()",
      "begin_line": 229,
      "end_line": 236,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#close()\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(byte[], int, int)",
      "begin_line": 243,
      "end_line": 258,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#read(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 25)",
        "(line 246,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 56)",
        "(line 255,col 9)-(line 255,col 19)",
        "(line 256,col 9)-(line 256,col 36)",
        "(line 257,col 9)-(line 257,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byte[], int)",
      "begin_line": 270,
      "end_line": 302,
      "comment": "\n     * Checks if the signature matches ASCII \"!\u0026lt;arch\u0026gt;\" followed by a single LF\n     * control character\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is an Ar archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 299,col 9)",
        "(line 301,col 9)-(line 301,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "BSD_LONGNAME_PREFIX"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BSD_LONGNAME_PREFIX_LEN"
      ],
      "begin_line": 305,
      "end_line": 306,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BSD_LONGNAME_PATTERN"
      ],
      "begin_line": 307,
      "end_line": 308,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.isBSDLongName(java.lang.String)",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * Does the name look like it is a long name (or a name containing\n     * spaces) as encoded by BSD ar?\n     *\n     * \u003cp\u003eFrom the FreeBSD ar(5) man page:\u003c/p\u003e\n     * \u003cpre\u003e\n     * BSD   In the BSD variant, names that are shorter than 16\n     *       characters and without embedded spaces are stored\n     *       directly in this field.  If a name has an embedded\n     *       space, or if it is longer than 16 characters, then\n     *       the string \"#1/\" followed by the decimal represen-\n     *       tation of the length of the file name is placed in\n     *       this field. The actual file name is stored immedi-\n     *       ately after the archive header.  The content of the\n     *       archive member follows the file name.  The ar_size\n     *       field of the header (see below) will then hold the\n     *       sum of the size of the file name and the size of\n     *       the member.\n     * \u003c/pre\u003e\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getBSDLongName(java.lang.String)",
      "begin_line": 344,
      "end_line": 353,
      "comment": "\n     * Reads the real name from the current stream assuming the very\n     * first bytes to be read are the real file name.\n     *\n     * @see #isBSDLongName\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 346,col 77)",
        "(line 347,col 9)-(line 347,col 40)",
        "(line 348,col 9)-(line 348,col 49)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 48)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "GNU_STRING_TABLE_NAME"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.isGNUStringTable(java.lang.String)",
      "begin_line": 374,
      "end_line": 376,
      "comment": "\n     * Is this the name of the \"Archive String Table\" as used by\n     * SVR4/GNU to store long file names?\n     *\n     * \u003cp\u003eGNU ar stores multiple extended filenames in the data section\n     * of a file with the name \"//\", this record is referred to by\n     * future headers.\u003c/p\u003e\n     *\n     * \u003cp\u003eA header references an extended filename by storing a \"/\"\n     * followed by a decimal offset to the start of the filename in\n     * the extended filename data section.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format of the \"//\" file itself is simply a list of the\n     * long filenames, each separated by one or more LF\n     * characters. Note that the decimal offsets are number of\n     * characters, not line or string number within the \"//\" file.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.readGNUStringTable(byte[])",
      "begin_line": 383,
      "end_line": 392,
      "comment": "\n     * Reads the GNU archive String Table.\n     *\n     * @see #isGNUStringTable\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 36)",
        "(line 385,col 9)-(line 385,col 39)",
        "(line 386,col 9)-(line 386,col 67)",
        "(line 387,col 9)-(line 390,col 9)",
        "(line 391,col 9)-(line 391,col 66)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "GNU_LONGNAME_PATTERN"
      ],
      "begin_line": 394,
      "end_line": 394,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.isGNULongName(java.lang.String)",
      "begin_line": 402,
      "end_line": 404,
      "comment": "\n     * Does the name look like it is a long name (or a name containing\n     * spaces) as encoded by SVR4/GNU ar?\n     *\n     * @see #isGNUStringTable\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 66)"
      ]
    }
  ]
}