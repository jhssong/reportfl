{
  "filepath": "/tmp/Compress-14b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 35,
      "end_line": 415,
      "comment": "\n * Implements the \"ar\" archive format as an input stream.\n * \n * @NotThreadSafe\n * \n "
    },
    {
      "type": "field",
      "varNames": [
        "input"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentEntry"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * If getNextEnxtry has been called, the entry metadata is stored in\n     * currentEntry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "namebuffer"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Storage area for extra long names (GNU ar)"
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * The offset where the current entry started. -1 if no entry has been\n     * called\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.ArArchiveInputStream(java.io.InputStream)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Constructs an Ar input stream with the referenced stream\n     * \n     * @param pInput\n     *            the ar input stream\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 23)",
        "(line 64,col 9)-(line 64,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextArEntry()",
      "begin_line": 74,
      "end_line": 169,
      "comment": "\n     * Returns the next AR entry in this stream.\n     * \n     * @return the next AR entry.\n     * @throws IOException\n     *             if the entry could not be read\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 86,col 9)",
        "(line 88,col 9)-(line 100,col 9)",
        "(line 102,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 111,col 41)",
        "(line 112,col 9)-(line 112,col 49)",
        "(line 113,col 9)-(line 113,col 42)",
        "(line 114,col 9)-(line 114,col 43)",
        "(line 115,col 9)-(line 115,col 44)",
        "(line 116,col 9)-(line 116,col 43)",
        "(line 118,col 9)-(line 118,col 19)",
        "(line 119,col 9)-(line 119,col 27)",
        "(line 120,col 9)-(line 120,col 21)",
        "(line 121,col 9)-(line 121,col 22)",
        "(line 122,col 9)-(line 122,col 23)",
        "(line 123,col 9)-(line 123,col 21)",
        "(line 125,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 29)",
        "(line 144,col 9)-(line 144,col 62)",
        "(line 145,col 9)-(line 145,col 34)",
        "(line 147,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 167,col 64)",
        "(line 168,col 9)-(line 168,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getExtendedName(int)",
      "begin_line": 178,
      "end_line": 191,
      "comment": "\n     * Get an extended name from the GNU extended name buffer.\n     * \n     * @param offset pointer to entry within the buffer\n     * @return the extended file name; without trailing \"/\" if present.\n     * @throws IOException if name not found or buffer not set up\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asLong(byte[])",
      "begin_line": 192,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[])",
      "begin_line": 196,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[], boolean)",
      "begin_line": 200,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[], int)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.asInt(byte[], int, boolean)",
      "begin_line": 208,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 49)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getNextEntry()",
      "begin_line": 222,
      "end_line": 225,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see\n     * org.apache.commons.compress.archivers.ArchiveInputStream#getNextEntry()\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.close()",
      "begin_line": 232,
      "end_line": 239,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#close()\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.read(byte[], int, int)",
      "begin_line": 246,
      "end_line": 261,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#read(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 25)",
        "(line 249,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 56)",
        "(line 258,col 9)-(line 258,col 19)",
        "(line 259,col 9)-(line 259,col 38)",
        "(line 260,col 9)-(line 260,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byte[], int)",
      "begin_line": 273,
      "end_line": 305,
      "comment": "\n     * Checks if the signature matches ASCII \"!\u003carch\u003e\" followed by a single LF\n     * control character\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is an Ar archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 304,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "BSD_LONGNAME_PREFIX"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BSD_LONGNAME_PREFIX_LEN"
      ],
      "begin_line": 308,
      "end_line": 309,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BSD_LONGNAME_PATTERN"
      ],
      "begin_line": 310,
      "end_line": 311,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.isBSDLongName(java.lang.String)",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\n     * Does the name look like it is a long name (or a name containing\n     * spaces) as encoded by BSD ar?\n     *\n     * \u003cp\u003eFrom the FreeBSD ar(5) man page:\u003c/p\u003e\n     * \u003cpre\u003e\n     * BSD   In the BSD variant, names that are shorter than 16\n     *\t     characters and without embedded spaces are stored\n     *\t     directly in this field.  If a name has an embedded\n     *\t     space, or if it is longer than 16 characters, then\n     *\t     the string \"#1/\" followed by the decimal represen-\n     *\t     tation of the length of the file name is placed in\n     *\t     this field.\tThe actual file name is stored immedi-\n     *\t     ately after the archive header.  The content of the\n     *\t     archive member follows the file name.  The ar_size\n     *\t     field of the header (see below) will then hold the\n     *\t     sum of the size of the file name and the size of\n     *\t     the member.\n     * \u003c/pre\u003e\n     *\n     * @since Apache Commons Compress 1.3\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.getBSDLongName(java.lang.String)",
      "begin_line": 347,
      "end_line": 363,
      "comment": "\n     * Reads the real name from the current stream assuming the very\n     * first bytes to be read are the real file name.\n     *\n     * @see #isBSDLongName\n     *\n     * @since Apache Commons Compress 1.3\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 349,col 77)",
        "(line 350,col 9)-(line 350,col 40)",
        "(line 351,col 9)-(line 351,col 34)",
        "(line 352,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 48)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "GNU_STRING_TABLE_NAME"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.isGNUStringTable(java.lang.String)",
      "begin_line": 384,
      "end_line": 386,
      "comment": "\n     * Is this the name of the \"Archive String Table\" as used by\n     * SVR4/GNU to store long file names?\n     *\n     * \u003cp\u003eGNU ar stores multiple extended filenames in the data section\n     * of a file with the name \"//\", this record is referred to by\n     * future headers.\u003c/p\u003e\n     *\n     * \u003cp\u003eA header references an extended filename by storing a \"/\"\n     * followed by a decimal offset to the start of the filename in\n     * the extended filename data section.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format of the \"//\" file itself is simply a list of the\n     * long filenames, each separated by one or more LF\n     * characters. Note that the decimal offsets are number of\n     * characters, not line or string number within the \"//\" file.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.readGNUStringTable(byte[])",
      "begin_line": 393,
      "end_line": 402,
      "comment": "\n     * Reads the GNU archive String Table.\n     *\n     * @see #isGNUStringTable\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 36)",
        "(line 395,col 9)-(line 395,col 39)",
        "(line 396,col 9)-(line 396,col 48)",
        "(line 397,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 66)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "GNU_LONGNAME_PATTERN"
      ],
      "begin_line": 404,
      "end_line": 404,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveInputStream.isGNULongName(java.lang.String)",
      "begin_line": 412,
      "end_line": 414,
      "comment": "\n     * Does the name look like it is a long name (or a name containing\n     * spaces) as encoded by SVR4/GNU ar?\n     *\n     * @see #isGNUStringTable\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 66)"
      ]
    }
  ]
}