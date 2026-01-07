{
  "filepath": "/tmp/Compress-28b/src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DumpArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 51,
      "end_line": 552,
      "comment": "\n * The DumpArchiveInputStream reads a UNIX dump archive as an InputStream.\n * Methods are provided to position at each successive entry in\n * the archive, and the read each entry as a normal input stream\n * using read().\n *\n * There doesn\u0027t seem to exist a hint on the encoding of string values\n * in any piece documentation.  Given the main purpose of dump/restore\n * is backing up a system it seems very likely the format uses the\n * current default encoding of the system.\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "summary"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "active"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isClosed"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasHitEOF"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entrySize"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readIdx"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readBuf"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockBuffer"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordOffset"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "filepos"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "raw"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " map of ino -\u003e dirent entry. We can use this to reconstruct full paths."
    },
    {
      "type": "field",
      "varNames": [
        "pending"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " map of ino -\u003e (directory) entry when we\u0027re missing one or more elements in the path."
    },
    {
      "type": "field",
      "varNames": [
        "queue"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " queue of (directory) entries where we now have the full path."
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * The encoding to use for filenames and labels.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.DumpArchiveInputStream(java.io.InputStream)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Constructor using the platform\u0027s default encoding for file\n     * names.\n     *\n     * @param is\n     * @throws ArchiveException\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.DumpArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 98,
      "end_line": 144,
      "comment": "\n     * Constructor.\n     *\n     * @param is\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 43)",
        "(line 101,col 9)-(line 101,col 31)",
        "(line 102,col 9)-(line 102,col 67)",
        "(line 104,col 9)-(line 126,col 9)",
        "(line 129,col 9)-(line 129,col 47)",
        "(line 130,col 9)-(line 130,col 44)",
        "(line 134,col 9)-(line 143,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.Anonymous-fa1ba559-9f5f-4fcd-ab7f-9300b538fc3c.compare(org.apache.commons.compress.archivers.dump.DumpArchiveEntry, org.apache.commons.compress.archivers.dump.DumpArchiveEntry)",
      "begin_line": 136,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 137,col 25)-(line 139,col 25)",
        "(line 141,col 25)-(line 141,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getCount()",
      "begin_line": 146,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getBytesRead()",
      "begin_line": 152,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getSummary()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Return the archive summary information.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readCLRI()",
      "begin_line": 167,
      "end_line": 186,
      "comment": "\n     * Read CLRI (deleted inode) segment.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 41)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 174,col 9)-(line 174,col 48)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 181,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readBITS()",
      "begin_line": 191,
      "end_line": 210,
      "comment": "\n     * Read BITS segment.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 41)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 48)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 205,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextDumpEntry()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * Read the next entry.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry()",
      "begin_line": 222,
      "end_line": 313,
      "comment": "\n     * Read the next entry.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 38)",
        "(line 225,col 9)-(line 225,col 27)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 306,col 9)",
        "(line 308,col 9)-(line 308,col 28)",
        "(line 309,col 9)-(line 309,col 82)",
        "(line 310,col 9)-(line 310,col 33)",
        "(line 312,col 9)-(line 312,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)",
      "begin_line": 318,
      "end_line": 401,
      "comment": "\n     * Read directory entry.\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 41)",
        "(line 321,col 9)-(line 321,col 29)",
        "(line 323,col 9)-(line 400,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getPath(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)",
      "begin_line": 409,
      "end_line": 445,
      "comment": "\n     * Get full path for specified archive entry, or null if there\u0027s a gap.\n     *\n     * @param entry\n     * @return  full path for specified archive entry, or null if there\u0027s a gap.\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 53)",
        "(line 413,col 9)-(line 413,col 29)",
        "(line 415,col 9)-(line 427,col 9)",
        "(line 430,col 9)-(line 434,col 9)",
        "(line 437,col 9)-(line 437,col 61)",
        "(line 439,col 9)-(line 442,col 9)",
        "(line 444,col 9)-(line 444,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(byte[], int, int)",
      "begin_line": 460,
      "end_line": 518,
      "comment": "\n     * Reads bytes from the current dump archive entry.\n     *\n     * This method is aware of the boundaries of the current\n     * entry in the archive and will deal with them as if they\n     * were this stream\u0027s start and EOF.\n     *\n     * @param buf The buffer into which to place bytes read.\n     * @param off The offset at which to place bytes read.\n     * @param len The number of bytes to read.\n     * @return The number of bytes read, or -1 at EOF.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 26)",
        "(line 464,col 9)-(line 466,col 9)",
        "(line 468,col 9)-(line 470,col 9)",
        "(line 472,col 9)-(line 474,col 9)",
        "(line 476,col 9)-(line 513,col 9)",
        "(line 515,col 9)-(line 515,col 33)",
        "(line 517,col 9)-(line 517,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.close()",
      "begin_line": 523,
      "end_line": 529,
      "comment": "\n     * Closes the stream for this entry.\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 528,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byte[], int)",
      "begin_line": 536,
      "end_line": 550,
      "comment": "\n     * Look at the first few bytes of the file to decide if it\u0027s a dump\n     * archive. With 32 bytes we can look at the magic value, with a full\n     * 1k we can verify the checksum.\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 540,col 9)",
        "(line 543,col 9)-(line 545,col 9)",
        "(line 548,col 9)-(line 549,col 16)"
      ]
    }
  ]
}