package com.ardublock.translator.block.Duinoedu;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.TranslatorBlock;
import com.ardublock.translator.block.exception.SocketNullException;
import com.ardublock.translator.block.exception.SubroutineNotDeclaredException;

public class Motor_shield_Forward  extends TranslatorBlock {

	public Motor_shield_Forward (Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}
	
	//@Override
		public String toCode() throws SocketNullException, SubroutineNotDeclaredException
		{
			String way;
			TranslatorBlock translatorBlock = this.getRequiredTranslatorBlockAtSocket(0);
			way = translatorBlock.toCode();
			
			
			translator.addHeaderFile("MotorShieldDupont.h");
			translator.addDefinitionCommand("MotorShieldDupont monMotorShield;");
			translator.addSetupCommand("monMotorShield.brancher();");
			
						
			String ret =  " monMotorShield.avancer(\""+ way +"\");\n";
			
			return ret ;	
		}
}
