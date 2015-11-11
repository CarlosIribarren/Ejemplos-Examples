MERGE INTO TDE_FAMILIA ANTES
     USING (SELECT 
            '1' FAM_IDFAMILIA,
            'Ocio' FAM_NOMCAS                
              FROM TDE_FAMILIA
              WHERE FAM_IDFAMILIA=1) DESPUES
        ON (ANTES.FAM_IDFAMILIA = DESPUES.FAM_IDFAMILIA)
WHEN MATCHED
THEN
   UPDATE SET
      ANTES.FAM_NOMCAS = DESPUES.FAM_NOMCAS
WHEN NOT MATCHED
THEN
   INSERT     (FAM_IDFAMILIA, 
                FAM_NOMCAS)
       VALUES (DESPUES.FAM_IDFAMILIA,
               DESPUES.FAM_NOMCAS);
