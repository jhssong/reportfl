{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DumpArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 51,
      "end_line": 560,
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
        "zipEncoding"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * The encoding to use for filenames and labels.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " the provided encoding (for unit tests)"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.DumpArchiveInputStream(java.io.InputStream)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Constructor using the platform\u0027s default encoding for file\n     * names.\n     *\n     * @param is stream to read from\n     * @throws ArchiveException on error\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.DumpArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 102,
      "end_line": 149,
      "comment": "\n     * Constructor.\n     *\n     * @param is stream to read from\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @since 1.6\n     * @throws ArchiveException on error\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 43)",
        "(line 105,col 9)-(line 105,col 31)",
        "(line 106,col 9)-(line 106,col 33)",
        "(line 107,col 9)-(line 107,col 70)",
        "(line 109,col 9)-(line 131,col 9)",
        "(line 134,col 9)-(line 134,col 47)",
        "(line 135,col 9)-(line 135,col 27)",
        "(line 139,col 9)-(line 148,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.Anonymous-2255288c-5522-45ea-ab3a-ffce3a373dda.compare(org.apache.commons.compress.archivers.dump.DumpArchiveEntry, org.apache.commons.compress.archivers.dump.DumpArchiveEntry)",
      "begin_line": 141,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 142,col 25)-(line 144,col 25)",
        "(line 146,col 25)-(line 146,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getCount()",
      "begin_line": 151,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getBytesRead()",
      "begin_line": 157,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getSummary()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Return the archive summary information.\n     * @return the summary\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readCLRI()",
      "begin_line": 173,
      "end_line": 192,
      "comment": "\n     * Read CLRI (deleted inode) segment.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 41)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 180,col 48)",
        "(line 182,col 9)-(line 184,col 9)",
        "(line 187,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readBITS()",
      "begin_line": 197,
      "end_line": 216,
      "comment": "\n     * Read BITS segment.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 41)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 204,col 48)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 211,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextDumpEntry()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Read the next entry.\n     * @return the next entry\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getNextEntry()",
      "begin_line": 227,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 38)",
        "(line 230,col 9)-(line 230,col 27)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 311,col 9)",
        "(line 313,col 9)-(line 313,col 28)",
        "(line 314,col 9)-(line 314,col 65)",
        "(line 315,col 9)-(line 315,col 33)",
        "(line 317,col 9)-(line 317,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.readDirectoryEntry(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)",
      "begin_line": 323,
      "end_line": 406,
      "comment": "\n     * Read directory entry.\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 41)",
        "(line 326,col 9)-(line 326,col 29)",
        "(line 328,col 9)-(line 405,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.getPath(org.apache.commons.compress.archivers.dump.DumpArchiveEntry)",
      "begin_line": 414,
      "end_line": 450,
      "comment": "\n     * Get full path for specified archive entry, or null if there\u0027s a gap.\n     *\n     * @param entry\n     * @return  full path for specified archive entry, or null if there\u0027s a gap.\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 53)",
        "(line 418,col 9)-(line 418,col 29)",
        "(line 420,col 9)-(line 432,col 9)",
        "(line 435,col 9)-(line 439,col 9)",
        "(line 442,col 9)-(line 442,col 61)",
        "(line 444,col 9)-(line 447,col 9)",
        "(line 449,col 9)-(line 449,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.read(byte[], int, int)",
      "begin_line": 465,
      "end_line": 523,
      "comment": "\n     * Reads bytes from the current dump archive entry.\n     *\n     * This method is aware of the boundaries of the current\n     * entry in the archive and will deal with them as if they\n     * were this stream\u0027s start and EOF.\n     *\n     * @param buf The buffer into which to place bytes read.\n     * @param off The offset at which to place bytes read.\n     * @param len The number of bytes to read.\n     * @return The number of bytes read, or -1 at EOF.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 26)",
        "(line 469,col 9)-(line 471,col 9)",
        "(line 473,col 9)-(line 475,col 9)",
        "(line 477,col 9)-(line 479,col 9)",
        "(line 481,col 9)-(line 518,col 9)",
        "(line 520,col 9)-(line 520,col 33)",
        "(line 522,col 9)-(line 522,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.close()",
      "begin_line": 528,
      "end_line": 534,
      "comment": "\n     * Closes the stream for this entry.\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 533,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byte[], int)",
      "begin_line": 544,
      "end_line": 558,
      "comment": "\n     * Look at the first few bytes of the file to decide if it\u0027s a dump\n     * archive. With 32 bytes we can look at the magic value, with a full\n     * 1k we can verify the checksum.\n     * @param buffer data to match\n     * @param length length of data\n     * @return whether the buffer seems to contain dump data\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 548,col 9)",
        "(line 551,col 9)-(line 553,col 9)",
        "(line 556,col 9)-(line 557,col 16)"
      ]
    }
  ]
}