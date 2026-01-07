{
  "filepath": "/tmp/Compress-21b/src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DumpArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 179,
      "end_line": 807,
      "comment": "\n * This class represents an entry in a Dump archive. It consists\n * of the entry\u0027s header, the entry\u0027s File and any extended attributes.\n * \u003cp\u003e\n * DumpEntries that are created from the header bytes read from\n * an archive are instantiated with the DumpArchiveEntry( byte[] )\n * constructor. These entries will be used when extracting from\n * or listing the contents of an archive. These entries have their\n * header filled in using the header bytes. They also set the File\n * to null, since they reference an archive entry not a file.\n * \u003cp\u003e\n * DumpEntries can also be constructed from nothing but a name.\n * This allows the programmer to construct the entry by hand, for\n * instance when only an InputStream is available for writing to\n * the archive, and the header information is constructed from\n * other information. In this case the header fields are set to\n * defaults and the File is set to null.\n *\n * \u003cp\u003e\n * The C structure for a Dump Entry\u0027s header is:\n * \u003cpre\u003e\n * #define TP_BSIZE    1024          // size of each file block\n * #define NTREC       10            // number of blocks to write at once\n * #define HIGHDENSITYTREC 32        // number of blocks to write on high-density tapes\n * #define TP_NINDIR   (TP_BSIZE/2)  // number if indirect inodes in record\n * #define TP_NINOS    (TP_NINDIR / sizeof (int32_t))\n * #define LBLSIZE     16\n * #define NAMELEN     64\n *\n * #define OFS_MAGIC     (int)60011  // old format magic value\n * #define NFS_MAGIC     (int)60012  // new format magic value\n * #define FS_UFS2_MAGIC (int)0x19540119\n * #define CHECKSUM      (int)84446  // constant used in checksum algorithm\n *\n * struct  s_spcl {\n *   int32_t c_type;             // record type (see below)\n *   int32_t \u003cb\u003ec_date\u003c/b\u003e;             // date of this dump\n *   int32_t \u003cb\u003ec_ddate\u003c/b\u003e;            // date of previous dump\n *   int32_t c_volume;           // dump volume number\n *   u_int32_t c_tapea;          // logical block of this record\n *   dump_ino_t c_ino;           // number of inode\n *   int32_t \u003cb\u003ec_magic\u003c/b\u003e;            // magic number (see above)\n *   int32_t c_checksum;         // record checksum\n * #ifdef  __linux__\n *   struct  new_bsd_inode c_dinode;\n * #else\n * #ifdef sunos\n *   struct  new_bsd_inode c_dinode;\n * #else\n *   struct  dinode  c_dinode;   // ownership and mode of inode\n * #endif\n * #endif\n *   int32_t c_count;            // number of valid c_addr entries\n *   union u_data c_data;        // see above\n *   char    \u003cb\u003ec_label[LBLSIZE]\u003c/b\u003e;   // dump label\n *   int32_t \u003cb\u003ec_level\u003c/b\u003e;            // level of this dump\n *   char    \u003cb\u003ec_filesys[NAMELEN]\u003c/b\u003e; // name of dumpped file system\n *   char    \u003cb\u003ec_dev[NAMELEN]\u003c/b\u003e;     // name of dumpped device\n *   char    \u003cb\u003ec_host[NAMELEN]\u003c/b\u003e;    // name of dumpped host\n *   int32_t c_flags;            // additional information (see below)\n *   int32_t c_firstrec;         // first record on volume\n *   int32_t c_ntrec;            // blocksize on volume\n *   int32_t c_extattributes;    // additional inode info (see below)\n *   int32_t c_spare[30];        // reserved for future uses\n * } s_spcl;\n *\n * //\n * // flag values\n * //\n * #define DR_NEWHEADER     0x0001  // new format tape header\n * #define DR_NEWINODEFMT   0x0002  // new format inodes on tape\n * #define DR_COMPRESSED    0x0080  // dump tape is compressed\n * #define DR_METAONLY      0x0100  // only the metadata of the inode has been dumped\n * #define DR_INODEINFO     0x0002  // [SIC] TS_END header contains c_inos information\n * #define DR_EXTATTRIBUTES 0x8000\n *\n * //\n * // extattributes inode info\n * //\n * #define EXT_REGULAR         0\n * #define EXT_MACOSFNDRINFO   1\n * #define EXT_MACOSRESFORK    2\n * #define EXT_XATTR           3\n *\n * // used for EA on tape\n * #define EXT2_GOOD_OLD_INODE_SIZE    128\n * #define EXT2_XATTR_MAGIC        0xEA020000  // block EA\n * #define EXT2_XATTR_MAGIC2       0xEA020001  // in inode EA\n * \u003c/pre\u003e\n * The fields in \u003cb\u003ebold\u003c/b\u003e are the same for all blocks. (This permitted\n * multiple dumps to be written to a single tape.)\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * The C structure for the inode (file) information is:\n * \u003cpre\u003e\n * struct bsdtimeval {           //  **** alpha-*-linux is deviant\n *   __u32   tv_sec;\n *   __u32   tv_usec;\n * };\n *\n * #define NDADDR      12\n * #define NIADDR       3\n *\n * //\n * // This is the new (4.4) BSD inode structure\n * // copied from the FreeBSD 2.0 \u003cufs/ufs/dinode.h\u003e include file\n * //\n * struct new_bsd_inode {\n *   __u16       di_mode;           // file type, standard Unix permissions\n *   __s16       di_nlink;          // number of hard links to file.\n *   union {\n *      __u16       oldids[2];\n *      __u32       inumber;\n *   }           di_u;\n *   u_quad_t    di_size;           // file size\n *   struct bsdtimeval   di_atime;  // time file was last accessed\n *   struct bsdtimeval   di_mtime;  // time file was last modified\n *   struct bsdtimeval   di_ctime;  // time file was created\n *   __u32       di_db[NDADDR];\n *   __u32       di_ib[NIADDR];\n *   __u32       di_flags;          //\n *   __s32       di_blocks;         // number of disk blocks\n *   __s32       di_gen;            // generation number\n *   __u32       di_uid;            // user id (see /etc/passwd)\n *   __u32       di_gid;            // group id (see /etc/group)\n *   __s32       di_spare[2];       // unused\n * };\n * \u003c/pre\u003e\n * It is important to note that the header DOES NOT have the name of the\n * file. It can\u0027t since hard links mean that you may have multiple filenames\n * for a single physical file. You must read the contents of the directory\n * entries to learn the mapping(s) from filename to inode.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * The C structure that indicates if a specific block is a real block\n * that contains data or is a sparse block that is not persisted to the\n * disk is:\n * \u003cpre\u003e\n * #define TP_BSIZE    1024\n * #define TP_NINDIR   (TP_BSIZE/2)\n *\n * union u_data {\n *   char    s_addrs[TP_NINDIR]; // 1 \u003d\u003e data; 0 \u003d\u003e hole in inode\n *   int32_t s_inos[TP_NINOS];   // table of first inode on each volume\n * } u_data;\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "permissions"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "atime"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mtime"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "uid"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gid"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "summary"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": "\n     * Currently unused\n     "
    },
    {
      "type": "field",
      "varNames": [
        "header"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": " this information is available from standard index."
    },
    {
      "type": "field",
      "varNames": [
        "simpleName"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "originalName"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "volume"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " this information is available from QFA index"
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ino"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nlink"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ctime"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generation"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isDeleted"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.DumpArchiveEntry()",
      "begin_line": 212,
      "end_line": 213,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.DumpArchiveEntry(java.lang.String, java.lang.String)",
      "begin_line": 220,
      "end_line": 223,
      "comment": "\n     * Constructor taking only filename.\n     * @param name pathname\n     * @param simpleName actual filename.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 22)",
        "(line 222,col 9)-(line 222,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.DumpArchiveEntry(java.lang.String, java.lang.String, int, org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE)",
      "begin_line": 233,
      "end_line": 240,
      "comment": "\n     * Constructor taking name, inode and type.\n     *\n     * @param name\n     * @param simpleName\n     * @param ino\n     * @param type\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 22)",
        "(line 236,col 9)-(line 236,col 22)",
        "(line 237,col 9)-(line 237,col 37)",
        "(line 238,col 9)-(line 238,col 23)",
        "(line 239,col 9)-(line 239,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getSimpleName()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * Returns the path of the entry.\n     * @return the path of the entry.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setSimpleName(java.lang.String)",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * Sets the path of the entry.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getIno()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * Returns the ino of the entry.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getNlink()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Return the number of hard links to the entry.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setNlink(int)",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\n     * Set the number of hard links.\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getCreationTime()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * Get file creation time.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setCreationTime(java.util.Date)",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\n     * Set the file creation time.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getGeneration()",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\n     * Return the generation of the file.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setGeneration(int)",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Set the generation of the file.\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isDeleted()",
      "begin_line": 315,
      "end_line": 317,
      "comment": "\n     * Has this file been deleted? (On valid on incremental dumps.)\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setDeleted(boolean)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * Set whether this file has been deleted.\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getOffset()",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\n     * Return the offset within the archive\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setOffset(long)",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\n     * Set the offset within the archive.\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getVolume()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\n     * Return the tape volume where this file is located.\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setVolume(int)",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\n     * Set the tape volume.\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getHeaderType()",
      "begin_line": 357,
      "end_line": 359,
      "comment": "\n     * Return the type of the tape segment header.\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getHeaderCount()",
      "begin_line": 364,
      "end_line": 366,
      "comment": "\n     * Return the number of records in this segment.\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getHeaderHoles()",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\n     * Return the number of sparse records in this segment.\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isSparseRecord(int)",
      "begin_line": 378,
      "end_line": 380,
      "comment": "\n     * Is this a sparse record?\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.hashCode()",
      "begin_line": 385,
      "end_line": 388,
      "comment": "\n     * @see java.lang.Object#hashCode()\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.equals(java.lang.Object)",
      "begin_line": 393,
      "end_line": 417,
      "comment": "\n     * @see java.lang.Object#equals(Object o)\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 399,col 9)",
        "(line 401,col 9)-(line 401,col 52)",
        "(line 403,col 9)-(line 405,col 9)",
        "(line 407,col 9)-(line 409,col 9)",
        "(line 411,col 9)-(line 414,col 9)",
        "(line 416,col 9)-(line 416,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.toString()",
      "begin_line": 422,
      "end_line": 425,
      "comment": "\n     * @see java.lang.Object#toString()\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.parse(byte[])",
      "begin_line": 434,
      "end_line": 496,
      "comment": "\n     * Populate the dump archive entry and tape segment header with\n     * the contents of the buffer.\n     *\n     * @param buffer\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 56)",
        "(line 436,col 9)-(line 436,col 48)",
        "(line 438,col 9)-(line 439,col 32)",
        "(line 444,col 9)-(line 444,col 62)",
        "(line 446,col 9)-(line 446,col 71)",
        "(line 450,col 9)-(line 450,col 54)",
        "(line 453,col 9)-(line 453,col 51)",
        "(line 456,col 9)-(line 456,col 25)",
        "(line 458,col 9)-(line 458,col 60)",
        "(line 460,col 9)-(line 460,col 61)",
        "(line 462,col 9)-(line 463,col 59)",
        "(line 464,col 9)-(line 464,col 41)",
        "(line 465,col 9)-(line 466,col 59)",
        "(line 467,col 9)-(line 467,col 47)",
        "(line 468,col 9)-(line 469,col 59)",
        "(line 470,col 9)-(line 470,col 24)",
        "(line 476,col 9)-(line 476,col 66)",
        "(line 477,col 9)-(line 477,col 64)",
        "(line 478,col 9)-(line 478,col 65)",
        "(line 480,col 9)-(line 480,col 62)",
        "(line 482,col 9)-(line 482,col 25)",
        "(line 484,col 9)-(line 488,col 9)",
        "(line 490,col 9)-(line 490,col 60)",
        "(line 492,col 9)-(line 492,col 42)",
        "(line 495,col 9)-(line 495,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.update(byte[])",
      "begin_line": 501,
      "end_line": 514,
      "comment": "\n     * Update entry with information from next tape segment header.\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 62)",
        "(line 503,col 9)-(line 503,col 62)",
        "(line 505,col 9)-(line 505,col 25)",
        "(line 507,col 9)-(line 511,col 9)",
        "(line 513,col 9)-(line 513,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TapeSegmentHeader",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 520,
      "end_line": 555,
      "comment": "\n     * Archive entry as stored on tape. There is one TSH for (at most)\n     * every 512k in the file.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 521,
      "end_line": 521,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "volume"
      ],
      "begin_line": 522,
      "end_line": 522,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ino"
      ],
      "begin_line": 523,
      "end_line": 523,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 524,
      "end_line": 524,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "holes"
      ],
      "begin_line": 525,
      "end_line": 525,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cdata"
      ],
      "begin_line": 526,
      "end_line": 526,
      "comment": " map of any \u0027holes\u0027"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.getType()",
      "begin_line": 528,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 529,col 13)-(line 529,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.getVolume()",
      "begin_line": 532,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 533,col 13)-(line 533,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.getIno()",
      "begin_line": 536,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 537,col 13)-(line 537,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.setIno(int)",
      "begin_line": 540,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 541,col 13)-(line 541,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.getCount()",
      "begin_line": 544,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 545,col 13)-(line 545,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.getHoles()",
      "begin_line": 548,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 549,col 13)-(line 549,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.getCdata(int)",
      "begin_line": 552,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 553,col 13)-(line 553,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getName()",
      "begin_line": 561,
      "end_line": 563,
      "comment": "\n     * Returns the name of the entry.\n     * @return the name of the entry.\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getOriginalName()",
      "begin_line": 569,
      "end_line": 571,
      "comment": "\n     * Returns the unmodified name of the entry.\n     * @return the name of the entry.\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setName(java.lang.String)",
      "begin_line": 576,
      "end_line": 587,
      "comment": "\n     * Sets the name of the entry.\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 33)",
        "(line 578,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 586,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getLastModifiedDate()",
      "begin_line": 589,
      "end_line": 591,
      "comment": "",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isDirectory()",
      "begin_line": 596,
      "end_line": 598,
      "comment": "\n     * Is this a directory?\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isFile()",
      "begin_line": 603,
      "end_line": 605,
      "comment": "\n     * Is this a regular file?\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isSocket()",
      "begin_line": 610,
      "end_line": 612,
      "comment": "\n     * Is this a network device?\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isChrDev()",
      "begin_line": 617,
      "end_line": 619,
      "comment": "\n     * Is this a character device?\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isBlkDev()",
      "begin_line": 624,
      "end_line": 626,
      "comment": "\n     * Is this a block device?\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isFifo()",
      "begin_line": 631,
      "end_line": 633,
      "comment": "\n     * Is this a fifo/pipe?\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getType()",
      "begin_line": 638,
      "end_line": 640,
      "comment": "\n     * Get the type of the entry.\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setType(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE)",
      "begin_line": 645,
      "end_line": 647,
      "comment": "\n     * Set the type of the entry.\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getMode()",
      "begin_line": 652,
      "end_line": 654,
      "comment": "\n     * Return the access permissions on the entry.\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setMode(int)",
      "begin_line": 659,
      "end_line": 662,
      "comment": "\n     * Set the access permissions on the entry.\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 33)",
        "(line 661,col 9)-(line 661,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getPermissions()",
      "begin_line": 667,
      "end_line": 669,
      "comment": "\n     * Returns the permissions on the entry.\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 668,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getSize()",
      "begin_line": 674,
      "end_line": 676,
      "comment": "\n     * Returns the size of the entry.\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getEntrySize()",
      "begin_line": 681,
      "end_line": 683,
      "comment": "\n     * Returns the size of the entry as read from the archive.\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setSize(long)",
      "begin_line": 688,
      "end_line": 690,
      "comment": "\n     * Set the size of the entry.\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setLastModifiedDate(java.util.Date)",
      "begin_line": 695,
      "end_line": 697,
      "comment": "\n     * Set the time the file was last modified.\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getAccessTime()",
      "begin_line": 702,
      "end_line": 704,
      "comment": "\n     * Returns the time the file was last accessed.\n     ",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setAccessTime(java.util.Date)",
      "begin_line": 709,
      "end_line": 711,
      "comment": "\n     * Set the time the file was last accessed.\n     ",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getUserId()",
      "begin_line": 716,
      "end_line": 718,
      "comment": "\n     * Return the user id.\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setUserId(int)",
      "begin_line": 723,
      "end_line": 725,
      "comment": "\n     * Set the user id.\n     ",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getGroupId()",
      "begin_line": 730,
      "end_line": 732,
      "comment": "\n     * Return the group id\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setGroupId(int)",
      "begin_line": 737,
      "end_line": 739,
      "comment": "\n     * Set the group id.\n     ",
      "child_ranges": [
        "(line 738,col 9)-(line 738,col 23)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "code"
      ],
      "begin_line": 752,
      "end_line": 752,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.TYPE(int)",
      "begin_line": 754,
      "end_line": 756,
      "comment": "",
      "child_ranges": [
        "(line 755,col 13)-(line 755,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.find(int)",
      "begin_line": 758,
      "end_line": 768,
      "comment": "",
      "child_ranges": [
        "(line 759,col 13)-(line 759,col 32)",
        "(line 761,col 13)-(line 765,col 13)",
        "(line 767,col 13)-(line 767,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "code"
      ],
      "begin_line": 785,
      "end_line": 785,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.PERMISSION(int)",
      "begin_line": 787,
      "end_line": 789,
      "comment": "",
      "child_ranges": [
        "(line 788,col 13)-(line 788,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.find(int)",
      "begin_line": 791,
      "end_line": 805,
      "comment": "",
      "child_ranges": [
        "(line 792,col 13)-(line 792,col 60)",
        "(line 794,col 13)-(line 798,col 13)",
        "(line 800,col 13)-(line 802,col 13)",
        "(line 804,col 13)-(line 804,col 39)"
      ]
    }
  ]
}