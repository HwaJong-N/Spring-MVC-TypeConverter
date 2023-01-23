package ghkwhd.typeconverter;

import ghkwhd.typeconverter.converter.IntegerToStringConverter;
import ghkwhd.typeconverter.converter.IpPortToStringConverter;
import ghkwhd.typeconverter.converter.StringToIntegerConverter;
import ghkwhd.typeconverter.converter.StringToIpPortConverter;
import ghkwhd.typeconverter.formatter.MyNumberFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        //registry.addConverter(new StringToIntegerConverter());
        //registry.addConverter(new IntegerToStringConverter());
        registry.addConverter(new StringToIpPortConverter());
        registry.addConverter(new IpPortToStringConverter());


        registry.addFormatter(new MyNumberFormatter());
    }
}
